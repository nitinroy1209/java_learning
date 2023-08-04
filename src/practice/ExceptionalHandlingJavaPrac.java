package practice;

public class ExceptionalHandlingJavaPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int m1 = Integer.parseInt("hello");// error is NumberFormatException
		try
		{
			//rest of code after int m1 =.. will not be thrown ,it wont get printed 
			// code may that cause eception
			//we can call the function inside try if not try catch done there
			int m1 = Integer.parseInt("hello");
			//this piece of code will throw numberFormatException
		}
		catch(NumberFormatException nfe)
		{
			//can use bar symbol |NumberFormatException|null pointer exception
			//can catch multiple type of eception
			//code that we want to execute if this type of exception 
			//write any code that we want to execute if this type of exception happen
		// we include catch block to catch numberFormatException if it is thrown in try block
		}
		finally
		{ 
			System.out.println(3);
			// if return is there in finally it will override the return of try 
		}
		// use finally block to close connection to the database


}
}
