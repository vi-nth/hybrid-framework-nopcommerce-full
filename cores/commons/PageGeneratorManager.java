package commons;

import org.openqa.selenium.WebDriver;

import PageObject.com.nopcommerce.RegisterPageObject;
import PageObject.com.nopcommerce.UserHomePageObject;

public class PageGeneratorManager {
	
	public static UserHomePageObject getUserHomePage(WebDriver driver) {
		return new UserHomePageObject(driver);

	}
	
	public static RegisterPageObject getRegisterPage(WebDriver drvier) {
		return new RegisterPageObject(drvier);
	}

}
