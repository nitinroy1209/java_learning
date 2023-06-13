package oops;

class VehicleDetails2
{
	String vehicleName="scooty";
	int price=60000;
	static String vehicleType;

	
	VehicleDetails2()
	{
		System.out.println("Inside the contructor");
	}
	
	
	void displayData()
	{
		System.out.println("Inside non static method");
		System.out.println(vehicleName+":"+price+":"+vehicleType);
	}
	
	//we use use static block to initialize static variables
	static
	{
		System.out.println("inside");
		System.out.println("inside static block");
		vehicleType="2-Wheeler";
}
}


public class StaticBlockEx {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VehicleDetails2 obj = new VehicleDetails2();
		obj.displayData();

	}

}
