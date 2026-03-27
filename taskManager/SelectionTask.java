package taskManager;

import java.util.List;
import java.util.Scanner;

public class SelectionTask {
    public void selectTask(List<Basics> tasks) {
        Scanner pc = new Scanner(System.in);
//        int choice;
        System.out.println("TASKS YOU WERE ADDED....");
        for (int i = 0; i < tasks.size(); i++) {

            System.out.println(i + 1 + ".  " + tasks.get(i).getTask());
        }
        System.out.println("ENTER '0' TO REMOVE  OR '1' ADD TO LIST ");
        int jai = pc.nextInt();
        if (jai == 0) {
            System.out.println("enter the index number that you want to remove");
            int j = pc.nextInt();
            tasks.remove(tasks.get(j - 1));
        } else if (jai == 1) {
            AddTasks addingNewTask = new AddTasks();
            addingNewTask.createTasks(tasks);

        } else {
            System.out.println("enter the correct index or option");
        }

        for (Basics j : tasks) {
            System.out.println(tasks);
        }
    }

}
