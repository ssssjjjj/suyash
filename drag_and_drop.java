package selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_and_drop 
{

	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Suyash\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Drag me to my target')]"))).clickAndHold().moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Drop here')]"))).release().perform();
        
		
	}

}
