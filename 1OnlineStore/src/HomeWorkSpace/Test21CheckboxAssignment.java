package HomeWorkSpace;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Test21CheckboxAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		WebElement e = driver.findElement(By.id("checkBoxOption1"));
		Assert.assertFalse(e.isSelected());
		System.out.println(e.isSelected());
		e.click();
		Thread.sleep(2000L);
		Assert.assertTrue(e.isSelected());
		System.out.println(e.isSelected());
		e.click();
		Thread.sleep(2000L);
		Assert.assertFalse(e.isSelected());
		System.out.println(e.isSelected());
		int count = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		Assert.assertEquals(count, 3);
		System.out.println("count of checkbox:" + count);
		driver.close();
		
		
		
		
		
		
		
	}

}
