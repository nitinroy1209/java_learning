package coreJava;
import java.util.*;


public class TreeMapEx {
	
	public static void main(String args [])
	{
		
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		hm1.put(101, "John");
		hm1.put(102, "David");
		hm1.put(103, "Smith");
		hm1.put(109, "Jordan");
		hm1.put(104, "jane");
		hm1.put(102, "X");
		
		TreeMap<Integer,String> tm23= new TreeMap(hm1);
		System.out.println(tm23);
		
		TreeMap t = new TreeMap();
		//System.out.println(t);
		
		TreeMap <Character,Integer> ht1 = new TreeMap<> ();
		//System.out.println(ht1);
		
		ht1.put('a', 35);
		ht1.put('z',02);
		ht1.put('j', 11);
		System.out.println(ht1);
		
		t.put(1, "john");
		t.put(67, "jerry");
		t.put(567, "tom");
		t.put(345, "henry");
		System.out.println(t);//ascending order maintained
		
		
		
	}

}
