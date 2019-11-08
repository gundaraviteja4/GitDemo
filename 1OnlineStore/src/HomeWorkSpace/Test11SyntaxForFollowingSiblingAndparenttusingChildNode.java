package HomeWorkSpace;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11SyntaxForFollowingSiblingAndparenttusingChildNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\ChromeDriver2.46\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.findElement(By.xpath("//input[text()='I'm Feeling Lucky']")).isEnabled());
		//driver.findElement(By.xpath("//input[@name='btnK']/following-sibling::input")).click();   // clicking I'm feeling lucky using sibling google search
		// for preceding sibling - preceding-sibling::tagname
		// syntax to find parent node - xpath/parent::tagname
	}

}
