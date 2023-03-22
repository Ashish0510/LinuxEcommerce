package POM_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelCome_page {
	WebDriver driver;
	public WelCome_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="loginBtn") 
    WebElement ClickLoginbtn;
	
	
	public void ClickonLoginBtn() {
		ClickLoginbtn.click();
		
	}
	
public boolean AlertCheck() {
		
		/*WebDriverWait wait=new WebDriverWait(driver,20);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		String alertpop=alert.getText();
		
		System.out.println(alertpop);*/
		try {
		
		driver.findElement(By.xpath("//div[contains(text(),'Successfully Registered')]"));
		return true;
		} 
		catch(Exception e) {
			e.getMessage();
			return false;
			
		}
		
		
		
		
	}


}
