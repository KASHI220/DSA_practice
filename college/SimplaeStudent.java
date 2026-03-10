package college;

public class SimplaeStudent {

   // Student s1, s2;

   public static void main(String[] args) {
  //  System.out.println("Started main");

    Student s1 = new Student("Kashi");
    Student s2 = new Student("Shiva", "CS", 1);
   // Student s3 = new Student("Shiva", "CS", 2);  
    

   // System.out.println("Student name :"+ s1.getName() + "     colleg" + s1.getUSN());
   // System.out.println("Student name :"+ s2.getName() + "     colleg :" + s2.getUSN());

   //  System.out.println(s1);
   //  System.out.println(s2);

   ///update USN
   s2.setUSN(2);

   // System.out.println("Student name :"+ s2.getName() +  "    USN :" + s2.getUSN());

   // System.out.println(s2);

   SimplaeStudent college = new SimplaeStudent();

   college.display(s1);
   college.display(s2);

   }

   public void display(Student s){

      System.out.println("Student name :"+ s.getName() + "     college" + s.getUSN());
   }

}


//  class Student{
//     String name;
//     String dept;
//     int USN;

// // Default 
// // public Student(){
// // }

// public Student(String name){
//     this.name = name;
// }
// }
