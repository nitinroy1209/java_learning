package coreJava;
import java.io.*;
public class Writingfile111 {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * FileWriter class

			FileWriter fwrite= new FileWriter("C:\\Users\\Guest User\\guvilearning\\Javaguv\\src\\corejava\\sample.txt");



			String writeString="We are learning file operations";

			fwrite.write(writeString);

			fwrite.close();

			System.out.println("File writing operation successful");
		 */

		///BufferedWriter


		BufferedWriter brWriter= new BufferedWriter(new FileWriter("C:\\Users\\nitin\\eclipse-workspace\\JavaGuvi\\src\\coreJava\\input1.txt"));

		String str="Writing using Bufferred WRiter in WritingFile1111";
		brWriter.write(str);

		brWriter.close();

		System.out.println("nitin121455");


	}

}



