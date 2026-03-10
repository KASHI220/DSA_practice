package practice;

public class AccesDVD {
    public static  void main(String[] args) {
        ObjectPractice o = new ObjectPractice();
        o.isPresent = true;
        if(o.isPresent==true) {
            o.dvdPresent();
        }

        else  {
            o.dvdAbsent();
        }
    }
}
