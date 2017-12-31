package wykop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoAndLogin {

	WebDriver driver;
	
	//Constructor
	
	public GoAndLogin(WebDriver driver) {
		this.driver = driver; 
	}
	
	
	// Enter the login page
	
	public void enterLoginPage() {
		
		driver.findElement(By.linkText("Zaloguj siê")).click();
		
	}
	
	// Type the login
	
	public void enterLogin(String loginInfo) {
		
		driver.findElement(By.xpath("//*[@id=\"site\"]/div/div[2]/div/div/div/div/div[2]/div[2]/form/fieldset[1]/div[1]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"site\"]/div/div[2]/div/div/div/div/div[2]/div[2]/form/fieldset[1]/div[1]/input")).sendKeys(loginInfo);
	}
	
	//Type the password
	
	public void enterPassword() {
	
		driver.findElement(By.xpath("//*[@id=\"site\"]/div/div[2]/div/div/div/div/div[2]/div[2]/form/fieldset[1]/div[2]/input")).sendKeys("7q5QVhsVpu");
	}	
		
	// Click login
	
	public void clickLogin() { 
		
		driver.findElement(By.className("unmarked-button")).click();
		
	}
	
	
}
