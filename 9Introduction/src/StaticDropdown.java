import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub

		WebDriver driver= new FirefoxDriver();
	
		driver.get("http://www.spicejet.com/");
		
		Select s=new Select(driver.findElement(By.cssSelector("select[id='ctl00_mainContent_DropDownListCurrency']")));
		s.selectByIndex(0);

		s.selectByValue("USD");

		s.selectByVisibleText("AED");
	
		driver.close();
	}

}
