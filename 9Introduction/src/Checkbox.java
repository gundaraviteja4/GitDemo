import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new FirefoxDriver();
	
		driver.get("http://www.spicejet.com/");
		
		
		//Check whether it is already selected
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		if(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected()==false)
		{
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		}
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		driver.close();
	}

}
