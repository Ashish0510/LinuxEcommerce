package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	WebDriver driver;
	public Login_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy (id="Email") 
	WebElement Username;
	
	@FindBy (id="Password") 
	WebElement Pwd;
	
	
	@FindBy (xpath="//span[text()='Login']") 
	WebElement LoginBtn;
	
	
	
	@FindBy (xpath="//span[text()='Create Account']") 
	WebElement createAccount;
	
	
	
	public void FillUsername(String Nam,String password) {
		Username.sendKeys(Nam);
		Pwd.sendKeys(password);
		LoginBtn.click();
		
	}
	
	public void CreateAccountbtn() {
		createAccount.click();
	}
	
	
	

}
