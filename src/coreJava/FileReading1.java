package coreJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReading1 {
	public static void main(String[] args) throws IOException {

	File f = new File("C:\\Users\\nitin\\eclipse-workspace\\JavaGuvi\\src\\coreJava\\input1.txt");
	
	BufferedReader br = new BufferedReader(new FileReader(f));
	
	String str;
	while( (str=br.readLine()) != null)
	{
		System.out.println(str);
	}
}
}
	
	
	

