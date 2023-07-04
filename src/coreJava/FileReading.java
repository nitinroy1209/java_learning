package coreJava;  //file reading
import java.io.*;
import java.util.Scanner;

public class FileReading {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("C:\\Users\\Guest User\\guvilearning\\Javaguv\\src\\corejava\\inputfile.txt");
		/*
		 * Using scanner class
		Scanner sc = new Scanner(f);
		
		System.out.println(sc.nextLine());
		*/
		
		
		/*
		 * Using BufferedReader Class
		 * 
		 */
		
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		String str;
		while( (str=br.readLine()) != null)
		{
			System.out.println(str);
		}
		
		
		

	}

}