
/**
 * Write a description of class InvertirNumero here.
 * 
 * @Alejandro Ozuna 
 * @1.0
 */
public class InvertirNumero{
    public int invertirNum(int num){
        int n = contarDigitos(num);
        int aux = (int)(Math.pow(10,n-1));
        return invertirNum(num, aux);
    }

    private int invertirNum(int numero, int aux){
        int res;
        if(numero<10){
            res = numero;
        }else{
            int dig = numero%10;
            res = (dig*aux)+invertirNum(numero/10, aux/10);
        }
        return res;
    }

    private int contarDigitos(int num){
        if(num<10){
            return 1;
        }else{
            return 1+contarDigitos(num/10);
        }
    }
}
