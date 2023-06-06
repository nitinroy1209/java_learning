//Default Access modifier


package oops;

class A1
{
	int a1=11;
	void displayA1()
	{
		System.out.println("The value of A1 is "+a1);
	}
}

public class DefaultEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A1 obj= new A1();
		System.out.println(obj.a1);
		obj.displayA1();

	}

}
