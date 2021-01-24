package day_06;

public class Test {
    public static void main(String[] args) {
        Student[] arrayStu = new Student[20];
        for (int i = 0; i < 20; i++) {
            arrayStu[i] = new Student();
            arrayStu[i].setStuId(i);
            arrayStu[i].setScore(Math.random()*100);
            arrayStu[i].setGrade((int)(Math.random()*100));

        }

        for(int i =0;i<arrayStu.length;i++){
            if(arrayStu[i].getGrade()==3){
                System.out.println(arrayStu[i].getStuId()+"\t"+arrayStu[i].getScore());
            }
        }


    }

}
