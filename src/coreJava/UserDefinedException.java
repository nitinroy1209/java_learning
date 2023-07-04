package coreJava;

public class UserDefinedException {

	int age;
		// TODO Auto-generated method stub
		static void validateAge(int age)
		{
		try
		{
			if (age <=18)
			{
				//throw new AgeException();
				throw new AgeException("Age must not be less than 18");
			}
		}
		catch(Exception ex)
		{
			System.out.println("Inside catch block");
			ex.printStackTrace();
			
		}
		}
		
		public static void main(String[] args) {
			
			validateAge(10);

	}

}

/*
//User defined Exception
1) user defined class should extend the Exception class
2) We should constructors for throwing the exception in the user defined exception class
3) We can have both default and parameritized constructors

*/
class AgeException extends Exception
{
	AgeException()
	{
		System.out.println("Age should be greater than 18");
	}
	
	AgeException(String str)
	{
		System.out.println(str);
	}
}
