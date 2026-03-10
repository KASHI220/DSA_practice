package dsa;

public class CheckOdds {
    public boolean oddCheck(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        int n=90;
        CheckOdds odd =new CheckOdds();
        boolean result = odd.oddCheck(n);
        System.out.println(result);
    }
}
