package taskManager;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Basics> task = new ArrayList<Basics>();
        CreateTasks obj = new CreateTasks();
        int option;

        do {
            try {
                System.out.println("ENTER THE TASK TYPE..");
                System.out.println("1.BASIC TASKS...");
                System.out.println("2.PERSONAL TASKS...");
                System.out.println("3.WORK TASKS...");
                System.out.println("0.EXIT...");
                option = sc.nextInt();

                if (option == 1) {
//            CreateTasks obj = new CreateTasks();
                    obj.createTaskBasic(task);
                } else if (option == 2) {

                    obj.createTasksPersonal(task);
                } else if (option == 3) {
                    obj.createTaskWork(task);
                }
            } catch (InputMismatchException e) {
                System.out.println("ENTER THE VALID INPUT " + e);
                sc.next();
                option = 1;
            }
        } while (option != 0);


        SelectionTask select = new SelectionTask();
        select.selectTask(task);
        Main obj1 = new Main();

        obj1.display(task);

        FirstPriority obj2 = new FirstPriority();
        obj2.priority(task);

        obj1.display(task);

        Search obj3 = new Search();
        List<Basics> jai = obj3.searchInList(task);
        System.out.println(jai);
    }


    public void display(List<Basics> task) {
        for (Basics jai : task) {
            System.out.println(jai);
        }
    }
}
