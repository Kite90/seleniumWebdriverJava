package wykop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardWykop {
	
	WebDriver driver;
	
	//Constructor
	
	public DashboardWykop(WebDriver driver) {
		this.driver = driver;
	}

	
	// Go to dashboard
	
	public void clickDash() {
		driver.findElement(By.cssSelector("#nav > div > ul:nth-child(3) > li.logged-user.ddC > a")).click();
	}
	
	
	// Go to settings
	
	public void clickSettings() {
		driver.findElement(By.xpath("//*[@id=\"site\"]/div/div[1]/div[1]/div[2]/div/div[2]/a")).click();
	}
	
	
}
