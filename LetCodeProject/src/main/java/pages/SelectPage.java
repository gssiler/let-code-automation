package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import framework.PageObjectBase;

public class SelectPage extends PageObjectBase{

	@CacheLookup
	@FindBy(xpath = "//select[@id='fruits']")
	private WebElement selectFruit;

	@CacheLookup
	@FindBy(xpath = "//p[@class='subtitle']")
	private WebElement fruitText;

	@CacheLookup
	@FindBy(xpath = "//select[@id='lang']")
	private WebElement programmingLanguage;

	@CacheLookup
	@FindBy(xpath = "//select[@id='country']")
	private WebElement countryList;

	protected SelectPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public String selectFruit(String fruit) {

		elementControl.setByVisibleText(selectFruit, fruit);

		String fruitNameText = fruitText.getText();

		System.out.println(fruitNameText);

		return fruitNameText;

	}

	public SelectPage selectLastProgrammingLanguage() {

		Select languages = new Select (getDriver().findElement(By.id("lang")));

		int size = languages.getOptions().size();

		languages.selectByIndex(size-1);

		System.out.println(programmingLanguage.getText());

		return this;

	}

	public String selectCountryByValue(String country) {

		Select select = new Select(countryList);
		select.selectByValue(country);

		WebElement firstOption = select.getFirstSelectedOption();
		String firstOptionText = firstOption.getText();
		System.out.println("Selected Country: " + firstOptionText);

		return firstOptionText;



	}

	@Override
	protected String getRelativeUrl() {
		return null;
	}

}
