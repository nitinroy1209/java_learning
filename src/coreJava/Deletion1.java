package coreJava;
import java.io.File;
public class Deletion1 {



	public static void main(String args[])
	{
		File f = new File("C:\\Users\\nitin\\eclipse-workspace\\JavaGuvi\\src\\coreJava\\input1.txt");

		if(f.exists())
		{
			f.delete();
			System.out.println("File got deleted successfully");
		}
		else
		{
			System.out.println("Problem in file deletion");
		}

	}

}





