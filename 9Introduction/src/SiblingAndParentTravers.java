import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SiblingAndParentTravers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://login.salesforce.com/");
		
		//Find sibling: xpath/following-sibling::tagname[x]
		driver.findElement(By.xpath("//a[@id='forgot_password_link']/following-sibling::a[1]")).click();
		
		
		//Find parent using child: xpath/parent::tagname ----------------> In CSS this is not possible, this is the major difference in xpath and CSS
		System.out.println(driver.findElement(By.xpath("//button[@id='hint_back_domain']/parent::div")).getTagName());
		driver.close();
	}

}
