package GroupProject;

public class Test4 {
	//Incomplete project
	public static void main(String[] args) 
	{
		//find longest substring in a given string which doesn't contain duplicate characters
		String s="abcde abcdefa abcdetyu abpoiuyu poiuytrewqr asdfghjkl mnbvcxz";
		String[] c=s.split(" ");
		String b;
		char d[];
		int f[] = null;
		//for(int i=0;i<c.length;i++)
		//System.out.println("length of index " + i + ": "+c[i].length());
		
		for(int i=0;i<c.length;i++)
		{
			b=c[i];
			 d=b.toCharArray();
			 
			for(int j=0;j<c[i].length();j++)
			{
				for(int k=j+1;k<c[i].length();k++)
				{
				if(d[j]==d[k])
				{
					System.out.println("index "+ i + " contains duplicate elements in string");
					int y=0;
					//f[y]=i;
					
				}
				
				}
				//System.out.println("index2 ");
			}
			System.out.println("length " + c[i].length());
		}

	}

}
