package day_06;

public class Student {
    private long stuId;
    private int grade;
    private double score;

    public Student(long stuId, int grade, double score) {
        this.stuId = stuId;
        this.grade = grade;
        this.score = score;
    }

    public Student() {
    }

    public long getStuId() {
        return stuId;
    }

    public void setStuId(long stuId) {
        this.stuId = stuId;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
