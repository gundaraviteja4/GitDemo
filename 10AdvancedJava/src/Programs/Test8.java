package Programs;

public class Test8 
{
	public static void main(String[] args) 
	{
		String s="Remove duplicate words in a sentence Remove duplicate words in a sentence Remove duplicate words in a sentence";
	
		String a[]=s.split(" ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].equals(a[j]))
				{
					a[j]=" ";
				}
			}
			
			
			
			
		}
		
		
		
	}

}
