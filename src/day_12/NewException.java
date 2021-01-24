package day_12;

/**
 * @author xiaoxia
 * @create 2020/11/27 2:14 下午
 */
public class NewException {
    private int grade;

    public void show(int grade) throws Exception {
        if(grade>=0){
            System.out.println(grade);
        }else{
            throw new MyException("this is a wrong number Exception!");
        }


    }
}
