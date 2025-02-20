package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

	
	
	public RegistrationPage(WebDriver driver)
	{
		super(driver);
			
	}
	
	
	@FindBy(xpath = "//input[@id=\"input-firstname\"]")
	WebElement inputBox_FirstName;
	
	@FindBy(xpath = "//input[@id=\"input-lastname\"]")
	WebElement inputBox_LastName;
	
	@FindBy(xpath = "//input[@id=\"input-email\"]")
	WebElement inputBox_Email;
	
	@FindBy(xpath = "//input[@id=\"input-telephone\"]")
	WebElement inputBox_Telephone;
	
	@FindBy(xpath = "//input[@id=\"input-password\"]")
	WebElement inputBox_Password;
	
	@FindBy(xpath = "//input[@id=\"input-confirm\"]")
	WebElement inputBox_ConfirmPassword;
	
	@FindBy(xpath = "//input[@type=\"checkbox\"]")
	WebElement checkBox_Privacy;
	
	@FindBy(xpath = "//input[@type=\"submit\"]")
	WebElement btn_Continue;
	
	
	public void setFirstName(String fName)
	{
		inputBox_FirstName.sendKeys(fName);
	}
	
	
	public void setLastName(String lName)
	{
		inputBox_LastName.sendKeys(lName);
	}
	
	public void setEmail(String email)
	{
		inputBox_Email.sendKeys(email);
	}
	
	public void setTelephone(String phone)
	{
		
		inputBox_Telephone.sendKeys(phone);
	}
	
	public void setPassword(String pwd)
	{
		inputBox_Password.sendKeys(pwd);
	}
	
	public void setConfirmPassword(String pwd)
	{
		inputBox_ConfirmPassword.sendKeys(pwd);
	}
	
	public void clickCheckBox()
	{
		checkBox_Privacy.click();
	}
	
	public void clickContinueBTN()
	{
		btn_Continue.submit();
	}
	

}
