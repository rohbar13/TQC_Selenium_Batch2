package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin {
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("rahul");
		Thread.sleep(2500);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("rahul");
		Thread.sleep(2500);
		WebElement submit = driver.findElement(By.id("loginbutton"));
		submit.click();
		
		
		
		Thread.sleep(5000);
		//driver.close(); //This will only close the current tab
		
		driver.quit();

	}
}
