package M2P;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoQAHandleFrame {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
	}
	
	@Test
	public void handleFrame() {
		
		driver.switchTo().frame("frame1");
		WebElement heading = driver.findElement(By.id("sampleHeading"));
		String headingText = heading.getText();
		System.out.println("Iframe Heading Text: " + headingText);

		if (headingText.equals("This is a sample page")) {
		    System.out.println("Success.");
		} else {
		    System.out.println("Fail");
		}
		
		driver.switchTo().defaultContent();

	}
	
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
		
	}
	
	

}



