package PageObject.com.nopcommerce;

import org.openqa.selenium.WebDriver;

import PageUIs.com.nopcommerce.MyAccountPageUI;
import PageUIs.com.nopcommerce.UserHomePageUI;
import commons.BasePage;
import commons.PageGeneratorManager;

public class MyAccountPageObject extends BasePage {
	WebDriver driver;

	public MyAccountPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isMyAccountPageDisplayed(String pageLinkName) {
		waitForElementVisible(driver, MyAccountPageUI.DYNAMIC_PAGE_LINK, pageLinkName);
		return isElementDisplayed(driver, MyAccountPageUI.DYNAMIC_PAGE_LINK, pageLinkName);
	}

	public UserAccountPageObject clickToPageLink(String pageLinkName) {
		waitForElementClickable(driver, MyAccountPageUI.DYNAMIC_PAGE_LINK, pageLinkName);
		clickToElement(driver, MyAccountPageUI.DYNAMIC_PAGE_LINK, pageLinkName);
		return PageGeneratorManager.getUserAccountPage(driver);
	}

	public void clickOnDynamicMenuByName(String menuName) {
		waitForElementClickable(driver, MyAccountPageUI.DYNAMIC_SUB_MENU, menuName);
		clickToElement(driver, MyAccountPageUI.DYNAMIC_SUB_MENU, menuName);

	}

	public void clickOnDynamicCategory(String nameCategory) {
		waitForElementClickable(driver, MyAccountPageUI.DYNAMIC_CATEGORY, nameCategory);
		clickToElement(driver, MyAccountPageUI.DYNAMIC_CATEGORY, nameCategory);
	}

	public void clickOnProductName(String productName) {
		waitForElementClickable(driver, MyAccountPageUI.DYNAMIC_PRODUCT_NAME, productName);
		clickToElement(driver, MyAccountPageUI.DYNAMIC_PRODUCT_NAME, productName);

	}

	public void clickAddYourReview() {
		waitForElementClickable(driver, MyAccountPageUI.ADD_REVIEW);
		clickToElement(driver, MyAccountPageUI.ADD_REVIEW);
	}

	public void enterReviewByClass(String reviewInput, String reviewID) {
		waitForElementVisible(driver, MyAccountPageUI.REVIEW_TITLE_TEXTBOX, reviewID);
		clickToElement(driver, MyAccountPageUI.REVIEW_TITLE_TEXTBOX, reviewID);
		sendkeyToElement(driver, MyAccountPageUI.REVIEW_TITLE_TEXTBOX, reviewInput, reviewID);

	}

	public void selectRatingByID(String ratingPoint) {
		waitForElementClickable(driver, MyAccountPageUI.RATING, ratingPoint);
		clickToElement(driver, MyAccountPageUI.RATING, ratingPoint);

	}

	public void clickOnSubmitReview() {
		waitForElementClickable(driver, MyAccountPageUI.SUBMIT_REVIEW);
		clickToElement(driver, MyAccountPageUI.SUBMIT_REVIEW);

	}

	public String getSuccessfullReviewedMessage() {
		waitForElementVisible(driver, MyAccountPageUI.RESULT_REVIEW);
		return getElementText(driver, MyAccountPageUI.RESULT_REVIEW);
	}

	public boolean isReviewTitleDisplayed(String reviewTitle) {
		waitForElementInvisible(driver, MyAccountPageUI.REVIEW_TITLE, reviewTitle);
		return isElementDisplayed(driver, MyAccountPageUI.REVIEW_TITLE, reviewTitle);
	}

	public void enterReviewText(String textReview) {
		waitForElementVisible(driver, MyAccountPageUI.REVIEW_TEXT_TEXTBOX);
		sendkeyToElement(driver, MyAccountPageUI.REVIEW_TEXT_TEXTBOX, textReview);
	}

}
