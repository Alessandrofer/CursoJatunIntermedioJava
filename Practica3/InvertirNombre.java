import java.util.Stack;
/**
 * Write a description of class InvertirNombre here.
 * 
 * @alejandro Ozuna 
 * @v 1.0
 */
public class InvertirNombre{
    private Stack<Character> pila;

    public void agregar(String palabra){
        pila = new Stack<>();
        for(int i=0; i<palabra.length();i++){
            char caracter = palabra.charAt(i);
            pila.push(caracter);
        }
    }

    public String Invertir(){
        String res = "";
        while(!pila.empty()){
            char caracterAux = pila.pop();
            res = res + caracterAux;
        }
        return res;
    }
}
