package HomeWorkSpace;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test15ParentChildTraverseOfExampleTest14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver2.46\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		WebElement x= driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		x.click();
		WebElement e = driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='MAA']"));   //there will be a space between parent and child
		e.click();
		
		WebElement p = driver.findElement(By.xpath("(//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR'])")); // since not to use indexes we use parent and child traverse
		p.click();
		
		driver.close();

	}

}
