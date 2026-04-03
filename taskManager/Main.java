package taskManager;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Basics> task = new ArrayList<Basics>();
        int option;
        System.out.println("ENTER THE TASK TYPE..");
        System.out.println("1.BASIC TASKS...");
        System.out.println("2.PERSONAL TASKS...");
        option= sc.nextInt();
        CreateTasks obj =new CreateTasks();
        if(option==1){
//            CreateTasks obj = new CreateTasks();
            obj.createTaskBasic(task);
        } else if (option==2) {

            obj.createTasksPersonal(task);
        }


        SelectionTask select =new SelectionTask();
        select.selectTask(task);
        Main obj1 =new Main();

        obj1.display(task);

    }



    public void display(List<Basics> task) {
        for (Basics jai : task) {
            System.out.println(jai);
        }
    }
}
