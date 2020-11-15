package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {

	WebDriver driver;

	@Test(priority = 1)
	public void validUserShouldBeAbleToLogIn() {

		driver = BrowserFactory.init();

		// LoginPage login1 = new LoginPage();
													// argument
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.enterUserName("demo@techfios.com");
		login.enterPassword("abc123");
		login.clickSinginButton();
		
		DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
		dashboard.vaidateDashboard();
		
		BrowserFactory.tearDown();

	}
	
	
	@Test(priority = 2)
	public void invalidUserShouldBeAbleToLogIn() {

		driver = BrowserFactory.init();

		// LoginPage login1 = new LoginPage();
													// argument
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.enterUserName("demo@techfios.com");
		login.enterPassword("abc1234");
		login.clickSinginButton();
		
//		DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
//		dashboard.vaidateDashboard();
		
		BrowserFactory.tearDown();

	}
 
}
