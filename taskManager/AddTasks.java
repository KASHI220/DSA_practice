package taskManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddTasks {
    public static void main(String[] args){
        List<Basics> task =new ArrayList<Basics>();
        AddTasks obj =new AddTasks();
        obj.createTasks(task);
        obj.display(task);
        SelectionTask select =new SelectionTask();
        select.selectTask(task);
    }
     public void createTasks(List<Basics> task){
        Scanner sc =new Scanner(System.in);
        System.out.println("WELLCOME TO TASK MANAGER.....");
        int choice;
        do{
            System.out.println("ENTER YOUR SCHEDULE:");
            String event =sc.next();
            System.out.println("ENTER THE NO.OF DAYS LEFT TO COMPLETE IT ..");
            int days= sc.nextInt();
            Basics program =new Basics(days,event);
            task.add(program);

            System.out.println("IF YOU WANT ADD MORE TASKS THE PRESS '1' OR TO EXIT PRESS '0' ..");
            choice =sc.nextInt();

        }while(choice!=0);


     }
     public void display(List<Basics> task){
        for(Basics jai : task){
            System.out.println(jai);
        }
     }
}
