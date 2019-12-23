package selenium_basic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hdfc_username_frames {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Suyash\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		///-------------------------PUT AN IMPLICIT WAIT HERE-----------------------------
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.214188894.818518647.1576209335-138913865.1576209335");
		driver.switchTo().frame("login_page");
		driver.findElement(By.cssSelector("input[name='fldLoginUserId']")).sendKeys("Suyash");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("footer");
		driver.findElement(By.linkText("Privacy Policy")).click();
		
		Set<String> winids = driver.getWindowHandles();
		System.out.println(winids.size());
		Iterator <String> itr=winids.iterator();
		String NetBanking_window=itr.next();
		String policy_Window=itr.next();
		
		driver.switchTo().window(policy_Window);
		System.out.println("Title of Policy Window is:" + driver.getTitle());
		driver.findElement(By.linkText("Security")).click();
			
	}

}
