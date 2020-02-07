package Programs;

public class Test1 
{
	public static void main(String args[])
	{
		System.out.println("**********************StringReverseMethod1*******************************");
		String s=new String("123456789");
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println("");
		System.out.println("**********************StringReverseMethod2*******************************");
		char a[]=s.toCharArray();
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}
		
		System.out.println("**********************Swap 2 strings*******************************");
		System.out.println("**********************Method1*******************************");
		String s1="abc847897897897";
		String s2="xyz";
		
		String t="";
		t=s1;
		s1=s2;
		s2=t;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("**********************Method2*******************************");
		s1=s1+s2;
		s2=s1.substring(0, s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println(s1);
		System.out.println(s2);
		
		
		
		
		
		
		
		
		
	}
}
