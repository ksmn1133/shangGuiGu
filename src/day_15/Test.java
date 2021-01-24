package day_15;

/**
 * @author xiaoxia
 * @create 2020/12/9 10:07 上午
 */
public class Test {
    public static void main(String[] args) {
        Season[] values = Season.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

        Season summer = Season.valueOf("SUMMER");
        System.out.println(summer);

        Season summer1 = Season.SUMMER;
        System.out.println(summer1);

        Season.SUMMER.run();



    }
    @MyAnnotation(value = {"",""})
    public void method(){

    }


}
