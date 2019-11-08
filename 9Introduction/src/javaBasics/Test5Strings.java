//Test case: append string after specific character occur in the string
//ex: append some string after character 'a' occur in the string asbdasbaaaaa
package javaBasics; 
public class Test5Strings {
	public static void main(String[] args) 
	{
		int j=0;
		String s=new String("gundaraviteja1992");
		String appendstr=new String(" cybage ");
		String finalstr="";
		String substr2="";
		
		for(int i=0;i<s.length();i++)
		{
			int k=j;
			if(s.contains("a"))
			{		
				j=s.indexOf('a', j)+1;
				System.out.println("specified character present at position : " + j);
				String substr1=s.substring(k, j);
				finalstr=finalstr+substr1+appendstr;
				if(!((s.substring(j)+1).contains("a")))
				{
				substr2=s.substring(j,s.length());
				break;
				}
			}
			else
			{
				break;
			}
		}
		if(s.contains("a"))
		{		
		System.out.println("string after appending after every occurance of specified character: " + finalstr+substr2);
		}
		else
		{
			System.out.println("string doesn't have specified character");
		}
	}
}