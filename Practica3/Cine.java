import java.util.*;
/**
 * Write a description of class Cine here.
 * 
 * @Alejandro Ozuna
 * @v1.0
 */
public class Cine{
    private Queue<Persona> fila;
    private int totalEntradas;
    public Cine(){
        fila = new LinkedList<Persona>();
        totalEntradas = 50;
    }
    
    public String atenderCliente(){
        String res = "";
        if(fila.peek() == null){
            res = "No hay clientes en fila";
        }else{
            Persona clienteActual = fila.poll();
            if(clienteActual.getEntradasRequeridas()<= totalEntradas){
                totalEntradas = clienteActual.getEntradasRequeridas();
                res = "Cliente atendendido, se vendio: " + clienteActual.getEntradasRequeridas();
                
            }else{
                res = "Cliente No atendendido, queria: " + clienteActual.getEntradasRequeridas();
            }
        }
        return res;
    }
    
    public void agregarAFila(Persona nueva){
        fila.offer(nueva);
    }
}
