package group7;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ElephantTest {

	
	@Test (groups={"group2"})
	public void smallElephant()
	{
		System.out.println("This is small Elephant");
	}
	@Test
	public void bigElephant()
	{
		System.out.println("This is big Elephant");
	}
	@Test (groups={"group1"})
	public void babyElephant()
	{
		System.out.println("This is baby Elephant");
	}
	
	@BeforeClass (groups={"group2"})
	public void BeforeClass1()
	{
		System.out.println("This is Before Class1 ");
	}
	@AfterClass (groups={"group2"})
	public void AfterClass1()
	{
		System.out.println("This is After Class1 ");
	}
	
	
}
