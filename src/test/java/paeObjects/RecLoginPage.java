package paeObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RecLoginPage extends BasePage {

	public RecLoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@id='email-id']")
	WebElement emailField;
	
	@FindBy(name="password")
	WebElement passwordField;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement loginButton;
	
	public void loginRecApp(String mail, String pwd) {
		emailField.sendKeys(mail);
		passwordField.sendKeys(pwd);
		loginButton.click();
	}

}
