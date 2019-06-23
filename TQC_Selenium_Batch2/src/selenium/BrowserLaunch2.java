package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch2 {
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com");
		
		String yourtext= driver.findElement(By.tagName("body")).getText();

		System.out.println(yourtext);
		
		Thread.sleep(5000);
		//driver.close(); //This will only close the current tab
		
		driver.quit();

	}
}
