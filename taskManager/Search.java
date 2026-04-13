package taskManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Search {
    public List<Basics> searchInList(List<Basics> task) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("search here...");
        str = sc.next();
        List<Basics> result =new ArrayList<>();
        int i = 0;
        while (i < task.size()) {
            if(str.equalsIgnoreCase(task.get(i).getTask())){
                result.add(task.get(i));
            }
            i++;
        }
        if(result.isEmpty()) System.out.println("NO RESULT IS FOUND");
        return result;
    }
}