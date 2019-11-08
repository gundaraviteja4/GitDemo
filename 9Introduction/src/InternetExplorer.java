import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		System.setProperty("webdriver.ie.driver", "D:\\selenium\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver();
		
		
		driver.get("https:www.google.com");
		System.out.println(driver.getTitle());
	}

}
