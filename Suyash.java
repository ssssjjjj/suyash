package selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Suyash

{    
      WebDriver driver;
      
      @Test
      public void passtest() 
      
      {
          driver.findElement(By.linkText("SignIn")).click();
      }
	  
	  @BeforeMethod
	  public void beforeMethod() 
	  { 
		  System.setProperty("webdriver.chrome.driver","C:\\Suyash\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/");
	  }
	  
	  @AfterMethod
	  public void afterMethod()
	  {
		  Assert.assertEquals(driver.getTitle(),"Login");
		  System.out.println("success");
	  }
	  
  
}
