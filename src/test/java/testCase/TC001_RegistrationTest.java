package testCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObject.HomePage;

public class TC001_RegistrationTest {

	public WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		
		driver.get("https://demo.opencart.com.gr/");	
		
	}
	
	
	@Test
	public void verify_Registration()
	{
		HomePage hPage=new HomePage(driver);
		
		hPage.clickMYAccount();
		hPage.clickRegister();
	}
	
	
	/*@AfterClass
	public void tearDown()
	{
		driver.close();
	}*/
}
