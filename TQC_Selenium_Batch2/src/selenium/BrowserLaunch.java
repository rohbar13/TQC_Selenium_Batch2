package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com");
		
		String expectedString = " Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com ";
												//This we have already saved for comparison 
		
		String actualString = driver.getTitle();// This will be available at run time
		
		
		expectedString = expectedString.trim(); // to remove the spaces from start and end
		actualString = actualString.trim(); // to remove the spaces from start and end
		
		
		if(expectedString.equalsIgnoreCase(actualString)) {
			System.out.println("Page is correctly displayed");
		}else {
			System.out.println("Page is incorrectly displayed");
		}
		
		Thread.sleep(5000);
		//driver.close(); //This will only close the current tab
		
		driver.quit();

	}
}
