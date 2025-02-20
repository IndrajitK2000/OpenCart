package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	
	public HomePage(WebDriver driver)
	{
		super(driver);
		
	}
	
	@FindBy(xpath = "//a[@title=\"My Account\"]")
	WebElement btnMyAccount;
	
	@FindBy(xpath = "//a[text()=\"Register\"]")
	WebElement btnRegister;
	
	
	public void clickMYAccount()
	{
		btnMyAccount.click();
	}
	
	
	public void clickRegister()
	{
		btnRegister.click();
	}
}
