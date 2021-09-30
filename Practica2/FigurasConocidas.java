
/**
 * Write a description of class FigurasConocidas here.
 * 
 * @Alejandro Ozuna
 * @v1.0
 */
public class FigurasConocidas{
    public int contarEstrellas(int nivel){
        if(nivel==1){
            return 1;
        }else{
            return (contarEstrellas(nivel-1)*4)+2;
        }
    }
}
