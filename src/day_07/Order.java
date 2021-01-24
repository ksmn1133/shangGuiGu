package day_07;

import day_06.AreaTest;

public class Order  {

    /**
     * 权限修饰符修饰：类、成员变量、成员方法、构造器
     */
    private int privateNum;
    int defaultNum;
    protected int protectedNum;
    public int  publicNum;

    public Order() {
    }

    public Order(int privateNum, int defaultNum, int protectedNum, int publicNum) {
        this.privateNum = privateNum;
        this.defaultNum = defaultNum;
        this.protectedNum = protectedNum;
        this.publicNum = publicNum;
    }

    private void privateMethod(){
        System.out.println("private method is executed");
    }

    void defaultMethod(){
        System.out.println("default method is executed");
    }

    protected void protectedMethod(){
        System.out.println("protected method is executed");
    }

    public void publicMethod(){
        System.out.println("public method is executed");
    }





}
