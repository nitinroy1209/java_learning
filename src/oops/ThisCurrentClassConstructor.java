package oops;

class Car5
{
	Car5()
	{
		System.out.println("This is default constructor");
	}
	
	Car5(String name)
	{
		this();
		System.out.println("The car name is "+name);
	}
}

public class ThisCurrentClassConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Car5 obj = new Car5("Mahindra XUV 700");
		
		//Car5 obj1 = new Car5();
		

	}

}