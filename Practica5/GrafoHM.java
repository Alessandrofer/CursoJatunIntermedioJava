/**
 * Write a description of class GrafoHM here.
 * 
 * @Alejandro Ozuna
 * @v1.0
 */
import java.util.HashMap;
import java.util.*;
public class GrafoHM{
    private HashMap<String, LinkedList<Nodo>> grafo;
    private boolean dirigido;

    public GrafoHM(boolean valor){
        grafo = new HashMap<>();
        dirigido = valor;
    }

    public void agregarArista(String origen, String destino, int costo){
        crearArista(origen,destino,costo);
        if(!dirigido){
            crearArista(destino,origen,costo);
        }
    }

    private void crearArista(String origen, String destino, int costo){
        Nodo nuevo = new Nodo(destino,costo);
        if(!grafo.containsKey(origen)){
            grafo.put(origen, new LinkedList<>());
        }        
        LinkedList<Nodo> vecinos = grafo.get(origen);
        vecinos.add(nuevo);
    }

    public void bfsAmplitud(String raiz){
        Queue<Nodo> cola = new LinkedList<>();
        TreeSet<String> visitados = new TreeSet<>();
        cola.offer(new Nodo(raiz,0));
        while(!cola.isEmpty()){
            Nodo actual = cola.poll();
            String vertice = actual.getVertice();
            if(visitados.add(vertice)){
                System.out.print(vertice+" ");
                LinkedList<Nodo> vecinos = grafo.get(vertice);
                cola.addAll(vecinos);
            }
        }
    }

    public void dfsProfundidad(String raiz){
        Stack<Nodo> pila = new Stack<>();
        TreeSet<String> visitados = new TreeSet<>();
        pila.push(new Nodo(raiz,0));
        while(!pila.isEmpty()){
            Nodo actual = pila.pop();
            String vertice = actual.getVertice();
            if(visitados.add(vertice)){
                System.out.print(vertice+" ");
                LinkedList<Nodo> vecinos = grafo.get(vertice);
                pila.addAll(vecinos);
            }
        }
    }

    public void deleteVertice(String vertice){
        LinkedList<Nodo> lista = grafo.get(vertice);
        LinkedList<String> llegada = new LinkedList<>();
        for(Nodo n : lista){
            llegada.add(n.getVertice());
        }
        grafo.remove(vertice);
        for(String s : llegada){
            deleteArista(s,vertice);
        }
    }

    public void deleteArista(String origen, String destino){
        deleteArista2(origen,destino);
        if(!dirigido){
            deleteArista2(destino,origen);
        }
    }
    public void deleteArista2(String origen, String destino){
        LinkedList<Nodo> lista = grafo.get(origen);
        boolean estado = false;
        if(lista !=null){
            for(int i=0; i<lista.size() && estado; i++){
                Nodo pres = lista.get(i);
                if(pres.getVertice().equals(destino)){
                    lista.remove(i);
                    estado = true;
                }
            }
        }
    }
}

