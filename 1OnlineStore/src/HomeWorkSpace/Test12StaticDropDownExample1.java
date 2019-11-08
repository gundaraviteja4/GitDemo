package HomeWorkSpace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test12StaticDropDownExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Drivers\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/login/");
		driver.findElement(By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a")).click();
		Select s1=new Select(driver.findElement(By.id("day")));
		s1.selectByIndex(10);
		Select s2=new Select(driver.findElement(By.id("month")));
		s2.selectByValue("4");
		Select s3=new Select(driver.findElement(By.id("year")));
		s3.selectByVisibleText("1992");
		
		
	}

}
