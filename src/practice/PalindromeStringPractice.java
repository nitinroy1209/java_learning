package practice;
//we are initializing Variables under Function
//SUMMARY WE CREATED A CLASS AND A FUNCTION AND IN THE MAIN CLASS WHICH HAS PUBLIC STATIC VOID  MAIN FUNCTION WE CREATED A OBJECT TO THAT CLASS AND SENT VALUES TO IT
class PalindromeString //Firstly i created a class with class and classname
{

	//then i am going to have a method inside this class

	public void checkPalindrome(String str) //creating a method inside this class with void type 
	//so to check this palindrome i need to get Object(String Input so I will create object for this palindrome in main method)and the String str is the input String so i have to create a inputString so for that i have created A String variable as inputString and initiialize that to the string variable which is passed in checkPalindromme function
	{
		String inputString=str;
		String reverse="";//create a new variable as reverse and havwe empty string
		//then think how to calculate the length of the string what is the method - str.lenght()
		int getLength= inputString.length();// created  integer type variable to store the String length and getting the length to iterate over the loop
		System.out.println("Length of the string is-->" +getLength);//Length would start from INDEX 1 ONLY

		for(int i=getLength-1; i>=0; i--)//AFTER INITIALIZATION WE ALWAYS DO INCREMENT OR DECREMENT AND THEN CHECK THE CONDITION AND THE PROCESS REPEAT
		{
			reverse = reverse + inputString.charAt(i);
		}

		if(reverse.equals(inputString))//WHAT IS THE REVERS STRING(IS IN REVERSE VARIABLE) NOW EQUAL METHOD COMPARE THE CONTENT,SO LIRIL EQUALS LIRIL RETURN TRUE
		{
			System.out.println("The given String is "+inputString+ " is a palindrome String");
		}

		else
		{
			System.out.println("The given String is "+inputString+ " is not a palindrome String");
		}
	}


}





public class PalindromeStringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PalindromeString palindrome= new PalindromeString();//created object
		//What is the method that i am going to use is checkPalindrome
		palindrome.checkPalindrome("liril");//I am going to supply liril for this method,since i have supplied argument to this,supplied to the calling method so i need to give String str means Striung varaiable to check palndrome function,First i have got the inpurt string which is liril and assigned to input str and calling checkpalindrome method
		palindrome.checkPalindrome("NITIN");
		palindrome.checkPalindrome("DOCTOR");
		palindrome.checkPalindrome("121");
	}

}
