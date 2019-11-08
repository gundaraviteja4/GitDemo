package group7;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LionTest {

	
	@Parameters({"username","password"})
	@Test
	public void smallLion(String a,String b)
	{
		System.out.println("This is small Lion");
		System.out.println("Username: " + a);
		System.out.println("Password: " + b);
		
	}
	@Test
	public void bigLion()
	{
		System.out.println("This is big Lion");
	}
	@Test(dataProvider = "provideData")
	public void babyLion(int x,int y,int z)
	{
		System.out.println("This is baby Lion");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	
	@BeforeSuite
	public void BeforeSuite1()
	{
		System.out.println("This is Before Suite1 ");
	}
	@AfterSuite
	public void AfterSuite1()
	{
		System.out.println("This is After Suite1 ");
	}
	@DataProvider
	public Object[][] provideData()
	{
		Object[][] a = new Object[3][3];
		System.out.println("length: " + a.length);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
		
		{
				 a[i][j] = i;
				 //System.out.println(a[i][j]);
		}
		}
		return a;
		
	}
	
	
}
