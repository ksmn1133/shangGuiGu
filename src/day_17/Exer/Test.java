package day_17.Exer;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author xiaoxia
 * @create 2020/12/24 10:40 上午
 */
public class Test {
    public static void main(String[] args) {
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Employee && o2 instanceof Employee) {
                    Employee em1 = (Employee) o1;
                    Employee em2 = (Employee) o2;
                    if(em1.getBirthday().getYear() != em2.getBirthday().getYear()){
                        return em1.getBirthday().getYear()-em2.getBirthday().getYear();
                    }
                    if (em1.getBirthday().getMonth() != em2.getBirthday().getMonth()){
                        return em1.getBirthday().getMonth() - em2.getBirthday().getMonth();
                    }

                } else {
                    throw new RuntimeException("wrong");
                }

                return 0;
            }
        };
        TreeSet<Employee> employees = new TreeSet<>(comparator);
        employees.add(new Employee("zhangsan", 18, new MyDate(2020, 1, 20)));
        employees.add(new Employee("lisi", 11, new MyDate(2020, 2, 14)));
        employees.add(new Employee("wangwu", 30, new MyDate(1978, 10, 4)));
        employees.add(new Employee("zhaoliu", 27, new MyDate(2004, 3, 1)));

    /**
    *      Iterator<Employee> iterator = employees.iterator();
    *         while(iterator.hasNext()){
    *             System.out.println(iterator.next());
    *         }
    */
        for(Employee emp:employees){
            System.out.println(emp);
        }

    }
}
