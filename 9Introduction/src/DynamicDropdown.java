import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.spicejet.com/");
		driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		
		//if both the drop down list uses single duplicate code then we use the second instance for finding 2nd element i.e (xpath)[2]
		//driver.findElement(By.xpath("(//a[@value='BOM'])[2]")).click();  //but due to some issue this is not working
		driver.findElement(By.xpath("//a[@value='BOM']")).click(); 
		
		driver.close();
	}

}
