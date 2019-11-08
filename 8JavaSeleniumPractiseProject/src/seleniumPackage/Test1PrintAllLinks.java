package seleniumPackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1PrintAllLinks {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//find all the elements having links
		List<WebElement> s=driver.findElements(By.tagName("a"));   
		System.out.println(s.size());
		
		
		//find all the elements having links in footer section
		WebElement e1=driver.findElement(By.xpath("//div[@id='gf-BIG']")); //footer section
		System.out.println(e1.findElements(By.tagName("a")).size());  
		
		//find all the elements having links in the 1st column of footer section
		WebElement e2=driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul")); //In footer Section, 1st column
		List<WebElement> links=e2.findElements(By.tagName("a"));
		int count=links.size();
		System.out.println(count); 
		
		
		//click all the links in the 1st column of footer section
		for(int i=0;i<count;i++)
		{
			
			System.out.println(links.get(i).getText()); 
			String s1=Keys.chord(Keys.CONTROL,Keys.ENTER);
			links.get(i).sendKeys(s1);
			Thread.sleep(4000);
			//Actions a=new Actions(driver);
			//a.moveToElement(links.get(i)).keyDown(Keys.CONTROL).click().build().perform();   //we can use Actions class also but we are getting issue- driver is switching to the other tab
			
		}
		
		//get title of each tab 
		Set<String> windows=driver.getWindowHandles();
		System.out.println(windows.size());
		Iterator<String> it=windows.iterator();
		
		for(int j=0;j<count;j++)
		{
			String tab1=it.next();
			System.out.println(driver.switchTo().window(tab1).getTitle());
			Thread.sleep(5000);
		}
		
	}

}
