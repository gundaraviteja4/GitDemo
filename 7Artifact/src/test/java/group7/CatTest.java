package group7;


//import java.io.FileNotFoundException;
import java.io.IOException;



import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CatTest extends PropertiesTest{
	


	@Test
	public void smallCat() throws IOException 
	{
		//GetDataFromPropertiesFile();
		System.out.println("This is small cat");
		
	}
	@Test
	public void bigCat()
	{
		System.out.println("This is big cat");
	}
	@Test (dependsOnMethods = {"smallCat"})
	public void babyCat()
	{
		System.out.println("This is baby cat");
	}
	
	@BeforeTest
	public void BeforeTest1()
	{
		System.out.println("This is Before Test1 ");
	}
	@AfterTest
	public void AfterTest1()
	{
		System.out.println("This is After Test1 ");
	}
	
	
}
