package group7;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DogTest {

	
	@Test (groups={"group1"})
	public void smallDog()
	{
		System.out.println("This is small Dog");
	}
	@Test
	public void bigDog()
	{
		System.out.println("This is big Dog");
	}
	@Test (groups={"group2"})
	public void babyDog()
	{
		System.out.println("This is baby Dog");
	}
	
	@BeforeMethod
	public void BeforeMethod1()
	{
		System.out.println("This is Before method1 ");
	}
	@AfterMethod
	public void AfterMethod1()
	{
		System.out.println("This is After method1 ");
	}
	
	
}
