
/**
 * Write a description of class VerificarNumero here.
 * 
 * @author Alejandro Ozuna
 * @version 1.0
 */
public class VerificarNumero{
    public String verificar(int numero){
        int cantNum = indicaNum(numero);
        String res = "";
        if (cantNum % 2 == 0){
            res = "Malvado";
        }else{
            res = "Odioso";
        }
        return res;
    }

    private int indicaNum(int numero){
        int cont;
        if(numero>0){
            if((numero%10)==1){
                cont = 1 + indicaNum(numero/10);
            }else{
                cont = indicaNum(numero/10);
            }
        }else{
            cont = 0;
        }
        return cont;
    }
}

