
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://echoecho.com/htmlforms10.htm");
		
		
		//driver.findElement(By.xpath("//*[@value='RoundTrip']")).click();
		int count=driver.findElements(By.xpath("//input[@name='group2']")).size();
		
		
		for(int i=0;i<count;i++)
		{
			//System.out.println(driver.findElements(By.xpath("//input[@name='group2']")).get(i).getAttribute("value"));
	String s=driver.findElements(By.xpath("//input[@name='group2']")).get(i).getAttribute("value");
	
	if(s.equals("Beer"))
	{
		driver.findElements(By.xpath("//input[@name='group2']")).get(i).click();
	}
		}
		
	}

}
