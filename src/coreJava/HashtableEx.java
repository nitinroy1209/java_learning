package coreJava;
import java.util.*;
import java.util.Map.Entry;

public class HashtableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Hashtable ht = new Hashtable ();
		System.out.println(ht);
		
		Hashtable <Integer,String> ht1 = new Hashtable<> ();
		System.out.println(ht1);
		
		
		Hashtable ht2 = new Hashtable (100);//using CAPACITY
		System.out.println(ht2);
		
		Hashtable ht3 = new Hashtable(100,(float)0.90);
		System.out.println(ht3);
		
		ht1.put(1, "nitin");
		ht1.put(0, "john");
		ht1.put(5, "jerry");
		ht1.put(3, "bheem");
		ht1.put(2, "Tom");
		System.out.println(ht1);
		
		ht1.remove(1);
		System.out.println(ht1);
		
		System.out.println (ht1.get(2));
		
		System.out.println(ht1.containsKey(5));
		
		System.out.println(ht1.size());
		
		System.out.println(ht1.containsValue("Tom"));
		
		
		System.out.println(ht1.keySet());
		
		System.out.println(ht1.values());
		
		System.out.println(ht1.entrySet());
		
		
		Set s= ht1.entrySet();
		
		Iterator itr= s.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry entry= (Entry) itr.next();
			System.out.println(entry.getKey()+"-------"+entry.getValue());
		}
		
		

		
		
		
		
		
	


		
		
		
		
		
		
		

	}

}
