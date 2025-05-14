package M2P;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageTitle {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
	}

		@Test
	    public void verifySeleniumTitleWithIf() {
	        driver.get("https://www.selenium.dev/");
	        
	        String actualTitle = driver.getTitle();
	        System.out.println("Page Title: " + actualTitle);

	        if (actualTitle.contains("Selenium")) {
	            System.out.println("Success");
	        } else {
	            System.out.println("Fail");
	        }
	    
	}
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
		
	}

}
