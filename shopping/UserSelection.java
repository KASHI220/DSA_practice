package shopping;

import java.util.List;
import java.util.Scanner;

public class UserSelection {
    public void selectItem(List<ItemList> itemList) {
        String choice = "yes";


        while (choice.equalsIgnoreCase("yes")) {
            System.out.println("Select items..");
            System.out.println(" ");
            System.out.println("1. Parle-g");
            System.out.println("2. Hide & Seek");
            System.out.println("3. Good Day");
            System.out.println("Enter you option ..");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("The price of Parle-g is : " + itemList.get(0).getPrice());
                    System.out.println("how much you want  :");
                    int unit1 = sc.nextInt();
                    if (unit1 > itemList.get(0).getQuantityLeft()) {
                        System.out.println("Sorry... We have only " + itemList.get(0).getQuantityLeft() + "Parle-g packs");
                        continue;
                    }
                    else {
                        System.out.println("You purchased " + unit1 + " Parle-g.");
                    }

                    break;
                case 2:
                    System.out.println("The price of Hide & Seek is : " + itemList.get(1).getPrice());
                    System.out.println("how much you want  :");
                    int unit2 = sc.nextInt();
                    if (unit2 > itemList.get(1).getQuantityLeft()) {
                        System.out.println("Sorry... We have only " + itemList.get(1).getQuantityLeft() + "Hide & Seek packs");
                        continue;
                    }
                    else {
                        System.out.println("You purchased " + unit2 + " Hide & Seek.");
                    }
                    break;
                case 3:
                    System.out.println("The price of Good Day is : " + itemList.get(2).getPrice());
                    System.out.println("how much you want  :");
                    int unit3 = sc.nextInt();
                    if (unit3 > itemList.get(2).getQuantityLeft()) {
                        System.out.println("Sorry... We have only " + itemList.get(2).getQuantityLeft() + " Good Day packs.");
                        continue;
                    } else {
                        System.out.println("You purchased " + unit3 + " Good Day.");
                    }
                    break;
                default:
                    System.out.println("Invalid option!");

            }
            System.out.println("Do you want more Items ...?(yes/no)");
            choice = sc.next();
        }
    }
}
