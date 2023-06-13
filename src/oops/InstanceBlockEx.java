package oops;

class VehicleDetails10
{
	int vehicleSpeed;
	
	VehicleDetails10()
	{
		System.out.println("Inside constructor");
		System.out.println("Vehicle Speed "+vehicleSpeed);
	}
	
	
	//instance block would be created inside the class but outside of any method
	{
		vehicleSpeed=120;
		System.out.println("Inside instance block");
	}
	
	//static block
	static
	{
		System.out.println("Inside Static block");
	}
	
}

public class InstanceBlockEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VehicleDetails10 obj= new VehicleDetails10();
		
		VehicleDetails10 obj1= new VehicleDetails10();

		
		

	}

}
