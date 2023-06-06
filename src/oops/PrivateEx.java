//Private Access modifier

package oops;

class A
{
	private int a=10;
	
	private void display()
	{
		System.out.println("Displaying the value of a-->"+a);
	}
}

public class PrivateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obj = new A();
		/*
		//compile time error
		System.out.println(obj.a);
		obj.display();
		*/
		
		//Acessing a default method and variable
		A1 obj1 = new A1();
		System.out.println(obj1.a1);
		obj1.displayA1();

	}

}