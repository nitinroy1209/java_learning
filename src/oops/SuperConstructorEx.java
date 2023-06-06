package oops;

//super() can be used to invoke immediate parent class constructor.
//If we dont call the parent class constructor explicitly in the child class, child class constructor would call the parent class constructor implicitly

class Car2
{
	Car2()
	{
		System.out.println("Parent class constructor");
	}
}

class Hyundai extends Car2
{
	Hyundai()
	{
		//super();
		System.out.println("Child class constructor");
		
	}
}

public class SuperConstructorEx 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Hyundai cons= new Hyundai();

	}
}
