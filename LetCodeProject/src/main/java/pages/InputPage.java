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

	@CacheLookup
	@FindBy(xpath = "//input[@id='clearMe']")
	private WebElement clearField;

	@CacheLookup
	@FindBy(xpath = "//input[@id='noEdit']")
	private WebElement disabledField;

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

	public String clearField() {

		elementControl.clear(clearField);
		String value = clearField.getAttribute("value");
		System.out.println(value);

		return value;
	}

	public InputPage confirmFieldIsDisabled() {

		Boolean isEnabled = elementControl.isEnabled(disabledField);

		if (isEnabled) {
			System.out.println("Element is enabled");
		}
		else {
			System.out.println("Element is not enabled");
		}

		return this;
	}



	@Override
	protected String getRelativeUrl() {
		return null;
	}

}
