package oops;  //this current class2

//local variable are variables declared inside the methods or constructor
//instance variables are variables that are declared inside the class but outside of all the methods. Moreover instance variables have default values assigned.
//With instance variables, you can specify different access modifiers like public, private, protected and default

//when there is same variable name for both instance and local variables, then the compiler could get confused and print its default values.c
//We can mitigate this using this keyword

//this keyword can be used to call the current class instance variablel
class Student2
{
	//instance variables
	int rollNo1;
	String name1;
	int marks1;
	
	Student2(int rollNo1, String name1, int marks1)
	{
		this.rollNo1= rollNo1; //9
		this.name1 = name1; //Jai
		this.marks1=marks1; //85
	}
	
	void displayStudentData() {
		System.out.println("The Student rollno is "+rollNo1+" and his name and marks are "+name1+" "+marks1);

	}
}

public class ThisCurrentClassEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student2 obj = new Student2(9,"Jai",85);
		obj.displayStudentData();
		
		
	}

}
