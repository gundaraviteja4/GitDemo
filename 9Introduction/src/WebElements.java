import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElements {

       public static void main(String[] args) throws InterruptedException 
       {
             // TODO Auto-generated method stub

             
             WebDriver driver=new FirefoxDriver();
             
             driver.manage().window().maximize();
             driver.get("https://www.makemytrip.com/");
                         
             //  Thread.sleep(10000);
             
             //isdisplyed() is used whether the element is hidden or not but should be present in code, if element is not present in code then error will be displayed
             System.out.println("Before clicking multicity radio button");
             System.out.println("Return is diplayed?: " + driver.findElement(By.cssSelector("input#hp-widget__return")).isDisplayed());
             driver.findElement(By.xpath("//label[@for='switch__input_3']")).click();
             System.out.println("After clicking multicity radio button");
             System.out.println("Return is diplayed?: " + driver.findElement(By.cssSelector("input#hp-widget__return")).isDisplayed());
             
             //isEnabled() is used to check whether the element is present in the web page
             System.out.println("Return is enabled?: " + driver.findElement(By.cssSelector("input#hp-widget__return")).isEnabled());
             
             System.out.println(driver.findElement(By.xpath("//button[@id='addModifyBtn']")).getText());
             
             //size() is used for finding the elements in the code, if element is not present in code size will be 0
             System.out.println("Size?: " + driver.findElements(By.cssSelector(".checkSpecialCharacters")).size());  //22 elements are there with the same class
             
             Thread.sleep(3000);
          
             driver.findElement(By.xpath("//input[@id='js-multiCitySearchTo_1']")).click();
           // Select s= new Select(driver.findElement(By.xpath("//input[@id='js-multiCitySearchTo_1']")));
            
            //s.selectByIndex(4);
             Thread.sleep(3000);
            
             int count=driver.findElements(By.xpath("//li[@class='ui-menu-item']")).size();
           //  driver.close();
             System.out.println(count);
             
             for(int i=0;i<count;i++)
             {
            String s=	 driver.findElements(By.xpath("//li[@class='ui-menu-item']")).get(i).getAttribute("value");
             
            if(s.equals("Goa,India"))
            {
            	 driver.findElements(By.xpath("//li[@class='ui-menu-item']")).get(i).click();
             }
             
             
       }

}
}
