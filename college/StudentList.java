package college;

import java.util.ArrayList;
import java.util.List;

public class StudentList {


    public void createList(int n, List<Student> studentList){
        
        for(int i=0;i<n;i++){
          Student students =new Student("shiva","CSE",i);
          studentList.add(students);
        }
    }

    public static void main(String[] args) {
         int n= 6;
        List<Student> students= new ArrayList<>();
        StudentList s =new StudentList();
        s.createList(n,students);
        
       // students.add(student);
      //  students.remove(student);
      //  students.remove(1);


        int size =students.size();
        System.out.println(size);
    }
    
}

