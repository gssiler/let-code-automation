package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import framework.PageObjectBase;

public class InputPage extends PageObjectBase {

	@CacheLookup
	@FindBy(xpath = "//input[@id='fullName']")
	private WebElement fullNameField;

	@CacheLookup
	@FindBy(xpath = "//input[@id='getMe']")
	private WebElement returnValue;

	protected InputPage(WebDriver driver, String baseUrl) {

		super(driver, baseUrl);
	}

	public InputPage enterFullName(String fullName) {

		elementControl.setText(fullNameField, fullName);

		return this;
	}

	public String returnValueFromField() {

		String value = returnValue.getAttribute("value");
		System.out.println(value);

		return value;
	}



	@Override
	protected String getRelativeUrl() {
		return null;
	}

}
