package basics;


public class FactorialUsingReturntype1 {

	long factorialResult;
	public FactorialUsingReturntype1()
	{
		factorialResult=1;
		System.out.println("Constructor is called when the object is created. It wis the first method that will be executed");
	}

	/*
	//accessmodifier returnType mathodName(arguments)
		{

		}
	 */
	public long factorial(int factorialNumber)
	{
		//long factorialResult=1;
		for(int i=1;i<=factorialNumber;i++)
		{
			factorialResult= factorialResult*i;
		}
		//System.out.println("Factorial of a number: "+factorialNumber+" is "+factorialResult);
		return factorialResult;

	}


	public static void main(String args[])
	{
		FactorialUsingReturntype1 obj1= new FactorialUsingReturntype1();
		long result=obj1.factorial(5);
		System.out.println("The factorial value is "+result);

		FactorialUsingReturntype1 obj2= new FactorialUsingReturntype1();
		long result1=obj2.factorial(25);
		System.out.println("The factorial value is "+result1);



	}

}

