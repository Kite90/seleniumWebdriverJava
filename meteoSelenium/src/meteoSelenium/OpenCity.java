package meteoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class OpenCity {

	WebDriver driver; 
	
	//Constructor
	public OpenCity(WebDriver driver) {
		this.driver = driver;
	}
	
	//Click the MODEL UM tab
	public void modelUm() {
		driver.findElement(By.id("tab_um")).click();
	}
	
	// Check the model
	public void checkModel() {
	String titleModel = driver.findElement(By.cssSelector("#info_coamps > table > tbody > tr > td:nth-child(1)")).getText();
	
	Assert.assertEquals(titleModel, "MODEL UM");
	
	}
	
	//Choose the city
	public void chooseCoordinates() {
		//North - Degrees
		driver.findElement(By.name("N_DEG")).click();
		driver.findElement(By.name("N_DEG")).sendKeys("51");
		
		//North - Minutes
		driver.findElement(By.name("N_MIN")).click();
		driver.findElement(By.name("N_MIN")).sendKeys("110");
		
		//East - Degrees
		driver.findElement(By.name("E_DEG")).click();
		driver.findElement(By.name("E_DEG")).sendKeys("17");
		
		//East - Minutes
		driver.findElement(By.name("E_MIN")).click();
		driver.findElement(By.name("E_MIN")).sendKeys("0.30");
		
		driver.findElement(By.cssSelector("#kon_3c_b > div:nth-child(2) > div > table > tbody > tr:nth-child(2) > td > div > form > table > tbody > tr:nth-child(2) > td:nth-child(7) > div > a")).click();
	}
	
	
	public void lastTest() {
		String modelTwo = driver.findElement(By.id("model_napis")).getText();
        Assert.assertEquals(modelTwo, "UM");
        System.out.println("Weather was checked succesfully!");
	}
	
}
