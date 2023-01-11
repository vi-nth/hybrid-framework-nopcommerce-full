package commons;

import org.openqa.selenium.WebDriver;

import PageObject.com.nopcommerce.AddressPageObject;
import PageObject.com.nopcommerce.LoginPageObject;
import PageObject.com.nopcommerce.MyAccountPageObject;
import PageObject.com.nopcommerce.RegisterPageObject;
import PageObject.com.nopcommerce.UserAccountPageObject;
import PageObject.com.nopcommerce.UserHomePageObject;
import PageObject.com.nopcommerce.UserPasswordPageObject;

public class PageGeneratorManager {
	
	public static UserHomePageObject getUserHomePage(WebDriver driver) {
		return new UserHomePageObject(driver);

	}
	
	public static RegisterPageObject getRegisterPage(WebDriver drvier) {
		return new RegisterPageObject(drvier);
	}

	public static LoginPageObject getLoginPage(WebDriver driver) {
		return new LoginPageObject(driver);
		
	}
	
	public static MyAccountPageObject getMyAccountPage(WebDriver driver) {
		return new MyAccountPageObject(driver);
		
	}
	
	public static UserAccountPageObject getUserAccountPage(WebDriver driver) {
		return new UserAccountPageObject(driver);
		
	}
	
	public static AddressPageObject getAddressPage(WebDriver driver) {
		return new AddressPageObject(driver);
		
	}
	
	public static UserPasswordPageObject getUserPasswordPage(WebDriver driver) {
		return new UserPasswordPageObject(driver);
		
	}
}
