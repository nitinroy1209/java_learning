package basics;

/*
 * Class-> House
 * Windows, tables etc-> Variables and methods
 * blueprint -> object
 * 
 */
public class ClassDemo {

	int num=10;
	/*
	 * Methods is a block of code to perform a specific action. Here the objective is to add 2 nos. 
	 * The main objective of methods is code reusability which means the same code will be reused for all the different parameters
	 * accessmodifier returnType methodName(argument1, argument2)
	 * {
	 * 
	 * }
	 * 
	 */

	public void addTwoNumbers(int a, int b)
	{
		int result= a+b;
		System.out.println("Addition of 2 nos is "+result);
	}

	public static void main(String args[])
	{ 
		//classname object = new classname();
		ClassDemo obj1= new ClassDemo();
		System.out.println(obj1.num);
		obj1.addTwoNumbers(10, 8);

		ClassDemo obj2 = new ClassDemo();
		System.out.println(obj2.num);
		obj2.addTwoNumbers(12, 12);


	}

}
