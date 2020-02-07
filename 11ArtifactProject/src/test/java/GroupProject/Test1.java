package GroupProject;

public class Test1 {

	public static void main(String[] args) 
	{
		//find duplicate elements
		String s[]={"a","b","c","d","a","c","werwe","werfw","A","ravi","ravi"};
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
			if(s[i].equals(s[j]))
			{
				System.out.println("duplicate element is: " +s[i]);
			}
			}
		}
		
		
		
		

	}

}
