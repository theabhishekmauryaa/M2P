package M2P;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumDownloadLinkTest {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
	}
	
	@Test
    public void clickDownloadsAndValidateURL() {
        driver.findElement(By.xpath("//nav//a[normalize-space()='Downloads']")).click();
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);
        if (currentUrl.contains("/downloads")) {
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
