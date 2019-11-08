package javaPackage;

public class Test5StringReverseWithSpacePreservation {

	public static void main(String args[]) {
		
		String str="My Name is Ravi";
		char[] c=str.toCharArray();
		int[] b=new int[c.length];
		
		System.out.println(c.length);
		
		
		for(int i=0; i<=c.length-1;i++)
		{
			if(c[i]==' ')
			{
				System.out.print("$");
				//System.out.print(i);
				int j=0;
				b[j]=i;
				System.out.print(b[j]);
				System.out.print(i);
				j=j+1;
				
			}
			else
			{
			System.out.print(c[i]);
			}
		}
		for(int k=0; k<=3;k++)
		{
		System.out.println(b[k]);
		}
	}

}
