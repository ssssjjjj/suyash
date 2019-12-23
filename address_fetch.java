package selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class address_fetch {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Suyash\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
//		driver.findElement(By.xpath("//html//body//header//div[2]//div//div//ul//li[3]//a//span")).click();
//		driver.findElement(By.linkText("Our Offices")).click();
//		driver.findElement(By.linkText("Chennai")).click();
		
		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'AboutUs')]"))).moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Our')]"))).moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Chennai')]"))).click().build().perform();
		Assert.assertTrue(driver.getCurrentUrl().contains("chn"));
		
	}

}
