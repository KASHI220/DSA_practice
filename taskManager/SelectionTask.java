package taskManager;

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
    public void selectTask(List<Basics> tasks) {
        Scanner pc = new Scanner(System.in);

        System.out.println("TASKS YOU WERE ADDED....");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }

        System.out.println("ENTER '0' TO REMOVE OR '1' TO ADD");
        int choice = pc.nextInt();

        if (choice == 0) {
            System.out.println("Enter index to remove:");
            int j = pc.nextInt();

            if (j > 0 && j <= tasks.size()) {
                tasks.remove(j - 1);
            } else {
                System.out.println("Invalid index");
            }

        } else if (choice == 1) {
            AddTasks addingNewTask = new AddTasks();
            addingNewTask.createTasks(tasks);
        } else {
            System.out.println("Enter correct option");
        }
    }
}
