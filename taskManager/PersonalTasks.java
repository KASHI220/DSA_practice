package taskManager;

import java.util.ArrayList;
import java.util.List;

public class PersonalTasks extends Basics {
    private String progress;
    private String note;

    public PersonalTasks(int deadTime, String task, String progress, String note) {
        super(deadTime, task);
        this.progress = progress;
        this.note = note;
    }

//    public PersonalTasks(int deadTime, String task) {
//        super(deadTime, task);
//
//    }

    public static void main(String[] args) {
        List<PersonalTasks> personal = new ArrayList<PersonalTasks>();

        PersonalTasks jai1 = new PersonalTasks(4, "read", "gooing will", "it should be done with cution");
        personal.add(jai1);
        PersonalTasks jai2 = new PersonalTasks(3, "study", "gooing will", "it should be done with cution");
        personal.add(jai2);
//        for(PersonalTasks p : personal){
//            System.out.println(p);
//        }
    }
    @Override
    public String toString(){
        return super.toString()+" Progress :"+progress+" | Note :"+note;
    }

}
