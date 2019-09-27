import java.util.Arrays;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. of students: ");

        try {
            int numOfStudents = in.nextInt();
            System.out.println("Enter marks: ");
            StudentMarks[] students = new StudentMarks[numOfStudents];
            int[] stuGrades = new int[numOfStudents];
            int i = 0;
            int inputMarks;
            try {
                while (i < numOfStudents) {

                    inputMarks = in.nextInt();
                    if (inputMarks >= 0 && inputMarks <= 100) {
                        students[i] = new StudentMarks();
                        students[i].setMarks(inputMarks);
                        stuGrades[i] = inputMarks;
                        i++;
                    } else {
                        throw new Exception("Enter marks between 0 & 100");
                    }
                }
            }
            catch(Exception e) {
                System.out.println(e);
            }
            System.out.println(Arrays.toString(stuGrades));
        }
        catch(Exception e) {
            System.out.println("Enter valid input!");
        }
        in.close();
    }
}

class StudentMarks {
    private int marks;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
