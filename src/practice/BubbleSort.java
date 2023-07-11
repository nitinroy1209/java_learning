package practice;
import java.util.Scanner;

public class BubbleSort {
	public static void main (String []args)
	{
		
	
Scanner sc = new Scanner(System.in);
//Scanner scanner = new Scanner(System.in);
System.out.println("Enter the size");
int size = sc.nextInt();

	
	for(int i=0;i<size-1;i++)
	{
		for(int j=0;j<size-1-i;j++)
		
		{
			if(arr[j] > arr [j+1])
				
			{
				swap (arr,j,j+i);
			}
				
			
		
		}
	}
	}
}
