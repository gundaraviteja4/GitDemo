import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParentChildTraversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		// ParentChildTraversing is used when we dont have unique tagnames then we will use traversing for static websites
		//find unique parent xpath and traverse from there
		driver.findElement(By.xpath("//div[@id='gb']/div/div/div/div[1]/div[2]/a")).click();  
		
		driver.close();
		
		//driver.findElement(By.linkText("Images")).click();
		
	}

}
