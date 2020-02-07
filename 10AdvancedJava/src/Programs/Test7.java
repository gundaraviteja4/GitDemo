package Programs;

public class Test7 {

	public static void main(String[] args) 
	{
		String s="Finding length of each word in a sentence";
		String a[]=s.split(" ");
		
		
		for(int i=0;i<a.length;i++)
		{
			
			StringBuffer sb=new StringBuffer(a[i]);
			System.out.print(sb);
			sb.reverse();
			System.out.println(" " + sb);
			
			
		}
			
		
		
		
		
	}

}
