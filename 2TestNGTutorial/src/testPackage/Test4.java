package testPackage;


import org.testng.annotations.Test;

public class Test4 {

	@org.testng.annotations.BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("BeforeMethod");
	}
	@org.testng.annotations.AfterMethod
	public void AfterMethod()
	{
		System.out.println("AfterMethod");
	}
	@Test(groups={"Smoke"})
	public void CarLogin()
	{
		System.out.println("Car Login");
	}
	
	@Test 
	public void TrainLogin()
	{
		System.out.println("Train Login");
		
	}
	@Test (dependsOnMethods={"TrainLogin"})
	public void BikeLogin()
	{
		System.out.println("Bike Login");
	}
	
	
	
	
}
