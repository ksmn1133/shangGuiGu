package day_11;

public final class FinalClass {
    final int AGE = 10;
    final int num1;
    final int num2;

    public final void test() {
        final int num = 10;
    }

    //代码块中对final修饰的变量进行初始化，
    {
        num1 = 2;
    }
    //在构造方法中对 被final修饰的成员变量进行初始化操作，如果每个对象的属性值不一样 可以采用此方式
    public FinalClass(int n){
        num2 = n;
    }




}
