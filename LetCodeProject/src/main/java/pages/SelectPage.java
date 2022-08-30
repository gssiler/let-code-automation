package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import framework.PageObjectBase;

public class SelectPage extends PageObjectBase{

	@CacheLookup
	@FindBy(xpath = "//select[@id='fruits']")
	private WebElement selectFruit;

	@CacheLookup
	@FindBy(xpath = "//p[@class='subtitle']")
	private WebElement fruitText;

	protected SelectPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public String selectFruit(String fruit) {

		elementControl.setByVisibleText(selectFruit, fruit);

		String fruitNameText = fruitText.getText();

		System.out.println(fruitNameText);

		return fruitNameText;

	}

	@Override
	protected String getRelativeUrl() {
		return null;
	}

}
