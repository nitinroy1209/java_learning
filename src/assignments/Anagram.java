package assignments;
import java.util.Arrays;
//The Arrays.sort() method is a built-in method in Java that allows you to sort the elements of an array in ascending order. It is part of the java.util.Arrays class.
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Race";
		String s2="Care";
		char c[]= s1.toLowerCase().toCharArray();
		//System.out.println(c);
		//System.out.println(Arrays.sort(c));
		Arrays.sort(c);

		char c2[]=s2.toLowerCase() .toCharArray();
		Arrays.sort(c2);
		System.out.println(Arrays.equals(c,c2));







	}

}
