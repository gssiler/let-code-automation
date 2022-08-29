package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import framework.PageObjectBase;

public class ButtonPage extends PageObjectBase{

	@CacheLookup
	@FindBy(xpath = "//button[@id='position']")
	private WebElement positionButton;

	@CacheLookup
	@FindBy(xpath = "//button[@id='color']")
	private WebElement colorButton;

	@CacheLookup
	@FindBy(xpath = "//button[@id='property']")
	private WebElement sizeButton;

	protected ButtonPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public String getButtonLocation() {

		String location = elementControl.getLocation(positionButton).toString();

		System.out.println(location);

		return location;
	}

	public String getButtonColor() {

		String color = colorButton.getCssValue("background-color");

		System.out.println(color);

		return color;
	}

	public String getButtonSize() {

		String size = sizeButton.getSize().toString();

		System.out.println(size);

		return size;
	}

	@Override
	protected String getRelativeUrl() {
		return null;
	}

}
