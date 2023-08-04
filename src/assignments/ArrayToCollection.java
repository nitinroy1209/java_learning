package assignments;
import java.util.*;
//import java util library
public class ArrayToCollection {
	
	
	// Convert an Array into Collection in Java


	// class for writing logic of the problem
		public static void main(String args[])
		{
			// array input
			String playersArray[]
				= { "Virat", "Sachin", "Rohit", "Bumrah" };
		
			// printing input elements for comparison
			System.out.println("Array input: "
							+ Arrays.toString(playersArray));
		
			// converting array into Collection
			// with asList() function
			List playersList = Arrays.asList(playersArray);
		
			// print converted elements
			System.out.println("Converted elements: "
							+ playersList);
		}
	}



