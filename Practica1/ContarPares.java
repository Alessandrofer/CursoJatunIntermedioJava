
/**
 * Write a description of class ContarPares here.
 * 
 * @author Alejandro Ozuna 
 * @version 1.0
 */
public class ContarPares{
    public int contarDigitosPares(int numero){
        int resultado = buscarNumPar(numero % 10);
        int numActual = numero / 10;
        if(numActual > 0){
            resultado = resultado + contarDigitosPares(numActual);
        }
        return resultado;
    }

    private int buscarNumPar(int numAux){
        int res = 0;
        if(numAux % 2 == 0){
            res = 1;
        }
        return res;
    }
}
