package taskManager;

import java.util.Collections;
import java.util.List;

public class FirstPriority {
    public void priority(List<Basics> task) {

        System.out.println("TASK YOU SHOULD ACHIVE FIRST ARE.....,");
        for (int i = 0; i < task.size() - 1; i++) {
            for (int j = 0; j < task.size() - i - 1; j++) {
                if (task.get(j).getDeadTime() > task.get(j + 1).getDeadTime()) {
                    Basics temp = task.get(j);
                    task.set(j ,task.get(j + 1));
                    task.set(j + 1 , temp);
                }
            }
        }
    }
}
