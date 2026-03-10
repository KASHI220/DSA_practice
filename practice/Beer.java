package practice;

public class Beer {
    public static void main(String[] args) {
        int x=100;
        String word="bottle";

        while(x >= 0){

            if(x>1) {
                System.out.println(x + " " + word + "s" + " of beer is there");
            }
            else if(x==1) {
                System.out.println("Only" + " " + x + " " + word + " " + "is there please share with other");
            }
            else{
                System.out.print("No more " +word+" left");
            }
            x=x-1;
        }

    }
}