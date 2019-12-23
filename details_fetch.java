package selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class details_fetch {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Suyash\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		//driver.findElement(By.cssSelector("a[href='/computers']")).click();
		//driver.findElement(By.cssSelector("a[href='/desktops']")).click();
		
		////////------------------DETAILS FETCH USING ACTIONS----------------
		
		WebElement search = driver.findElement(By.cssSelector("input[value='Search store']"));
		Actions a=new Actions(driver);
		
		a.keyDown(search,Keys.SHIFT).sendKeys("computer").keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(2000);
		
		//a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		Assert.assertTrue(driver.getTitle().contains("Build your own cheap computer"));
		System.out.println("Test is ok");
	}

}
