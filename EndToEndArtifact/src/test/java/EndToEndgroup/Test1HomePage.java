package EndToEndgroup;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.BaseClass;


public class Test1HomePage extends BaseClass {

	private static Logger log=LogManager.getLogger(BaseClass.class.getName());

	
	
	@Test(dataProvider="TestDataMethod")
	public void TestLogin(String a, String b, String c) throws IOException, InterruptedException
	{
		
		driver=InitializeDriver();
		driver.get(p.getProperty("url"));
		LandingPage lp=new LandingPage(driver);
		
		lp.clickNewsLetterNoThanksButton().click();
		System.out.println("Join our NewLetter is rejected");
		log.info("Join our NewLetter is rejected");
		Thread.sleep(3000L);
		
		String expectedText=lp.getTextMethod().getText();
		System.out.println("expectedText is : " + lp.getTextMethod().getText());
		Assert.assertEquals(expectedText, "FEATURED COURSES");
		
		
		Assert.assertTrue(lp.navigationBarMethod().isDisplayed());
		System.out.println("navigationBar is displayed: " + lp.navigationBarMethod().isDisplayed());
		
		lp.getLogin().click();
		System.out.println("Login button clicked to launch Login Page");
		log.info("Login button clicked to launch Login Page");
		
		LoginPage lop=new LoginPage(driver);
		lop.sendEmailId().sendKeys(a);
		lop.sendPassword().sendKeys(b);
		System.out.println(c);
		lop.clickOnSubmit().click();
		System.out.println("Email and password credentials are provided and submitted");
		log.info("Email and password credentials are provided and submitted");
		
		
	
		driver.quit();
	
		
	}
	
	@AfterTest
	public void tearDown()
	{
		
		driver=null;
	}
	
	@DataProvider
	public Object[][] TestDataMethod()
	{
		
		// Row stands for how many different data Types test should run
		// column stands for how many values for each test
		Object[][] obj=new Object[2][3];
		
		obj[0][0] = "gunda@cybage.com";
		obj[0][1] = "gunda";
		obj[0][2] = "TestData1";
		
		obj[1][0] = "gunda123456@cybage.com";
		obj[1][1] = "gunda123456";
		obj[1][2] = "TestData2";
		
		
		
		//System.out.println(obj.length);
		return obj;
	}
	
}
