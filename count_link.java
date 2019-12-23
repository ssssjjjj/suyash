package selenium_basic;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class count_link 
{
	public static void main(String[] args) 
  {
	System.setProperty("webdriver.chrome.driver","C:\\Suyash\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	List<WebElement> Links=driver.findElements(By.tagName("a"));
	System.out.println(Links.size());
	for (int i=0;i<Links.size();i++)
	{
		System.out.println(Links.get(i).getText());
		//Thread.sleep(200);
	}
  }
}