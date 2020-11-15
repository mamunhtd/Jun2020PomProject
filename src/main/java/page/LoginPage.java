package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Element Liberary
//	
//	By USER_NAME_LOCATOR = By.id("username");
//	WebElement USER_NAME_ELM = driver.findElement(By.id("username"));
//	  				OR
	
	@FindBy(how = How.ID, using = "username") WebElement USER_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='password']") WebElement PASSWORD_ELEMENT;	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Sign in')]") WebElement SIGNIN_BUTTON_ELEMENT;
	//@FindBy(how = How.XPATH, using = "//html/body/div/div/div/div[2]") WebElement INVALID_USER_NAME_OR_PASSWORD; 		
		
	
	//Interactive Methods
	
	public void enterUserName(String userName) {
		USER_NAME_ELEMENT.sendKeys(userName);
	}
	
	public void enterPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
	}
	
	public void clickSinginButton() {
		SIGNIN_BUTTON_ELEMENT.click();
	}
	
//					OR
	/*
	public void login(String userName, String password) {
		USER_NAME_ELEMENT.sendKeys(userName);
		PASSWORD_ELEMENT.sendKeys(password);
		SIGNIN_BUTTON_ELEMENT.click();
		
		}
		*/
		

	
	
			
			
			
			
			
			
			
			
			
			
			
			
			
	

}
