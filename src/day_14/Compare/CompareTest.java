package day_14.Compare;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author xiaoxia
 * @create 2020/12/8 9:30 上午
 */
public class CompareTest {
    @Test
    public void testComparable() {
        int i = new Mouse("a", 20).compareTo(new Mouse("b", 18));
        System.out.println(i);
        List list = new ArrayList();

        list.sort(new Mouse() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Mouse && o2 instanceof Mouse) {
                    Mouse o11 = (Mouse) o1;
                    Mouse o21 = (Mouse) o2;
                    if(o1 == o2){
                        return 0;
                    }else {
                        return o11.compareTo(o21);
                    }
                }else{
                    try {
                        throw new Exception("wrong class");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                return 0;
            }
        });
    }
}
