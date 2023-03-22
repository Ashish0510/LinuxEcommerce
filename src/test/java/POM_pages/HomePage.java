package POM_pages;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	 
	@FindBy(xpath="//div[@class='MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-bjoz8z']")
	WebElement myprofileDropDownElement;
	
	@FindBy(xpath="//ul[@class='MuiList-root MuiList-padding MuiMenu-list css-r8u8y9']/li")
    List<WebElement> listofMyProfile;
	
	

	public void selectFromList() {
		myprofileDropDownElement.click();
		for(WebElement ele:listofMyProfile) {
			if((ele.getText()).equalsIgnoreCase("logout")) {
				ele.click();
			}
		}
	}

}
