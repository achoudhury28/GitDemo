import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {
	public static void main(String[] args) {
		
		//Invoking Browser
		
	//key value = webdriver.chrome.driver->value of path
		
	//	System.setProperty("webdriver.chrome.driver", "/Users/abdulchoudhury/Documents/chromedriver-mac-arm64/chromedriver");
		
	//WebDriverManager.chromedriver().setup();	
	//WebDriver driver = new ChromeDriver();
	
	WebDriver driver = new FirefoxDriver();
	driver.get("https://rahulshettyacademy.com");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.close();
	
	
	
		
		
	}

}
