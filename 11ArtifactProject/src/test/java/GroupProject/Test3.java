package GroupProject;

public class Test3 {
// find max 2 numbers in an array
	public static void main(String[] args) 
	{
		int a[]={25,8789,87747,1514,47,48,564,564654,47474,47478,418748,514,471454,874,};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]<a[j])
			{
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
				
			}
			}
		}
		System.out.println("first 2 max numbers in array: ");
		for(int i=0;i<2;i++)
		System.out.println(a[i]);

	}

}
