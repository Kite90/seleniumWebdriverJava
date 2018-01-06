package meteoSelenium;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ControlPanel {

    @Test
	public void checkWeather() {
		
    	// Initialize the driver
    	WebDriver driver = utilities.DriverFactory.open("chrome");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://www.meteo.pl/");
		
		// Create instance
		OpenCity user1 = new OpenCity(driver);
		
		// Pick the "Model UM"
		user1.modelUm();
		
		//Check if it is the right model
		user1.checkModel();
		
		//Use coordinates to choose the city
		user1.chooseCoordinates();
		
		//Change the window
		 ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
         driver.switchTo().window(windows.get(1));
         
         //Last test
         user1.lastTest();
	}
	
	
	
	
}
