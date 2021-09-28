
/**
 * Practica 1. Ejercicio 6
 * 
 * @author Alejandro Ozuna 
 * @version 1.0
 */
public class Division{
    public int dividir(int n, int m){
        int res;
        if(n == m){
            res = 1; 
        }else{
            if(n < m){
                res = 0;
            }else{
                res = dividir(n - m, m) + 1;
            }
        } 
        return res;
    }
    
    public int dividir2(int n, int m){
        if(n == m){
            return 1; 
        }else{
            if(n < m){
                return 0;
            }else{
                return dividir(n - m, m) + 1;
            }
        } 
    }
}

