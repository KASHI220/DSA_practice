package practice;

import javax.naming.LimitExceededException;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class CreaateingLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(2);
        list.add(4);
        list.add(45);
        list.addLast(47);
        list.add(356);

        System.out.println(list);

        list.removeFirst();
        System.out.println(list);
        list.addFirst(32);
        list.removeLast();
        System.out.println(list);
        try {
            Scanner sc =new Scanner(System.in);
            System.out.println("enter the index you want to get the details form the linkedList :");
            int i = sc.nextInt();
            System.out.println(list.get(i));
        } catch (IndexOutOfBoundsException e) {

            System.out.println("by defoult " + e);

        }catch (InputMismatchException e){
            System.out.println("Enter the integer only  "+e);
        }
    }
}
