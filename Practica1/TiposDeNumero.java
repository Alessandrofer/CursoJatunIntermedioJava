
/**
 * Write a description of class TiposDeNumero here.
 * 
 * @Alejandro Ozuna
 * @1.0
 */
public class TiposDeNumero{
    public String verificarNum(int num){
        String res;
        int sumatoriaDivisores = sumarDivisores(num,1);
        if(sumatoriaDivisores == num){
            res = "Numero Perfecto";
        }else{
            if(sumatoriaDivisores > num){
                res = "Numero Abundante";
            }else{
                res = "Numero Defectivo";
            }
        }
        return res;
    }

    private int sumarDivisores(int num, int div){
        int res;
        if(div <= (num/2)){
            if(num%div ==0){
                res = div+sumarDivisores(num, div+1);
            }else{
                res= sumarDivisores(num, div+1);
            }
        }else{
            res = 0;
        }
        return res;
    }
}

