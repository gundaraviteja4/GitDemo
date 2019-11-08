package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingElements {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Drivers\\chromedriver.exe");
WebDriver d=new ChromeDriver();
d.get("https://www.google.com/");

//Handling Browser
d.manage().window().maximize();

String title=d.getTitle();
System.out.println("title: " + title);

String currentUrl=d.getCurrentUrl();
System.out.println("currentUrl: " + currentUrl);

//String pageSource=d.getPageSource();
//System.out.println("pageSource: " + pageSource);


String windowHandle=d.getWindowHandle();
System.out.println("windowHandle: " + windowHandle);

//Navigate commands


d.navigate().to("https://www.facebook.com/");
System.out.println("currentUrl: " + d.getCurrentUrl());


d.navigate().back();
System.out.println("currentUrl: " + d.getCurrentUrl());


d.navigate().forward();
System.out.println("currentUrl: " + d.getCurrentUrl());



//Handling Edit box

WebElement WE= d.findElement(By.id("email"));
WE.sendKeys("raviteja");
WE.clear();
WE.sendKeys("Gunda");
System.out.println(WE.getAttribute("class"));
System.out.println(WE.getText());  //doubt for edit box no output
System.out.println(WE.isDisplayed());
System.out.println(WE.isEnabled());


//Handling Text Area


WebElement w=d.findElement(By.cssSelector("#blueBarDOMInspector > div > div > div > div.lfloat._ohe > h1 > a > i"));
System.out.println(w.getText());










d.close();
d.quit();





	}

}
