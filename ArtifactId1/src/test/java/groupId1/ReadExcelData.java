package groupId1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

//import org.apache.logging.log4j.*;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class ReadExcelData {

	WebDriver driver;
	
	
	
//	private static Logger log=LogManager.getLogger(ReadExcelData.class.getName());
	@BeforeTest
	public void launchloginpage()
	{
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("userAccountLink")).click();
		driver.findElement(By.xpath("//input[@id='SignIn']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='modal_window']")));
		
	}
	@Test(dataProvider = "retrieveData")
	public void GetExcelData(String p,String q)
	{
		
		
		
		WebElement e1 =driver.findElement(By.cssSelector("input#email"));
				e1.sendKeys(p);
		WebElement e2 =driver.findElement(By.cssSelector("input#password"));
				e2.sendKeys(q);
		driver.findElement(By.id("signInButton")).click();
		e1.clear();
		e2.clear();
		System.out.print("Tests with: " + p + "\t" +  q +"\n");
	}
	
	@DataProvider(name="retrieveData")
	public Object[][] GetData() throws IOException 
	{
		File f=new File("D:\\selenium\\Book1.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		Sheet s=wb.getSheetAt(0);
		int rowscount=s.getLastRowNum()-s.getFirstRowNum();
		int x=rowscount+1;
		Object[][] a=new Object[x][2];
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<s.getRow(i).getLastCellNum();j++)
			{
				a[i][j]=s.getRow(i).getCell(j).toString();
				//System.out.print(a[i][j] + "\t" + "|");
	//			log.info(a[i][j]+ "\t" + "|");
			}
			//System.out.println("\n");
		}
		wb.close();
		return a;
		
	}


	
	
}
