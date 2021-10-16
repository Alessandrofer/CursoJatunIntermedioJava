import java.util.Stack;
/**
 * Write a description of class Llaves here.
 * 
 * @Alejandro Ozuna 
 * @v1.0
 */
public class Llaves{
    private Stack<Integer> pila;
    public String numerarLlaves(String cad){
        String res = "";
        pila = new Stack<>();
        int marca = 1;
        for(int i=0; i<cad.length();i++){
            char act = cad.charAt(i);
            if(act=='{'){
                res = res+" "+marca;
                pila.push(marca);
                marca++;
            }else{
                if(act == '}'){
                    res = res+" "+pila.pop();
                }
            }
        }
        return res;
    }
}
