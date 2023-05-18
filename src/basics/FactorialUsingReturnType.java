package basics;

public class FactorialUsingReturnType {



	/*
	//accessmodifier returnType mathodName(arguments)
		{

		}
	 */
	public long factorial(int factorialNumber)
	{
		long factorialResult=1;
		for(int i=1;i<=factorialNumber;i++)
		{
			factorialResult= factorialResult*i;
		}
		//System.out.println("Factorial of a number: "+factorialNumber+" is "+factorialResult);
		return factorialResult;

	}


	public static void main(String args[])
	{
		FactorialUsingReturnType obj1= new FactorialUsingReturnType();
		long result=obj1.factorial(5);
		System.out.println("The factorial value is "+result);

		FactorialUsingReturnType obj2= new FactorialUsingReturnType();
		long result1=obj2.factorial(25);
		System.out.println("The factorial value is "+result1);



	}

}
