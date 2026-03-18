package shopping;

public class ItemList {
    private String name;
    private int price;
    private int ratings;
    private int quantityLeft;
    private String discription;

    public ItemList(String name, int price, int ratings,int quantityLeft, String discription) {
        this.name = name;
        this.price = price;
        this.ratings = ratings;
        this.quantityLeft = quantityLeft;
        this.discription = discription;

    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public int getRatings() {
        return this.ratings;
    }

    public int getQuantityLeft() {
        return this.quantityLeft;
    }

    public String getDiscription() {
        return this.discription;
    }
//    public void setPrice(int price){
//        this.price=price;
//    }

    @Override
    public String toString() {
        return "Product: " +name + " | Price: " + price + " | Desc: " + discription +"  | Quantity Left :"+quantityLeft;


    }
}
