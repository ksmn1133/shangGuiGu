package day_12;

/**
 * @author xiaoxia
 * @create 2020/11/27 2:53 下午
 */
public class EcmDef {
    public double ecm(double num1 ,double num2) throws Exception{
        if(num1>=0&&num2>0){
            return num1/num2;
        }else{
            throw new NegativenNumberException("the number can not be negative!");
        }

    }
}
