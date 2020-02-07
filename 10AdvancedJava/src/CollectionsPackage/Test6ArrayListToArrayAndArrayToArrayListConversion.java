package CollectionsPackage;

import java.util.ArrayList;
import java.util.Arrays;


public class Test6ArrayListToArrayAndArrayToArrayListConversion {

	public static void main(String[] args) 
	{
		ArrayList<String> a=new ArrayList<String>();
		a.add("abc");
		a.add("xyz");
		a.add("mno");
		a.add("pqr");
		String c[]=a.toArray(new String[a.size()]);
		
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		

		Integer arr[]={1,2,3,4,5,6,7,8};
		ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(arr));
		al.add(11);
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		 
		 
		
		
		
		
	}

}
