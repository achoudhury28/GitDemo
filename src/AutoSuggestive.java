import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new FirefoxDriver();		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(4000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option : options) {
			
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}
			
			
			
			
		}

	}

}