package seleniumPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3TableGrid {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/search?ei=wlqEXZX-LKKymgfz6L1Q&q=cricket&oq=cricke&gs_l=psy-ab.3.0.0i67l3j0j0i10i67j0i67l2j0j0i67l2.2204.3397..4902...0.1..0.124.655.0j6......0....1..gws-wiz.......0i71j0i131.zRH3nn_sByk#sie=m;/g/11h3_zn2cr;5;/m/021q23;cms;fp;1;;");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement table=driver.findElement(By.xpath("//div[@class='imspo_tps__cont-wrp']/div[1]"));
		List<WebElement> rowlist=table.findElements(By.xpath("//tr[@class='imspo_tps__row-bord imspo_tps__psrow']/td[3]"));
		int count =rowlist.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			System.out.println(rowlist.get(i).getText());
			
		}
		
		
		
		
		driver.close();
	}

}
