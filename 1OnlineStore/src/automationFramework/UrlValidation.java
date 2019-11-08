package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class UrlValidation {

	public static void main(String[] args) {
 WebDriver driver = new FirefoxDriver();
 
 
 String url ="http://www.store.demoqa.com";
 
 
 driver.get(url);
 
 
 String Title= driver.getTitle();
 int Titlelength= driver.getTitle().length();
 
 System.out.println("Title of the page is : " + Title);
	System.out.println("Length of the title is : "+ Titlelength);
	
	
	
	String pageurl= driver.getCurrentUrl();
	
	if (pageurl==url)
	{
		 System.out.println("Correct URL: " + pageurl );
	}
	else
	{
		System.out.println("Wrong URL: " + pageurl );
	}

	
	String pagesource= driver.getPageSource();
	
	int pagesourcelength= pagesource.length();
	
	
	
	System.out.println("pagesource of the page is : " + pagesource);
	System.out.println("Length of the pagesource is : "+ pagesourcelength);
	
	driver.close();
	}

}
