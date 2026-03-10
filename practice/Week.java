package practice;

public class Week {
    public static void main(String[] args){
        int day=9;
        Week w=new Week();
        w.whichWeekDay(day);
    }

    public void whichWeekDay(int day) {
        switch(day){

            case 1:
                System.out.println("sunday");
                break;

            case 2:
                System.out.println("monday");
                break;

            case 3:
                System.out.println("Tuesday");
                break;

            case 4:
                System.out.println("wednesday");
                break;

            case 5:
                System.out.println("Thursday");
                break;

            case 6:
                System.out.println("sunday");
                break;

            case 7:
                System.out.println("saturday");
                break;

            default:
                System.out.println("didn't match");
        }
    }
}

