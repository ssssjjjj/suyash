package selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class filling_TestMe_registration {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Suyash\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.findElement(By.linkText("SignUp")).click();
		driver.findElement(By.id("userName")).sendKeys("sssssss");	
		driver.findElement(By.id("firstName")).sendKeys("sssssss");
		driver.findElement(By.id("lastName")).sendKeys("sssssss");
		driver.findElement(By.id("password")).sendKeys("sssssss");
		driver.findElement(By.id("pass_confirmation")).sendKeys("sssssss");
		driver.findElement(By.cssSelector("Input[id='gender'][value='Male']")).click();
		driver.findElement(By.id("emailAddress")).sendKeys("ssss@g.com");
		driver.findElement(By.id("mobileNumber")).sendKeys("9999999999");
		driver.findElement(By.className("ui-datepicker-trigger")).click();
		//driver.findElement(By.className("ui-datepicker-month")).click();
		
		Select date = new Select(driver.findElement(By.className("ui-datepicker-year")));
		date.selectByValue("1997");
		
		Select date1 = new Select(driver.findElement(By.className("ui-datepicker-month")));
		date1.selectByValue("0");
		
		driver.findElement(By.linkText("12")).click();
		
		driver.findElement(By.id("address")).sendKeys("ssssssssssss");
		
		Select q = new Select(driver.findElement(By.id("securityQuestion")));
		q.selectByValue("411012");
		
		driver.findElement(By.id("answer")).sendKeys("sssssss");
		driver.findElement(By.className("btn")).submit();
			

	}

}
