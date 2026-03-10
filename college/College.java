package college;

public class College {

    public void createStudent(Student[] students) {

        for (int i = 0; i < 5; i++) {
            Student s2 = new Student("Shiva" + i, "CS", i);
            // students[i]=new Student("shiva","cse",i+1);
            students[i] = s2;

        }
    }

    public void display(Student[] students) {
        for (int i = 0; i < 5; i++) {

            System.out.println("Students details:" + students[i].getName() + students[i].getCollege());
        }
    }

    // public void search(Student[] students){
    // int usn=6;
    // boolean isfound= false;
    // for(int i=0;i<5;i++){
    // if(students[i].getUSN() == usn){
    // System.out.println("Students found:" + students[i].getName() +
    // students[i].getUSN());
    // isfound=true;
    // }
    // }
    // if(isfound){
    // System.out.println("not found");
    // }
    // }
    public Student getInfo(Student[] students) {
        int usn = 2;
        boolean isfound = false;
        for (int i = 0; i < 5; i++) {
            if (students[i].getUSN() == usn) {
                // System.out.println("Students found:" + students[i].getName() +
                // students[i].getUSN());
                isfound = true;
                // if(students[usn].getUSN() == usn){
                //break;
                return students[i];
            }
        }

        // if (!isfound) {
        //     System.out.println("not found");
        //     return null;
        // }
        return null;
        // System.out.println("name"+students[usn].getName()+students[usn].getUSN());
    }

    public static void main(String[] args) {
        Student[] students = new Student[5];
        College college = new College();
        college.createStudent(students);
        // college.display(students);
        // college.search(students);
        Student s = college.getInfo(students);
        if(s!=null){
            System.out.println("name:" + s.getName());
        }
    }

}
