package coreJava;  //file creation

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.*;

public class FileCreation {

	public static void main(String[] args) throws IOException {
		
		/*
		// TODO Auto-generated method stub
		
		System.out.println("Enter the path of the file");
		Scanner sc = new Scanner(System.in);
		
		String path= sc.nextLine();
		
		System.out.println("Enter the file name");
		Scanner sc1 = new Scanner(System.in);
		
		String fileName= sc1.nextLine();
		*/
		
		System.out.println("Enter the path of the file ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String path = br.readLine();
		
		System.out.println("Enter the file name");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		String fileName = br1.readLine();
		
		
		
		
		File f = new File(path+fileName+".txt");
		f.createNewFile();
		
		
		
		

	}

}
