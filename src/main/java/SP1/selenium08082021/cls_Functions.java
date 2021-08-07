package SP1.selenium08082021;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cls_Functions {
	
	static WebDriver wd;
    public static WebDriver driver()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver1\\chromedriver.exe");  
    	 WebDriver driver = new ChromeDriver();
    	return driver;
    }
  
   public static void printtitle()
   {
	   ///// Comments 
	   //// test 1ldfjsjdfklsjf
	   
	   wd = driver();
	   
	   wd.navigate().to("https://freecrm.com/");
	   
	   wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   wd.manage().timeouts().pageLoadTimeout(20,TimeUnit.MINUTES);
	   System.out.println(wd.getTitle());
	   System.out.println(wd.findElement(By.xpath("//div[@class='telephone']/span")).getAttribute("innerText"));
   }
    

   public static void printgoogletitle()
   {
	   ///// Comments 
	   //// test 1ldfjsjdfklsjf
	   
	   //wd = driver();
	   
	   wd.navigate().to("https://www.google.co.in");
	   
	   wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   wd.manage().timeouts().pageLoadTimeout(20,TimeUnit.MINUTES);
	   System.out.println(wd.getTitle());
	   wd.findElement(By.xpath("//input[@name='q']")).sendKeys("w3schools");
	   wd.findElement(By.xpath("//input[@name='btnK']")).click();
	   wd.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	   wd.findElement(By.xpath("//a[@href=\"https://www.w3schools.com/\"]")).click();
	   wd.quit();
   }
    

	

}
