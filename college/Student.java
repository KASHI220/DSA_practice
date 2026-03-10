package college;

public class Student {

   private String name;
   private  String dept;
   private int USN;
   private String college = "PES";

    // Default constructor
    // public Student() {

    // }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String inputDept, int USN) {
        this.name = name;
        dept = inputDept; // camel case notation startWithSmallNextWordWithCapsLetter
        this.USN = USN;
    }


    /*
    * Method signature 
      public - access modifier
       
      access returnType methodName(){
      
      }

     */


    public String getName(){    
      return this.name;
    }

    public String getCollege(){    
        return this.college;
    }

    public int getUSN(){    
        return this.USN;
    }

    public void setUSN(int inputUsn){
        this.USN = inputUsn;
    }



}
