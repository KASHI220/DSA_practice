package practice;

public class CreateLinkedList<T> {
    private Node<T> head, tail;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        T removedData;
        if (index == 0) {
            removedData = head.data;
            head = head.next;
            if (head == null) {
                tail = null;
            }
        } else {
            Node<T> prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            Node<T> target = prev.next;
            removedData = target.data;
            prev.next = target.next;

            if (prev.next == null) {
                tail = prev;
            }
        }
        size--;
        return removedData;
    }

    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
        System.out.println("Current Size: " + size);
    }

    public static void main(String[] args) {
        CreateLinkedList<String> list = new CreateLinkedList<>();
        list.add("Jai");
        list.add("Shree");
        list.add("Ram");

        System.out.println("Initial List:");
        list.display();

        System.out.println("\nRemoving at index 1...");
        list.remove(1);
        list.display();
    }
} // Final closing brace for the class
