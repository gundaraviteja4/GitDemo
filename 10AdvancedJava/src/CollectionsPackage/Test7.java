package CollectionsPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import Programs.Test6;
public class Test7 extends Test6
{
	public static void main(String[] args) 
	{
		List<Integer> list=new ArrayList<Integer>();
		Integer arr[]={2,10,3};
		list=Arrays.asList(arr);
		list.set(0, 3);
		System.out.println(list);
		list.add(1);
		System.out.println(list); //Runtime Exceptions Since arralist is converted to array
		
		Test7 o1=new Test7();
       //  o1.defaultMethod();
         o1.protectedMethod();
         o1.publicMethod();
		
         Test6 o2=new Test6();
        // o1.defaultMethod();
        // o1.protectedMethod();
         o2.publicMethod();
	}

}
