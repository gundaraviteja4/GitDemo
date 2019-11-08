package HomeWorkSpace;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test17RadioButtonsExample1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver2.46\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		
		driver.findElement(By.xpath("//input[@value='Cheese']")).click();  // to click radio button using value attribute
		
		Thread.sleep(2000L);
		int count = driver.findElements(By.xpath("//input[@type='radio']")).size(); //count of radio buttons in the page
		
		for(int i=0; i<count;i++)
		{
			String s=driver.findElements(By.xpath("//input[@type='radio']")).get(i).getAttribute("value");
			
			if(s.equals("Beer"))
			{
				driver.findElements(By.xpath("//input[@type='radio']")).get(i).click();
			}
			
			
			
			
			
		}
		
		

	}

}
