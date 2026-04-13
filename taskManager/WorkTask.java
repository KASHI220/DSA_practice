package taskManager;

public class WorkTask extends Basics {
    private String meeting;
    private int time;

    public WorkTask(int deadTime, String task, String meeting, int time) {
        super(deadTime, task);
        this.meeting = meeting;
        this.time = time;
    }

    public String getMeeting() {
        return meeting;
    }

    public int getTime() {
        return time;
    }

    @Override
    public String toString() {
        return super.toString() + "| Meeting " + meeting + "| Time : " + time;
    }

}
