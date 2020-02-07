package CollectionsPackage;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test3HashMap {

	public static void main(String[] args) 
	{
		
	//HashMap
		System.out.println("*******************************HashMap**********************************************************");
	HashMap<Integer, String> hm=new HashMap<Integer, String>();
	hm.put(0, "hello");
	hm.put(1, "goodbye");
	hm.put(2, "morning");
	hm.put(3, "evening");
	hm.put(45, "afternoon");
	hm.put(6, null);
	System.out.println(hm.get(2));
	hm.put(2, "goodafternoon");
	System.out.println(hm.get(2));
	System.out.println(hm.get(45));
	hm.remove(2);
	System.out.println(hm.get(2));
	Set s=hm.entrySet(); //entry set will store key,values like in a set
	Iterator i=s.iterator();
	while(i.hasNext())
	{
		//System.out.println(i.next());	
		Map.Entry mp=(Map.Entry)i.next(); //to seperate key and value we use Map.Entry
	System.out.println(mp.getKey());
	System.out.println(mp.getValue());

	}
	System.out.println(hm.isEmpty());
	//HashTable 
	//HashMap and HashTable will have same output but there are some differences and listed in Notes
	System.out.println("*******************************HashTable**********************************************************");
	Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
	ht.put(0, "hello");
	ht.put(1, "goodbye");
	ht.put(2, "morning");
	ht.put(3, "evening");
	ht.put(45, "afternoon");
	
	System.out.println(ht.get(2));
	ht.put(2, "goodafternoon");
	System.out.println(ht.get(2));
	System.out.println(ht.get(45));
	ht.remove(2);
	System.out.println(ht.get(2));
	Set s1=ht.entrySet(); //entry set will store key,values like in a set
	Iterator i1=s1.iterator();
	while(i1.hasNext())
	{
		//System.out.println(i.next());	
		Map.Entry mp1=(Map.Entry)i1.next(); //to seperate key and value we use Map.Entry
	System.out.println(mp1.getKey());
	System.out.println(mp1.getValue());

	}	
	//ht.put(10, null); //hash table doesn't allow null values
	//HashMap uses Iterator but HashTable uses Enumerator  i.e the order is different in output
	
	}

}
