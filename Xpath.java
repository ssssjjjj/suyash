package selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath 
{
	public static void main(String[] args) 
	  {
		System.setProperty("webdriver.chrome.driver","C:\\Suyash\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.findElement(By.xpath("//span[contains(text(),'AboutUs')]")).click(); ////RELATIVE Xpath
		driver.findElement(By.xpath("/html/body/header/div[2]/div/div/ul/li[3]/a/span")).click(); //// ABSOLUTE Xpath

	  }
}
