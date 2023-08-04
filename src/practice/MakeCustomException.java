package practice;

public class MakeCustomException {

	public static void main(String[] args) throws AgeLessThanZeroException{
		// TODO Auto-generated method stub

		validateAge(-1);



	}
	private static void validateAge(int age)throws AgeLessThanZeroException
	{
       if (age<0)
       {
    	   throw new AgeLessThanZeroException("how do you do");
    	   //create a class that extend exception so i have created 

// so a class i have created class AgeLessThanZeroException extends Exception {
    	   // use throw and new keyword over here 
    	   //in main method also use throws keyword and in this method also 
    	   //or can surround with try catch block
       }
	}
}

