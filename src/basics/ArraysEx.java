package basics;

public class ArraysEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array is used to store the values of similar type in contiguous memory. Array index or subscript will start from 0.

		int marks = 50;

		//first way of creating an array
		int marks1[]= new int [5];

		marks1[0]=90;
		marks1[1]=55;
		marks1[2]=75;
		marks1[3]= 45;
		marks1[4]= 85;

		System.out.println(marks1[4]);


		//second way of creating the array
		int marks2[]= {45, 50, 65, 75};

		//third way
		int[] marks3 = {23,67,89};

		System.out.println("Size of an array: "+marks1.length);
		System.out.println("Size of an array: "+marks2.length);
		System.out.println("Size of an array: "+marks3.length);




		for (int i=0; i<marks1.length;i++)
		{
			System.out.println(marks1[i]);
		}
		//System.out.println("Size of an array: "+marks3.length);



	}

}
