package selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation_demo {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Suyash\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(500);
		driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(500);
		System.out.println(driver.getTitle());
		driver.navigate().back();
		Thread.sleep(500);
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		Thread.sleep(500);
		System.out.println(driver.getTitle());

	}

}
