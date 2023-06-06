package assignments;

public class Grade {
	public static void checkPassFail(int marks,String name) {
		if (marks >= 40) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		System.out.println("Student name is : "  + name  +  " and the marks is " +marks);
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
		else
		{
			System.out.println("student has failed and hence grade is not given");
		}
	}

	public static void main(String[] args) {
		//studentMarks = 75;
		//checkPassFail(studentMarks);
		//checkGrade(studentMarks);
		Grade obj1=new Grade();
		obj1.checkPassFail(95,"Pulse");
		obj1.checkGrade(95);

		Grade obj2=new Grade();
		obj2.checkGrade(73);
		obj2.checkPassFail(73,"cadbury");

		Grade obj3=new Grade();
		obj3.checkPassFail(53,"kitkat");
		obj3.checkGrade(45);

	}
}






