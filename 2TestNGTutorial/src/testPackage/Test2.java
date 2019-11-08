package testPackage;

import org.testng.annotations.Test;

public class Test2 {

	@org.testng.annotations.BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("BeforeSuite");
	}
	@org.testng.annotations.AfterSuite
	public void AfterSuite()
	{
		System.out.println("AfterSuite");
	}
	@Test(groups={"Smoke"})
	public void Bike1()
	{
		System.out.println("Bike1");
	}
	@Test
	public void Bike2()
	{
		System.out.println("Bike2");
	}
	@Test
	public void Bike3()
	{
		System.out.println("Bike3");
	}
}
