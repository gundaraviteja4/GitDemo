package GroupProject;

import java.util.ArrayList;
import java.util.Collections;

public class Test2 {

	public static void main(String[] args) 
	{
		//sort list of strings
		ArrayList<String> a=new ArrayList<String>();
		a.add("acb");
		a.add("abc");
		a.add("cba");
		a.add("cab");
		a.add("bca");
		a.add("bac");
		System.out.println("************************************before sort******************************");
		for(int i=0;i<a.size();i++)
		System.out.println(a.get(i));
		
		Collections.sort(a);
		//Collections.reverse(a);
		System.out.println("************************************after sort******************************");
		for(int i=0;i<a.size();i++)
		System.out.println(a.get(i));

	}

}
