package oops;

public class ProtectedEx3 {
	
	protected int val=10;
	
	protected void displayValue()
	{
		System.out.println("The value is "+val);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ProtectedEx3 obj = new ProtectedEx3();
		obj.displayValue();
	}

}