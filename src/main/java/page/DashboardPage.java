package page;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {
	
	WebDriver driver;
	
	public  DashboardPage (WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Dashboard')]")
	WebElement DASHBOARD_VALIDATION_ELEMENT;
	
	// Interactive Methods
	
	public void vaidateDashboard() {
		String dashBoardText = DASHBOARD_VALIDATION_ELEMENT.getText();
		Assert.assertEquals(dashBoardText, "Dashboard", "Wrong Page !!");
	}
	
	

}
