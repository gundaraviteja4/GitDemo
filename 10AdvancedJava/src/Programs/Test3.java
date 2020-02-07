package Programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test3 {

	public static void main(String[] args) 
	{
		 String str = "This this is is done by ravi ravi";
	
		         String[] split = str.split(" ");
		         for (int i=0; i<split.length; i++) 
		         System.out.println(split[i]);
		         HashMap<String,Integer> map = new HashMap<String,Integer>();
	         for (int i=0; i<split.length; i++) {
		             if (map.containsKey(split[i])) {
		                 int count = map.get(split[i]);
		                 map.put(split[i], count+1);
		             }
		             else {
		                 map.put(split[i], 1);
		             }
		         }
		         System.out.println(map);
		         
		         
		         //Iterate through hash map using while
		         Set s=map.entrySet();
		         Iterator i=s.iterator();
		         while(i.hasNext())
		         {
		        	 System.out.println(i.next());
		         }
		         
		       //Iterate through hash map using for each
		         
		         for(Map.Entry me:map.entrySet())
		         {
		        	 System.out.println(me.getKey());
		        	 System.out.println(me.getValue());
		         }
		         
		         
		         
		         
		         
	}

		
		
		

}


