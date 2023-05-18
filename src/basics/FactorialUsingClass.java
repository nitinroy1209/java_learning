package basics;

public class FactorialUsingClass {

	/*
//accessmodifier returnType mathodName(arguments)
	{

	}
	 */
	public void factorial(int factorialNumber)
	{
		int factorialResult=1;
		for(int i=1;i<=factorialNumber;i++)
		{
			factorialResult= factorialResult*i;
		}
		System.out.println("Factorial of a number: "+factorialNumber+" is "+factorialResult);

	}


}
