package practice;

public class StaticMethod {
    public void nonStatic(){
        System.out.println("non static");
}
    public static void staticMethod(){
        System.out.println("Static method");
    }

    public static void main(String[] args) {
        StaticMethod obj =new StaticMethod();

        obj.nonStatic();
        StaticMethod.staticMethod();
    }
}
