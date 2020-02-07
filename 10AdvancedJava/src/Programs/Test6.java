package Programs;

public class Test6 {

	public static void main(String[] args) 
	{
		// Java Program to find the second highest number in an array
		
		
			int a[]={112,976,465,748,1124,45,348,484,56};
			
			for(int i=0;i<a.length;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]<=a[j])
					{
						int t=a[i];
						a[i]=a[j];
						a[j]=t;
					}
					
				}
			}
			
				System.out.println("second highest number in an array: "+a[1]);
				Test6 o=new Test6();
				o.defaultMethod();
		
	}
	void defaultMethod()
	{
		System.out.println("defaultMethod");
	}
	protected void protectedMethod()
	{
		System.out.println("protectedMethod");
	}
	public void publicMethod()
	{
		System.out.println("publicMethod");
	}

}
