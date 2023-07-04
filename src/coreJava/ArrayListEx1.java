package coreJava;
import java.util.*;

public class ArrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> al1 = new ArrayList<String>();
		System.out.println("Before adding in Arraylist al1"+al1);

		al.add("X");
		al.add("Y");
		al.add("A");
		al.add("B");
		al.add("C");
		
		al1.addAll(al);
		System.out.println("After adding in Arraylist al1"+al1);
		
		al1.removeAll(al);
		System.out.println("After deleting values from al1-->"+al1);
		
		//we dont have predefined methods in arraylist, we can use the predefined methods in Collections class to sort, shuffle
		Collections.sort(al);
		System.out.println("After sorting-->"+al);//[A, B, C, X, Y]
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("Sorting in reverse order-->"+al);//[Y, X, C, B, A]
		
		Collections.shuffle(al);
		System.out.println("After shuffling-->"+al);//[X, A, B, Y, C]
		
		
		
	}

}
