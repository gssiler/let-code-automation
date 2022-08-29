package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import framework.PageObjectBase;

public class HomePage extends PageObjectBase {

	@CacheLookup
	@FindBy(xpath = "//a[@href='/edit']")
	private WebElement inputButton;

	@CacheLookup
	@FindBy(xpath = "//a[@href='/buttons']")
	private WebElement buttonsButton;

	public HomePage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public HomePage navigate() {
		super.navigateToRelativeUrl();

		return this;
	}

	public InputPage clickInputButton() {
		elementControl.clickElement(inputButton);

		return new InputPage(getDriver(), getRelativeUrl());
	}

	public ButtonPage clickButtonsButton() {
		elementControl.clickElement(buttonsButton);

		return new ButtonPage(getDriver(), getRelativeUrl());
	}

	@Override
	protected String getRelativeUrl() {
		return "test";
	}

}
