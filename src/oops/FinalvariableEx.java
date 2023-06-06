
	

package oops;   //final variable

/*
 * Java Final keyword is used to restrict the user and it can be used along with Variables, methods and classes
 */

//When i have declared a variable as final, i cannot change its value

public class FinalvariableEx {

	 final int rollNo=10;
	// int a=10;
	// int a=20;//duplicate field
	 void displayRollNo()
	 {
		//rollNo=20;
		System.out.println("The roll no is "+rollNo);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalvariableEx obj= new FinalvariableEx();
		obj.displayRollNo();

	}

}



