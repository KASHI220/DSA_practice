package taskManager;

import java.util.Scanner;

public class Basics {
    //    private String name;
    private int deadTime;
    private String task;

    public Basics(int deadTime, String task) {
//        this.name = name;
//        Scanner sc =new Scanner(System.in);
        this.deadTime = deadTime;
        this.task = task;
    }

    public int getDeadTime() {
        return this.deadTime;
    }

    public String getTask() {
        return this.task;
    }

    @Override
    public String toString() {
        return "Task :" + task + " |  Days Left  : " + deadTime;
    }
}