package taskManager;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class SelectionTask {
//    public void selectTask(List<PersonalTasks> tasks) {
//        Scanner pc = new Scanner(System.in);
////        int choice;
//        System.out.println("TASKS YOU WERE ADDED....");
//        for (int i = 0; i < tasks.size(); i++) {
//
//            System.out.println(i + 1 + ".  " + tasks.get(i).getTask());
//        }
//        System.out.println("ENTER '0' TO REMOVE  OR '1' ADD TO LIST ");
//        int jai = pc.nextInt();
//        if (jai == 0) {
//            System.out.println("enter the index number that you want to remove");
//            int j = pc.nextInt();
//            tasks.remove(tasks.get(j - 1));
////            AddTasks addingNewTask = new AddTasks();
////            addingNewTask.display(tasks);
//        } else if (jai == 1) {
//            AddTasks addingNewTask = new AddTasks();
//            addingNewTask.createTasks(tasks);
//            addingNewTask.display(tasks);
//
//        } else {
//            System.out.println("enter the correct index or option");
//        }
//

    /// /        for (Basics j : tasks) {
    /// /            System.out.println(tasks);
    /// /        }
//    }
    public void selectTask(List<Basics> task) {
        int choice = -1;
        do {
            Scanner pc = new Scanner(System.in);

            System.out.println("TASKS YOU WERE ADDED....");
            for (int i = 0; i < task.size(); i++) {
                System.out.println((i + 1) + ". " + task.get(i));
            }
            try {

                System.out.println("ENTER '0' TO REMOVE OR '1' TO ADD OR 2 TO EXIT");
                choice = pc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("enter the Above mentioned input only ...  " + e);
                pc.next();
                continue;
            }

            if (choice == 0) {
                System.out.println("Enter index to remove:");
                int j = pc.nextInt();

                if (j > 0 && j <= task.size()) {
                    task.remove(j - 1);
                } else {
                    System.out.println("Invalid index");
                }

            } else if (choice == 1) {
                CreateTasks addingNewTask = new CreateTasks();
                Scanner sc = new Scanner(System.in);
                int option;
                System.out.println("ENTER THE TASK TYPE..");
                System.out.println("1.BASIC TASKS...");
                System.out.println("2.PERSONAL TASKS...");
                option = sc.nextInt();
                CreateTasks obj = new CreateTasks();
                if (option == 1) {
//            CreateTasks obj = new CreateTasks();
                    obj.createTaskBasic(task);
                } else if (option == 2) {

                    obj.createTasksPersonal(task);
                }
//                addingNewTask.createTasks(tasks);
//        } else if(choice== 2) {
//            System.out.println("THANK YOU......");
//        }

            } else {
                System.out.println("ENTER THE CORRECT INPUT (AS ABOVE MENTIONED)");
            }
        } while (choice != 2);
    }
}