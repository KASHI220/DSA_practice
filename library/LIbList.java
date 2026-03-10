package library;

import java.util.ArrayList;
import java.util.List; // Added missing import

public class LIbList {
    public static void main(String[] args) {
        int n = 7;
        List<Books> bookList = new ArrayList<>(); // Renamed for clarity

        LIbList ls = new LIbList();
        ls.createLib(n, bookList); // Pass the correct variable name
        ls.display(bookList);

        // Optional: Print the results to see if it worked
        System.out.println("Books in library: " + bookList.size());
    }

    // Changed 'class' to 'void' to make this a proper method
    public void createLib(int n, List<Books> libList) {
        for (int i = 0; i < n; i++) {
            // Ensure your Books class has a constructor matching these 4 arguments
            Books book = new Books("A world of wonder", i*350, 1991 , "Raj");
            libList.add(book);
        }
    }
    public void display(List<Books> bookList){
        for (Books b : bookList) {
            System.out.println("Book name :" + b.getBookName() + "  " + "Price = " + b.getPrice() + "  " + "Publish Year =" + b.getPub_year() + "  " + "Auther =:" + b.getAuther());
        }
    }
}
