
/**
 * Write a description of class RamasArboles here.
 * 
 * @Alejandro Ozuna
 * @v1.0
 */
public class RamasArboles{
    public int contarRamas(int nivel){
        if(nivel == 1){
            return 1;
        }else{
            return contarRamas(nivel-1) + (int)Math.pow(2,nivel-1);
        }
    }
}
