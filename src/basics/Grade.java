package basics;
public class Grade {
    public static void checkPassFail(int marks) {
        if (marks >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

    public static void checkGrade(int marks) {
        if (marks >= 85) {
            System.out.println("Grade A");
        } else if (marks >= 70 && marks < 85) {
            System.out.println("Grade B");
        } else if (marks >= 50 && marks < 70) {
            System.out.println("Grade C");
        } else if (marks < 50) {
            System.out.println("Grade D");
        }
    }

    public static void main(String[] args) {
        int studentMarks = 75;
        checkPassFail(studentMarks);
        checkGrade(studentMarks);
    }
}



