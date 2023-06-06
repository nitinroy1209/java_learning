==========PROTECTED==========================================
package oops;

public class ProtecectedEx
{
	protected int a2=25;
	protected void displayA2()
	{
		System.out.println("The value of A2 is "+a2);
	}
	
	
}


class ProtectedEx {
	
	//protected int b= 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A2 obj= new A2();
		System.out.println("The value of a2->"+obj.a2);
		obj.displayA2();

	}
	

}
