package wykop;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import org.junit.Test;


public class LoginWykop {
	
	@Test
	public void wykopLoginTest() {
		
		//1. Initialize driver
		
		WebDriver driver = utilities.DriverFactory.open("chrome");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.wykop.pl/");
		
		
		//2. Go and Login
		
		GoAndLogin goAndLog = new GoAndLogin(driver);
		goAndLog.enterLoginPage();
		goAndLog.enterLogin("testacc");
		goAndLog.enterPassword();
		goAndLog.clickLogin();
		
		// 3. Go to dashboard
		
		DashboardWykop dash = new DashboardWykop(driver);
		dash.clickDash();
		dash.clickSettings();
		
	}
	
	

}
