package taskManager;

import java.sql.SQLOutput;
import java.util.*;

public class AddTasks {
    public static void main(String[] args) {
        List<Basics> task = new ArrayList<Basics>();
        AddTasks obj = new AddTasks();
        obj.createTasks(task);

//        SelectionTask select = new SelectionTask();
//        select.selectTask(task);
//        List<PersonalTasks> personal = new ArrayList<PersonalTasks>();

        PersonalTasks jai1 = new PersonalTasks(4, "read", "gooing will", "it should be done with cution");
        task.add(jai1);
        PersonalTasks jai2 = new PersonalTasks(3, "study", "gooing will", "it should be done with cution");
        task.add(jai2);
        SelectionTask select = new SelectionTask();
        select.selectTask(task);
//        for(PersonalTasks p : task)
//        {
//            System.out.println(p);
//        }
        obj.display(task);
    }

    public void createTasks(List<Basics> task) {

        Scanner sc = new Scanner(System.in);
        System.out.println("WELLCOME TO TASK MANAGER.....");
        int choice;

        do {
            try {
                System.out.println("ENTER YOUR SCHEDULE:");
                String event = sc.next();
                System.out.println("ENTER THE NO.OF DAYS LEFT TO COMPLETE IT ..");
                int days = sc.nextInt();
                Basics program = new Basics(days, event);
                task.add(program);

                System.out.println("IF YOU WANT ADD MORE TASKS THE PRESS '1' OR TO EXIT PRESS '0' ..");
                choice = sc.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("input miss match" + e);
                System.out.println("Invalid input. Enter numbers only.");
                sc.next(); // correct way to clear input
                choice = 1;// clear wrong input

            }


        } while (choice != 0);
    }

    public void display(List<Basics> task) {
        for (Basics jai : task) {
            System.out.println(jai);
        }
    }
}
