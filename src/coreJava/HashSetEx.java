package coreJava;
import java.util.*;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To store heterogenous data
		HashSet hs = new HashSet();
		
		//mentioning the memory while creating hashset
		HashSet hs1 = new HashSet(100);
		
		//Mentioning the memory and the fill ratio
		HashSet hs2 = new HashSet(100,(float)0.90);
		
		//Homogenous Hashset
		HashSet<Integer> hs3= new HashSet<Integer>();
		
		hs.add(10);
		hs.add("java");
		hs.add(null);
		hs.add(true);
		hs.add("python");
		
		System.out.println(hs);
		
		hs.remove("java");
		
		System.out.println("After removing the value-->"+hs);
		
		hs.add("python");
		
		System.out.println("After adding -->"+hs);
		

	}

}
