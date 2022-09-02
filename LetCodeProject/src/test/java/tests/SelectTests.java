package tests;

import org.testng.annotations.Test;

import foundation.LetCodeTestBase;
import pages.HomePage;

public class SelectTests extends LetCodeTestBase{
	@Test
	public void canSelectAppleFromDropDown() {

		String fruit = "Apple";

		String fruitSelection = new HomePage(getDriver(), getBaseUrl())
				.navigate()
				.clickSelectButton()
				.selectFruit(fruit);

		int intIndex = fruitSelection.indexOf(fruit);

		if(intIndex == - 1) {
			System.out.println(fruit + " not found");
		} else {
			System.out.println("Found " + fruit + " at index " + intIndex);
		}
	}

	@Test
	public void canSelectMultipleHeros() {

		new HomePage(getDriver(), getBaseUrl())
		.navigate()
		.clickSelectButton()
		.selectLastProgrammingLanguage();

	}
}
