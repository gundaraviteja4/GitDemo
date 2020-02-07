package Programs;

import java.util.HashMap;

public class Test4 extends Test5 {

	public static void main(String[] args) 
	{
		// Max occurrence of a character in a string
		
		
		String s="WELCOME";
		
		char[] c=s.toCharArray();
		
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		
		for(int i=0;i<c.length;i++)
		{
			
			if(hm.containsKey(c[i]))
			{
				
				hm.put(c[i], hm.get(c[i])+1);
			}
			else
			{
				
				hm.put(c[i], 1);
			}
			
		}
		
		
		
		System.out.println(hm);
			
		 Test6 o1=new Test6();
         o1.defaultMethod();
         o1.protectedMethod();
         o1.publicMethod();
	}

}
