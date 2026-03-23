package shopping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//import static com.sun.beans.introspect.PropertyInfo.Name.description;

public class UserPage {
    public static void main(String[] args) {
        int num = 5;
        List<ItemList> itemList = new ArrayList<ItemList>();
        UserPage products = new UserPage();
        products.createItems(itemList, num);
        System.out.println("welcom to out store....");
        System.out.println(" ");
        System.out.println("Here is the our Products List:");
        products.display(itemList);
//        System.out.println(itemList.size());
        UserSelection selection = new UserSelection();
//        selection.selectItem(itemList);
        int[] units = selection.selectItem(itemList);
        selection.totalPayable(itemList,units);

    }

    public static void createItems(List<ItemList> itemList, int num) {

        ItemList itemes1 = new ItemList("Parle-g", 15, 10, 3, "good for health");
        itemList.add(itemes1);
//        }
//        for (int i = 1; i <= num; i++) {
        ItemList itemes2 = new ItemList("Hide & Seek ", 20, 2, 9, "Very tasty");
        itemList.add(itemes2);
//        }
//        for (int i = 1; i <= num; i++) {
        ItemList itemes3 = new ItemList("Good Day", 50, 5, 6, "Natural Product");
        itemList.add(itemes3);

    }


    public void display(List<ItemList> itemList) {
        for (ItemList item : itemList) {
            System.out.println(item);
        }
    }
}


