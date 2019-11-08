
public class ArraysAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		int b[][]={{1,2},{4,5}};
		int c[][]=new int[3][3];
		
		for(int i=0;i<3;i++)
		{
			
			for(int j=0;j<3;j++)
			{
		if(i==0 && j==2)
		{
			c[i][j]=a[i][j];
			System.out.print(c[i][j]+"                   ");
		}
		else if(i==1 && j==2)
		{
			c[i][j]=a[i][j];
			System.out.print(c[i][j]+"                   ");
		}
		else if(i==2 && j==0)
		{
			c[i][j]=a[i][j];
			System.out.print(c[i][j]+"                   ");
		}
		else if(i==2 && j==1)
		{
			c[i][j]=a[i][j];
			System.out.print(c[i][j]+"                   ");
		}
		else if(i==2 && j==2)
		{
			c[i][j]=a[i][j];
			System.out.print(c[i][j]+"                   ");
		}
		else
			{
			c[i][j]=a[i][j]+b[i][j];
			
				System.out.print(c[i][j]+"                   ");
			}	
				
			}
			System.out.println("\n");
		}
		
		
	}

}
