package PageObject.com.nopcommerce;

import org.openqa.selenium.WebDriver;

import PageUIs.com.nopcommerce.UserHomePageUI;
import commons.BasePage;
import commons.PageGeneratorManager;

public class UserHomePageObject extends BasePage{
	WebDriver driver;

	public UserHomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public RegisterPageObject clickToPageLink(String linkPageName) {
		waitForElementClickable(driver, UserHomePageUI.DYNAMIC_PAGE_LINK, linkPageName);
		clickToElement(driver, UserHomePageUI.DYNAMIC_PAGE_LINK, linkPageName);
		return PageGeneratorManager.getRegisterPage(driver);
	}

}
