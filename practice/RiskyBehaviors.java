package practice;

import java.util.Scanner;

public class RiskyBehaviors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numarater");
        int i = sc.nextInt();
        System.out.println("enter the denominator");
        int j = sc.nextInt();
        try {
            float result = i / j;
            System.out.println(result);
//            throw new ArithmeticException("Don't enter zwro");
        } catch (ArithmeticException e) {
//            float result=i/1;
            System.out.println(" can't divide by zero "+e);
        }

        System.out.println("good job");
    }
}
