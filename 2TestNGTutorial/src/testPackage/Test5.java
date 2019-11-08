package testPackage;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test5 extends Test6{

	
	@Parameters({"Username","Password"})
	@Test 
	public void ParameterExample1(String a, String b) throws IOException
	{
		FetchFromPropertiesFile();  //Implementation in Test6.Java
		System.out.println("ParameterExample1");
		System.out.println("Username: "+ a + "Password: " + b );
	}
	
	
	@Test(dataProvider = "GetData")
	public void ParameterExample3(String a, String b) throws IOException
	{
		
		System.out.println("ParameterExample3");
		System.out.println("value1: " + a +  "value2: " + b);
		
		
	}
	
	@DataProvider
	public Object[][] GetData()
	{
		Object[][] a=new Object[3][2];
		a[0][0] = "test1";
		a[0][1] = "test2";
		a[1][0] = "test3";
		a[1][1] = "test4";
		a[2][0] = "test5";
		a[2][1] = "test6";
		
		return a;
	}
	
}
