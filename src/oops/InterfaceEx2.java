package oops;

interface RBI
{
	void rateOfInterest();
	
}

class SBI implements RBI
{

	@Override
	public void rateOfInterest() {
		System.out.println("Rate of Interest is 9");
	}
	
}

class AXIS implements RBI
{

	@Override
	public void rateOfInterest() {
		System.out.println("Rate of interest is 10");
		
	}
	
}

class IDFC implements RBI
{

	@Override
	public void rateOfInterest() {
		// TODO Auto-generated method stub
		System.out.println("Rate of interest is 11");
		
	}
	
}

public class InterfaceEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SBI sbi = new SBI();
		sbi.rateOfInterest();
		
		AXIS axis= new AXIS();
		axis.rateOfInterest();
		
		IDFC idfc = new IDFC();
		idfc.rateOfInterest();

	}

}
