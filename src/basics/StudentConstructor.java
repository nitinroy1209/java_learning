


package basics;

/*
 * Constructor is a method which will have the name as the classname
 * It does not have a return type
 * Constructor is called whenever an object is created for the class
 * Constructor is called even before calling any method
 */
public class StudentConstructor {

	/*
	 * This class can be used to store the values of student id and name and return it
	 */

	int id;
	String name;

	StudentConstructor(int i, String n)
	{
		id=i;
		name=n;

	}

	public void display()
	{
		System.out.println("The id of the student is "+id+" and the name is "+name);
	}



	public static void main(String args[])
	{
		StudentConstructor s1= new StudentConstructor(10,"Harish");
		s1.display();

		StudentConstructor s2 = new StudentConstructor(11, "Arun");
		s2.display();

	}

}


