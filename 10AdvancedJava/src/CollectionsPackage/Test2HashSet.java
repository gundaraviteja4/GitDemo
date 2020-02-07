package CollectionsPackage;

import java.util.HashSet;
import java.util.Iterator;

public class Test2HashSet {

	public static void main(String[] args) 
	{
		HashSet<String> hs=new HashSet<String>();
		hs.add("ravi");
		hs.add("teja");
		hs.add("gunda");
		System.out.println(hs);
		//In set we cannot add values between 2 values using index like in arraylist
		hs.add("teja");
		System.out.println(hs); // we cannot add duplicate values
		hs.remove("ravi");
		System.out.println(hs);
		//hs.removeAll(hs);
		//System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		Iterator<String> i=hs.iterator(); //Iterator is used to iterate through set 
		//initially i will be on the set, if we do i.next() then control will be on 0th index
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println(hs.contains("ravi"));
		
		
		
		
		
	}

}
