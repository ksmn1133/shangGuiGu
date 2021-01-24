package day_11;

public class StaticPerson {
    private String name;
    private int age;
    private static String desc;

    //代码块,随着创建对象时被执行，每创建一个对象就会被执行一次,可以在创建对象的时候，对所创建的对象的属性进行初始化操作

    /**
     *
     * 对属性可以赋值的位置
     * 1、默认初始化赋值：0 0.0 null \u0000 false
     * 2、显示初始化 int age = 10;
     * 3、在代码块中赋值
     * 4、构造器中赋值
     * 5、对象.属性 对象.方法赋值
     *
     *
     *
     * */
    {
        System.out.println("hello");
    }
    //静态代码块，在类加载时会执行，（静态变量，静态方法）,有且只有一次，在一个类中可以定义多个静态代码块，
    // 且按照其先后顺序执行

    static {
        System.out.println("nihao");
    }

    public StaticPerson() {

    }

    public StaticPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getDesc() {
        return desc;
    }

    public static void setDesc(String desc) {
        StaticPerson.desc = desc;
    }

    public void eat() {
        System.out.println("eating");
    }

    @Override
    public String toString() {
        return "StaticPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
