import java.util.Scanner;


public class checkGrade {

    public void checkMarks(int marks) {
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 60) {
            System.out.println("Grade B");
        } else if (marks >= 40) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        checkGrade o1 = new checkGrade();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks:");
        int c = sc.nextInt();

        o1.checkMarks(c);
    }
}
