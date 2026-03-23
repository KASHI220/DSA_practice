package shopping;

import java.util.List;
import java.util.Scanner;

public class UserSelection {

    public int[] selectItem(List<ItemList> itemList) {
        Scanner sc = new Scanner(System.in);
        int[] units = new int[itemList.size()];
        int choice;

        do {
            System.out.println("\nSelect item number:");
            for (int i = 0; i < itemList.size(); i++) {
                System.out.println((i + 1) + ". " + itemList.get(i).getName());
            }
            System.out.println("0. Exit");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter quantity: ");
                    units[0] += sc.nextInt();
                    break;

                case 2:
                    System.out.print("Enter quantity: ");
                    units[1] += sc.nextInt();
                    break;

                case 3:
                    System.out.print("Enter quantity: ");
                    units[2] += sc.nextInt();
                    break;

                case 0:
                    System.out.println("Selection finished.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        return units;
    }

    public void totalPayable(List<ItemList> itemList, int[] units) {
        int total = 0;

        System.out.println("\n------ BILL ------");

        for (int i = 0; i < itemList.size(); i++) {
            if (units[i] > 0) {
                int cost = itemList.get(i).getPrice() * units[i];
                total += cost;

                System.out.println(itemList.get(i).getName() +"    "+itemList.get(i).getPrice()+ "  "+
                        " x " + units[i] + " = " + cost);
            }
        }

        System.out.println("------------------");
        System.out.println("Total Amount: " + total);
    }
}