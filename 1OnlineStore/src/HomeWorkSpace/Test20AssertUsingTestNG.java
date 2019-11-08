package HomeWorkSpace;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Test20AssertUsingTestNG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		WebElement e = driver.findElement(By.cssSelector("input[id*='IndArm']")); // * - contains
		Assert.assertFalse(e.isSelected());
		System.out.println(e.isSelected());
		e.click();
		Assert.assertTrue(e.isSelected());
		System.out.println(e.isSelected());
		Assert.assertEquals(driver.findElements(By.xpath("//input[@type='checkbox']")).size(), 6);
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		driver.close();
	}

}
