/**
 * Write a description of class AlfombraSierpinski here.
 *  
 * @Alejandro Ozuna
 * @v.1.0
 */
public class AlfombraSierpinski{
    public int calcularCuadradoBlancos(int nivel){
        if(nivel==1){
            return 1;
        }else{
            return (calcularCuadradoBlancos(nivel-1)*8)+1;
        }
    }
}
