package DSA_practice.dsa;

public class LinkedLIst {
    static class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
            next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LinkedLIst() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insert(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedLIst list = new LinkedLIst();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.display();
        boolean result = list.searchList(1);
        System.out.println(result);

    }

    public boolean searchList(int num) {
        Node temp = head;
        boolean isFound = false;
        while (temp != null) {

            if (temp.val == num) {
                isFound = true;
            }
            temp = temp.next;
        }
        return isFound;
    }

}
