package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private WebDriver driver;

	// Locators
	private By emailInputLocator = By.id("input-email");
	private By passwordInputLocator = By.id("input-password");
	private By loginButtonLocator = By.xpath("//input[@value='Login']");
	private By forgottenPwdLocator = By.xpath("//a[text()='Forgotten Password']");
	private By logoutLinkLocator = By.linkText("Logout");

	// Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Methods
	public void enterEmail(String email) {
		WebElement emailInput = driver.findElement(emailInputLocator);
		emailInput.sendKeys(email);
	}

	public void enterPassword(String password) {
		WebElement passwordInput = driver.findElement(passwordInputLocator);
		passwordInput.sendKeys(password);
	}

	public void clickLoginBtn() {
		WebElement loginButton = driver.findElement(loginButtonLocator);
		loginButton.click();
	}

	public void clickforgottenPassword() {
		WebElement forgottenPassword = driver.findElement(forgottenPwdLocator);
		forgottenPassword.click();
	}

	public boolean checkForgotPwdLink() {
		return driver.findElement(forgottenPwdLocator).isDisplayed();
	}

	public void login(String email, String password) {
		enterEmail(email);
		enterPassword(password);
		clickLoginBtn();
	}

	public String getForgetPwdPageUrl() {
		String passwordPageUrl = driver.getCurrentUrl();
		return passwordPageUrl;
	}

	public boolean checkLogoutLink() {
		return driver.findElement(logoutLinkLocator).isDisplayed();
	}

}
