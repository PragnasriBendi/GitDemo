package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import paeObjects.CandLoginPage;
import paeObjects.RecLoginPage;

public class TC_001 {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://sit.vriti.ai/login");     
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void testCandLogin() throws InterruptedException {
		CandLoginPage cp = new CandLoginPage(driver);
		cp.loginCandApp("vritisep.22.1@gmail.com", "Pragna@111");
		
	}
	
	@Test(priority=2)
	public void testRecLogin() {
		RecLoginPage rp = new RecLoginPage(driver);
		rp.loginRecApp("vritisep.22.30@gmail.com", "Pragna@111");
		System.out.println("I am king");
		System.out.println("I can do it");
		
	}
	
	//@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
