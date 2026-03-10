package library;

public class Books {

    private String bookName;
    private int pubYear ;
    private int price;
    private String auther;

    public Books(String book_name) {

        this.bookName = book_name;
    }

    public Books(String book_name, int price,int pubYear, String auther) {
        this.bookName = book_name;
        this.price = price;
        this.auther = auther;
    }

    public String getBookName() {
        return bookName;
    }

    public int getPub_year() {
        return pubYear;
    }

    public int getPrice() {
        return price;
    }

    public String getAuther() {
        return auther;
    }


}
