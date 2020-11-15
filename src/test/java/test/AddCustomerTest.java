package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {
	
	WebDriver driver;
	
	@Test
	public void UserShouldBeAbleToAddCustomer() {
		
		driver = BrowserFactory.init();

		// LoginPage login1 = new LoginPage();
													// argument
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.enterUserName("demo@techfios.com");
		login.enterPassword("abc123");
		login.clickSinginButton();
		
		DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
		dashboard.vaidateDashboard();
		
		AddCustomerPage addCustonmer = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustonmer.clickOnCustomerButton();
		addCustonmer.clickOnAddCustomerButton();
		addCustonmer.enterName("JuneSelenium");
		addCustonmer.enterCompanyName("Techfios");
		addCustonmer.enterEmail("@techfios.com");
		addCustonmer.enterCountryName("Bangladesh");
		
		
		//BrowserFactory.tearDown();

	}
	
		
		
		
	}


