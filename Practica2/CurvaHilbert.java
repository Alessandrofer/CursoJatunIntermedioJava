
/**
 * Write a description of class CurvaHilbert here.
 * 
 * @Alejandro Ozuna
 * @v.1.0
 */
public class CurvaHilbert{
    public int calcularLineaNivel (int nivel){
        if(nivel == 1){
            return 3;
        }else{
            if(nivel%2 == 0){
                return (calcularLineaNivel(nivel-1)*3)+4;
            }else{
                return calcularLineaNivel(nivel-1)*3;
            }
        }
    }
}
