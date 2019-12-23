package selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediffmail_go_button 

{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Suyash\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		//String msg= driver.getCurrentUrl();
		//System.out.println(msg);

	}

}
