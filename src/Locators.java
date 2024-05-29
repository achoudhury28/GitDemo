import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("rahul");
		driver.findElement(By.className("signInBtn")).click();
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Jhon");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("jhon@rsa");
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("jhon@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("3453345543");
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[2]")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
//		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("abdul");
//		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
//		driver.findElement(By.id("chkboxOne")).click();
//		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
//		
		
		
		
		
		
		
		
		
		

		
	}

}
