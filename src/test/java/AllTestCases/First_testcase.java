package AllTestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import POM_pages.CreateAccountPage;
import POM_pages.HomePage;
import POM_pages.Login_page;
import POM_pages.WelCome_page;
import Utility.Alldataprovider;

public class First_testcase extends BaseClassTest {
	@Test(priority = 1, dataProvider = "signupDetails", dataProviderClass = Alldataprovider.class)

	public void testcase1(String FirstName, String lastName, String gender, String phno, String emailid, String pwd,
			String confirmpwd) throws InterruptedException {

		WelCome_page wp = new WelCome_page(driver);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("loginBtn"))));
		Thread.sleep(2000);
		wp.ClickonLoginBtn();
		logger.info("Login Button is clicked on welcome page");

		Thread.sleep(2000);
		Login_page page = new Login_page(driver);
		page.CreateAccountbtn();
		logger.info("reached to the signup page");
		Thread.sleep(2000);

		CreateAccountPage cp = new CreateAccountPage(driver);
		cp.FillCreateaccount(FirstName, lastName, gender, phno, emailid, pwd, confirmpwd);
		
		logger.info("signup details filled succesfully");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("loginBtn"))));
		Boolean alert = wp.AlertCheck();
		
		logger.info("checking for the Account created message");
		if (alert) {
			AssertJUnit.assertTrue(true);
			System.out.println("The is created succesfully");
		}

		else {

			System.out.println("The user login credentials is already present");
			AssertJUnit.assertTrue(false);
		}
		Thread.sleep(2000);

	}

	@Test(priority = 2, dataProvider = "loginDetails", dataProviderClass = Alldataprovider.class)
	public void LoginTest(String emailid, String pwd) throws InterruptedException {
        logger.info("Login buttomn is again clicked on welcome page");
		WelCome_page wp = new WelCome_page(driver);
		wp.ClickonLoginBtn();

		Thread.sleep(2000);
		Login_page lp = new Login_page(driver);
		lp.FillUsername(emailid, pwd);
		 logger.info("login details filled succesfully");
		 Thread.sleep(2000);
		 HomePage hp=new HomePage(driver);
		 hp.selectFromList();
		 Thread.sleep(2000);
	}

}
