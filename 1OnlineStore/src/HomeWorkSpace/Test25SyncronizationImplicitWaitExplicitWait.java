package HomeWorkSpace;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test25SyncronizationImplicitWaitExplicitWait {

public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //will applicable for every element and if the condition fails then it will wait for 5 seconds for error
driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
driver.findElement(By.id("H-destination")).sendKeys("nyc");
driver.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
driver.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER);

WebDriverWait d=new WebDriverWait(driver,20); //will applicable for particular element and if the condition fails then it will wait for 20 seconds for error
d.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='resultsContainer']/section/article[1]")));
//Thread.sleep(5000L);

driver.findElement(By.xpath("//div[@id='resultsContainer']/section/article[1]")).click();
   
}

}