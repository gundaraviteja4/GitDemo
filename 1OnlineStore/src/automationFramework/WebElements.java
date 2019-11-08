package automationFramework;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.nopcommerce.com/");
			
		WebElement element = driver.findElement(By.linkText("Log in")); 
				
		element.click();
		
		WebElement element1=driver.findElement(By.id("ctl00_ctl00_cph1_cph1_ctrlCustomerLogin_LoginForm_UserName"));
		
		element1.sendKeys("raviteja");
		
		
		//Clear command
		element1.clear();   //Clear command clears the data in the text field
		
		
		
		
		//isDisplayed command
		if(element1.isDisplayed())  //IsDisplayed method demonstration
		{
			System.out.println("Element is displayed/present");
		}
		
		else
		{
			System.out.println("Element is not displayed/present");
		}
		
		
		
		
		//isEnabled command
		if(element1.isEnabled())  //IsDisplayed method demonstration
		{
			System.out.println("Element is Enabled");
		}
		
		else
		{
			System.out.println("Element is not Enabled");
		}
		
		WebElement element2=driver.findElement(By.linkText("Register"));
		
		element2.click();
		
		
				
		
		
		//isSelected command-I would like to receive newsletters: Check box
		WebElement element3=driver.findElement(By.id("ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_cbNewsletter"));
		
		if(element3.isSelected())
		{
			System.out.println("Element is selected");
			
		}
		
		else
		{
			System.out.println("Element is not selected");
		}
		
		//Your role: Select box
		WebElement element4=driver.findElement(By.id("ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_ddlRole"));
		
		
		if(element4.isSelected())
		{
			System.out.println("Element is selected");
		}
		
		else
		{
			System.out.println("Element is not selected");
		}
		
		
		
		
		
		//Submit command need to work
		
		
		
		
		
		//GetText Command
		
		
		WebElement element5= driver.findElement(By.name("ctl00$ctl00$cph1$cph1$ctrlCustomerRegister$CreateUserForm$CreateUserStepContainer$ddlCountry"));
		
		
		String Text=element5.getText();
		
		
		System.out.println("getText Value:" + Text);
				
	    
		//getTagName- This does not return the value of the name attribute but return the tag for e.g. “input“ for the element <input name="foo"/>.
		String TagName=element5.getTagName();
		
		
		System.out.println("TagName Value:" + TagName);
		
	
		
		
		
		//getCssvalue--need to work
		
		
		String cssvalue=element5.getCssValue("font-size");
		
		System.out.println("Css Value: " + cssvalue);
		
		
		//getAttribute
		
		
		String attribute=element5.getAttribute("name");
		
		System.out.println("Attribute Value:" + attribute);
		
		
		
		
		//getSize
		
		
		Dimension D=element5.getSize();
		
		System.out.println("Height: " + D.height+ "           " + "Width: " + D.width);
		
		
		
		//getLocation
		Point p= element5.getLocation();
		
		System.out.println("X coordinate: "+ p.x + " Y Coordinate: "+ p.getY());
		
		
		
		driver.close();
		
		
		
		
	}

}
