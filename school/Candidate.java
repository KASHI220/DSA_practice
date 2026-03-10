package school;

public class Candidate {


    private String name;
    private int rollNum;
    private int[] marks;
    private float avg;
    String clg = "XYZ";


    public Candidate(String name) {
        this.name = name;
    }

    public Candidate(String name, int rollNum, int[] marks, float avg, String clg) {
        this.name = name;
        this.rollNum = rollNum;
        this.marks = marks;
        this.avg = avg;
    }

    public String getName() {
        return this.name;
    }

    public int getrollNum() {
        return this.rollNum;
    }

    public int[] getMarks() {
        return this.marks;
    }

    public float getAvg() {
        return this.avg;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

}
