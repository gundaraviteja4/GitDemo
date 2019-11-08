package testPackage;



import org.testng.annotations.AfterTest;

import org.testng.annotations.Test;

public class Test1 {
	
	
	
	@Test 
	public void Car1() 
	{
		
		System.out.println("Car1");
	
	}
	
	@Test (enabled=false)
	public void Car2()
	{
		System.out.println("Car2");
	}
	
	
	@Test(groups={"Smoke"})
	public void Car3()
	{
		System.out.println("Car3");
	}
	@org.testng.annotations.BeforeTest (groups={"Smoke"})
	public void BeforeTest() 
	{
		System.out.println("BeforeTest");
	}
	@AfterTest
	public void AfterTest()
	{
		System.out.println("AfterTest");
	}
	
}
