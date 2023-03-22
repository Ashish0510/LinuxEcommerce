package POM_pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccountPage {
	String text1="Given Email ID or Phone number already used";
	WebDriver driver;
	public CreateAccountPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}

	
	@FindBy(name="First Name") 
	WebElement firstName;
	
	@FindBy(name="Last Name") 
	WebElement lastName;
	
	By gender=By.xpath("//section[@style='display: flex; width: 90%; align-items: center; justify-content: space-evenly; gap: 10px;']/label");
	
	@FindBy(id="Phone Number") 
	WebElement phoneNumber;
	
	@FindBy(id="Email Address") 
	WebElement Email;
	
	@FindBy(id="Password") 
	WebElement password;
	
	@FindBy(name="Confirm Password") 
	WebElement confpassword;
	
	@FindBy(xpath="//input[@id='Terms and Conditions']") 
	WebElement Termcon;
	
	@FindBy(xpath="//button[@class='signup_bn5__l1dQe']") 
	WebElement clickRegisterbtn;
	
	//xpath="//button[@class='signup_bn5__l1dQe']"
	
	
	
	
	
	
	
	public void FillCreateaccount(String firstNam,String lastNam,String Genderr,String ph,String email,String pwd,String confpwd ) throws InterruptedException {
		firstName.sendKeys(firstNam);
		lastName.sendKeys(lastNam);
		List<WebElement> Gen = driver.findElements(gender);
		for(WebElement gen1:Gen) {
			if((gen1.getText()).equalsIgnoreCase(Genderr)) {
				gen1.click();
			}
		}
		phoneNumber.sendKeys(ph);
		Email.sendKeys(email);
		password.sendKeys(pwd);
		confpassword.sendKeys(confpwd);
		Termcon.click();
		Thread.sleep(2000);
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",clickRegisterbtn);
		
		////div[contains(text(),'Given Email ID or Phone number already used')]
		
	
	}
	
	

}
