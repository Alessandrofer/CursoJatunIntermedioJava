import java.util.*;
/**
 * Practica Arbol Binario(1)
 * 
 * @Alejandro Ozuna 
 * @v1.0
 */
public class ArbolBin<T>{
    private T raiz;
    private ArbolBin<T> izq;
    private ArbolBin<T> der;
    public ArbolBin(){
        raiz = null;
        izq = null; 
        der = null;
    }

    public boolean estaVacio(){
        return raiz==null;
    }

    public void addAmplitud(T dato){
        Queue<ArbolBin<T>> cola = new LinkedList<>();
        cola.offer(this);
        addAmplitud(dato,cola);
    }

    private void addAmplitud(T dato, Queue<ArbolBin<T>> cola){
        ArbolBin<T> act = cola.poll(); 
        if(act.estaVacio()){
            act.raiz = dato;
            act.izq = new ArbolBin<T>();
            act.der = new ArbolBin<T>();
        }else{
            cola.add(act.izq);
            cola.add(act.der);
            addAmplitud(dato,cola);
        }
    }

    public int contarNodosHoja(){
        int res;
        if(!estaVacio()){
            if(esHoja()){
                res = 1;
            }else{
                res = izq.contarNodosHoja() + der.contarNodosHoja();
            }
        }else{
            res = 0;
        }
        return res;
    }

    private boolean esHoja(){
        return izq.estaVacio() && der.estaVacio();
    }

    public void mostrarNodosDelNivelN(int nivel){
        if(!estaVacio()){
            if(nivel==0){
                System.out.print(raiz+" ");
            }else{
                izq.mostrarNodosDelNivelN(nivel-1);
                der.mostrarNodosDelNivelN(nivel-1);
            }
        }
    }

    public boolean contains(T dato){
        boolean res = false;
        if(!estaVacio()){
            if(raiz == dato){
                res = true;
            }else{
                res = izq.contains(dato);
                if(res==false){
                    res = der.contains(dato);
                }
            }
        }
        return res;
    }

    public void remove(T dato){
        if(!estaVacio()){ 
            if(dato == this.raiz && esHoja()){
                contains(dato);
                raiz = null;
                izq = null;
                der = null;
            }else{
                izq.remove(dato);
                der.remove(dato);
            }
        }
    }

    public int contarNodosDeUnHijo(){
        int res;
        if(!estaVacio()){
            if((!izq.estaVacio()&& der.estaVacio())||(izq.estaVacio()&& !der.estaVacio())){
                res=1;
            }else{
                res = izq.contarNodosDeUnHijo() + der.contarNodosDeUnHijo();
            }
        }else{
            res=0;
        }
        return res;
    }
}