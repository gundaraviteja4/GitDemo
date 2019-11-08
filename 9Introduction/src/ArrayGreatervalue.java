
public class ArrayGreatervalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a[]= {57, 42, 15, 69, 14,6,98,01,76};
		
		
		for(int i=0; i<a.length-1; i++)
		{
			if(a[i]>a[i+1])
			{
				a[i+1]=a[i];
		
			}
		
		}
		System.out.println(a[a.length-1]);
	}

}
