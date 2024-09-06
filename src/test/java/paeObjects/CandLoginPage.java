package paeObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CandLoginPage extends BasePage {

	public CandLoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@id='email-id']")
	WebElement emailIdField;
	
	@FindBy(name="password")
	WebElement passwordField;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement loginButton;
	
	public void loginCandApp(String mail, String pwd) throws InterruptedException {
		emailIdField.sendKeys(mail);
		passwordField.sendKeys(pwd);
		loginButton.click();
		Thread.sleep(8000);		
	}
}
