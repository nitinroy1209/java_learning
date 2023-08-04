package coreJava;
import java.util.*;
import java.util.Map.Entry;
public class LinkedHashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap hm = new LinkedHashMap ();
		//System.out.println(hm);
		
		hm.put(200, "john");
		hm.put(2, "Jerry");
		hm.put(80, 121);
		hm.put(57, "nitin");
		System.out.println(hm); // Insertion order is maintained{200=john, 2=Jerry, 80=121, 57=nitin}
		
		
		LinkedHashMap <Integer,String> hm1 = new LinkedHashMap<> ();
		hm1.put(56, null);
		hm1.put(57, "pascal");
		hm1.put(null, "john");//NULL VALUES ARE ALLOWED
		System.out.println(hm1);
		
		LinkedHashMap hm2 = new LinkedHashMap(100,(float)0.75);
	
		//System.out.println(hm2);
		
		//System.out.println(hm.size());
		
		System.out.println(hm1.remove(56));
		
		System.out.println("After removing" + hm1);
		
		System.out.println(hm1.isEmpty());
		
		System.out.println(hm1.containsKey(78));
		
		System.out.println(hm1.containsValue("john"));
		
		System.out.println(hm1.keySet());
		
		System.out.println(hm1.values());
		System.out.println(hm1.entrySet());
		
		//Iterate
		
		{
			
			//for(datatype variablename:collection)
			
					//for(Map.Entry ea:hm1.entrySet())
					//{
						//System.out.println(ea.getKey()+"----"+ea.getValue());
					//}
					for(Map.Entry ea: hm1.entrySet())
					{
						System.out.println(ea.getKey());
						System.out.println(ea.getValue());
					}
					
					Set s = hm1.entrySet();
					Iterator itr= s.iterator();
					
					while(itr.hasNext())
					{
						Map.Entry entry= (Entry) itr.next();
						System.out.println(entry.getKey()+"-------"+entry.getValue());
					}
					
					
		}
		
		
		
		
		


	}

}
