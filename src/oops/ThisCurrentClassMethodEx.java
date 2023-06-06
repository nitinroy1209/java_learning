package oops;

class Bike2
{
	void brake()
	{
		System.out.println("Brake applied successfully");
	}
	
	void accelerate()
	{
		//this.brake();
		brake();
		System.out.println("Acceleration is good in this bike");
	}
}

public class ThisCurrentClassMethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike2 obj = new Bike2();
		obj.accelerate();
		//obj.brake();

	}

}