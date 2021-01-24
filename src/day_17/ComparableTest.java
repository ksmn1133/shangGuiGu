package day_17;

import org.junit.Test;

/**
 * @author xiaoxia
 * @create 2020/12/28 9:26 上午
 */
public class ComparableTest {
    @Test
    public void method(){
        Emp emp = new Emp("bob",10);
        Emp emp1 = new Emp("jane",18);
        int i = emp.compareTo(emp1);
        System.out.println(i);
    }
}
