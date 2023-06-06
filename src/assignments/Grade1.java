package assignments;

public class Grade1 {

	String cadname;
	int cadmarks;
	public int PassFail(String name ,int marks )
	{
		cadname=name;
		cadmarks=marks;
		if(cadmarks >=40)
			System.out.println("The name of the student is : " + cadname + "  got marks " + cadmarks + " pass in that exam");
		else
		{
			System.out.println("Fail");

		}
		return cadmarks;
	}
	public int grade(int result)
	{
		//if (result==cadmarks)
		//{
		if(cadmarks>=85)
		{
			System.out.println("Got grade A");
		}

		else if (cadmarks >= 70 && cadmarks < 85) {
			System.out.println("Grade B");
		} else if (cadmarks >= 50 && cadmarks < 70) {
			System.out.println("Grade C");
		} else if (cadmarks < 50) {
			System.out.println("Grade D");
		}
		else
		{
			System.out.println("student has failed and hence grade is not given");
		}

		return result;
	}
	public static void main(String [] args)
	{
		Grade1 obj1=new Grade1();
		int cadmarks1=obj1.PassFail("nitin",85);
		System.out.println(cadmarks1);

		int result1= obj1.grade(85);
		System.out.println(result1);




	}

}



