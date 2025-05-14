package M2P;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoWebShop {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void registerPage() {
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Abhishek");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Maurya");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("mauryaabhi444@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Maurya@1234");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Maurya@1234");
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}
	
	
	
	
	@Test(priority = 2)
	public void searchAndAddtoCart() {
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Laptop");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Shopping cart']")).click();
		
	}
	

	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
		
	}

}
