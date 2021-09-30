/**
 * Write a description of class TrianguloSierpinski here.
 * 
 * @Alejandro Ozuna
 * @1.0
 */
public class TrianguloSierpinski{
    public int contarTriangulos(int nivel){
        if(nivel == 1){
            return 1;
        }else{
            return (contarTriangulos(nivel-1)*3)+2;
        }
    }
}
