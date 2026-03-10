package library;

public class Lib {
    public static void main(String[] args) {
        Books b1 = new Books("A Man");
        Books b2 = new Books("A world of wonder",350,1990,"Raj");
        Lib l= new Lib();
        l.display(b1);
        l.display(b2);


    }
    public void display(Books m){
        System.out.println("Book name :"+m.getBookName()   +   "  "+  "Price = " +m.getPrice()+ "  "  +"Publish Year ="+ m.getPub_year()   +   "  "   + "Auther =:"+m.getAuther());
    }

}
