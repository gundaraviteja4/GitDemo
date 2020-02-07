package CollectionsPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test5ReverseArrayListAndDescOrder {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(3);
		al.add(13);
		al.add(32);
		al.add(87);
		al.add(47);
		al.add(63);
		al.add(61);
		al.add(26);
		
		for(int i=0;i<al.size();i++)
		System.out.println(al.get(i));
		
		System.out.println("*******Reverse procedure1****");
		
		for(int i=al.size()-1;i>=0;i--)
			System.out.println(al.get(i));
		
		System.out.println("*******Reverse procedure2****");
		Collections.reverse(al);
		for(int i=0;i<al.size();i++)
			System.out.println(al.get(i));

		
		
		//Descending order
		System.out.println("*******Descending order****");
		
		
		Collections.sort(al); //ascending order
		Collections.reverse(al);
		
		
		//or Collections.sort(al,Collections.reverseOrder()); 
		for(int i=0;i<al.size();i++)
			System.out.println(al.get(i));
	
		
		
	}

}
