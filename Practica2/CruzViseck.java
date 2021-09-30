
/**
 * Write a description of class CruzViseck here.
 * 
 * @Alejandro Ozuna 
 * @v1.0
 */
public class CruzViseck{
    public int contarPuntas(int nivel){
        if(nivel == 1){
            return 4;
        }else{
            return (contarPuntas(nivel-1)*5)-8;
        }
    }
}
