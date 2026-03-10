package school;

public class Info {
    public static void main(String[] args) {
        Candidate[] member = new Candidate[5];
        Info obj = new Info();
        obj.createStudent(member);
        obj.display(member);

    }

    public void createStudent(Candidate[] member) {
        int[][] marks = {
                {60, 78, 98},
                {89, 98, 46},
                {96, 87, 83},
                {85, 100, 46},
                {96, 47, 67},
        };
        for (int i = 0; i < marks.length; i++) {
            int sum = 0;
            for (int j = 0; j < marks[i].length; j++) {
                sum = sum + marks[i][j];
            }

            float avg = (float) sum / marks[i].length;


            member[i] = new Candidate("Kashi", i + 1, marks[i], avg, "XYZ");

        }
    }

    public void display(Candidate[] member) {


        for (int i = 0; i < member.length; i++) {
            System.out.print("Name : " + member[i].getName() + "  Roll number :" + member[i].getrollNum() + "  Avg Marks :" + member[i].getAvg() + "  College Name :  " + member[i].clg + " ");

            int[] marks = member[i].getMarks();
            System.out.print("marks :");
            for (int j = 0; j < marks.length; j++) {
                System.out.print(marks[j] + ",");
            }
            System.out.println();
        }
    }
}
