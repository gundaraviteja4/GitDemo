package HomeWorkSpace;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test14DynamicDropDownExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		WebElement x= driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		x.click();
		WebElement e = driver.findElement(By.xpath("//a[@value='MAA']"));
		e.click();
		
		WebElement p = driver.findElement(By.xpath("(//a[@value='BLR'])[2]")); // I am using the 2nd bangalore option since the bangalore is present in 1st drop down option and we are telling to select from 2nd drop down
		p.click();
		
		driver.close();
	}

}
