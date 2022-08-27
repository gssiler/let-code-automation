package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import foundation.LetCodeTestBase;
import pages.HomePage;

public class InputTests extends LetCodeTestBase{

	@Test
	public void canEnterFullName() {

		String fullName = "John Doe";

		new HomePage(getDriver(), getBaseUrl())
		.navigate()
		.clickInputButton()
		.enterFullName(fullName);

	}

	@Test
	public void canReturnValueFromTextField() {

		String value = "ortonikc";

		String actualValue = new HomePage(getDriver(), getBaseUrl())
				.navigate()
				.clickInputButton()
				.returnValueFromField();

		assertEquals(actualValue, value, "The expeceted value and the actual value do not match.");

	}

	@Test
	public void canClearTextFromField() {

		String expectedText = "";

		String actualText = new HomePage(getDriver(), getBaseUrl())
				.navigate()
				.clickInputButton()
				.clearField();

		assertEquals(actualText, expectedText);

	}

	@Test
	public void canConfirmEditFieldIsDisabled() {

		new HomePage(getDriver(), getBaseUrl())
		.navigate()
		.clickInputButton()
		.confirmFieldIsDisabled();
	}
}
