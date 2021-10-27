import java.util.Stack;
/**
 * Write a description of class BalanceSig here.
 * 
 * @Alejandro Ozuna
 * @v1.0
 */
public class BalanceSig{
    public String VerificarBalance(String cad){
        String res = "";
        Stack<Character> pila = new Stack<>();
        for(int i=0;i<cad.length();i++){
            char act = cad.charAt(i);
            if(act == '{'|| act == '[' || act == '('){
                pila.push(act);
            }else{
                char aux = pila.peek();
                if(sonOpuestos(aux,act)){
                    res = "Simbolos Balanceados";
                    pila.pop();
                }else{
                    res = "No tiene Balance";
                    i = cad.length();
                }
            }
        }
        return res;
    }

    private boolean sonOpuestos(char a, char b){
        if(a == '(' && b == ')' || a == '[' && b == ']' || a == '{' && b == '}'){
            return true;
        }else{
            return false;
        }
    }
}
