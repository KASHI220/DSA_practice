package taskManager;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CreateTasks {
    public void createTasksPersonal(List<Basics> task) {

        Scanner sc = new Scanner(System.in);
        System.out.println("WELLCOME TO TASK MANAGER.....");

        int choice;
        int days=0;

        do {
            try {
                System.out.println("ENTER YOUR SCHEDULE:");
                String event = sc.next();
                try {
                    System.out.println("ENTER THE NO.OF DAYS LEFT TO COMPLETE IT ..");
                     days = sc.nextInt();
                }
                catch (InputMismatchException e){
                    System.out.println("ENTER THE CORRECT INPUT "+ e);
                    sc.next();
                    choice=1;
                }
                System.out.println("ENTER THE PROGRESS OF YOU TASK");
                String prog = sc.next();
                System.out.println("ENTER NOTE OF TASK");
                String no = sc.next();
//
                PersonalTasks program1 = new PersonalTasks(days, event, prog, no);
                task.add(program1);

                System.out.println("IF YOU WANT ADD MORE TASKS THE PRESS '1' OR TO EXIT PRESS '0' ..");
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("input miss match" + e);
                System.out.println("Invalid input. Enter numbers only.");
                sc.next(); // correct way to clear input
                choice = 1;// clear wrong input

            }


        } while (choice != 0);
    }

    public void createTaskWork(List<Basics> task) {

        Scanner sc = new Scanner(System.in);
        System.out.println("WELLCOME TO TASK MANAGER.....");

        int choice;

        do {
            try {
                System.out.println("ENTER YOUR SCHEDULE:");
                String event = sc.next();
                System.out.println("ENTER THE NO.OF DAYS LEFT TO COMPLETE IT ..");
                int days = sc.nextInt();
                System.out.println("ENTER THE MEETINGS...");
                String meet = sc.next();
                System.out.println("ENTER TIME OF MEETING");
                int time = sc.nextInt();
//
                WorkTask program2 = new WorkTask(days, event, meet,time);
                task.add(program2);

                System.out.println("IF YOU WANT ADD MORE TASKS THE PRESS '1' OR TO EXIT PRESS '0' ..");
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("input miss match" + e);
                System.out.println("Invalid input. Enter numbers only.");
                sc.next(); // correct way to clear input
                choice = 1;// clear wrong input

            }


        } while (choice != 0);
    }

    public void createTaskBasic(List<Basics> task) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELLCOME TO TASK MANAGER.....");
        int choice;

        do {
            try {
                System.out.println("ENTER YOUR SCHEDULE:");
                String event = sc.next();
                System.out.println("ENTER THE NO.OF DAYS LEFT TO COMPLETE IT ..");
                int days = sc.nextInt();
//                System.out.println("ENTER THE PROGRESS OF YOU TASK");
//                String prog = sc.next();
//                System.out.println("ENTER NOTE OF TASK");
//                String no = sc.next();
                Basics program = new Basics(days, event);
                task.add(program);
//                PersonalTasks program1 = new PersonalTasks(days, event, prog, no);
//                task.add(program1);

                System.out.println("IF YOU WANT ADD MORE TASKS THE PRESS '1' OR TO EXIT PRESS '0' ..");
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("input miss match" + e);
                System.out.println("Invalid input. Enter numbers only.");
                sc.next(); // correct way to clear input
                choice = 1;// clear wrong input

            }


        } while (choice != 0);
    }
}
