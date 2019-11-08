package testPackage;

import org.testng.annotations.Test;

public class Test3 {

	@org.testng.annotations.BeforeClass
	public void BeforeClass()
	{
		System.out.println("BeforeClass");
	}
	@org.testng.annotations.AfterClass
	public void AfterClass()
	{
		System.out.println("AfterClass");
	}
	@Test (timeOut=4000)
	public void Train1()
	{
		System.out.println("Train1");
	}
	@Test(groups={"Smoke"})
	public void Train2() 
	{
		System.out.println("Train2");
	}
	@Test
	public void Train3()
	{
		System.out.println("Train3");
	}
}
