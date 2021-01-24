package day_15;

/**
 * @author xiaoxia
 * @create 2020/12/9 9:57 上午
 */
public class EnumTest {
    private final String name;
    private final String age;

    private EnumTest(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public static final EnumTest SPRING = new EnumTest("", "");
    public static final EnumTest SUMMER = new EnumTest("","");
    public static final EnumTest FALL = new EnumTest("","");
    public static final EnumTest WINTER = new EnumTest("","");

    @Override
    public String toString() {
        return "EnumTest{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
