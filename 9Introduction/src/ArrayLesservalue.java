
public class ArrayLesservalue {

	public static void main(String args[])
	{
		//int a[]=new int[5];
		
		int a[]= {57, 42, 15, 69, 14,6,8,01,76};
		
		
		for(int i=0; i<a.length-1; i++)
		{
			if(a[i]<a[i+1])
			{
				a[i+1]=a[i];
		
			}
		
		}
		System.out.println(a[a.length-1]);
	}
}
