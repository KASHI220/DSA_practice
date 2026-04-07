package practice;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class CreateLinkedList {

    private static class Node {
        private int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node head, tail;
    private int size;

    public CreateLinkedList() {
        this.head = null;
        this.tail = null;
        size = 0;
    }

    public static void main(String[] args) {
        CreateLinkedList list = new CreateLinkedList();
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        while (choice == 1) {
            System.out.println("Enter 1 to add number OR  any number to exit..");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Add value to the list..");
                int value = sc.nextInt();
                list.add(value);
            } else {
                System.out.println(" Thank you...");
            }
        }
        list.display();
        list.removeHead();
        list.display();

    }

    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {


            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;

        }
        size++;
    }

    public void removeHead() {
        if (head == null) {
            System.out.println("list is empty..");
        }
        head = head.next;
        size--;
    }

    public void display() {

        Node temp = head;
        if (temp == null) {
            System.out.println("List is empty..");
        }
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp=temp.next;
        }
        System.out.println("size of list is:  " + size);
    }
}