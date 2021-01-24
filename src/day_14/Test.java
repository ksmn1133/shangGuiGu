package day_14;

/**
 * @author xiaoxia
 * @create 2020/12/4 3:53 下午
 */
public class Test {
    @org.junit.jupiter.api.Test
    public void method(){
        String str = "afffcdef";
        String str1 ="af";
        int count = 0;
        if(!str.contains(str1)){
            System.out.println(0);
        }else{
            for(int i =0;i<str1.length();i++){
                for(int j  = 0 ;j< str.length();j++){

                    if (str1.toCharArray()[i] == str.toCharArray()[j]){

                    }
                }
                count++;
            }
        }





    }
}

