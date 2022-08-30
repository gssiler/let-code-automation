package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import foundation.LetCodeTestBase;
import pages.HomePage;

public class ButtonTests extends LetCodeTestBase {
	@Test
	public void canGetLocationOfButton() {

		String expectedLocation = "(72, 338)";

		String actualLocation = new HomePage(getDriver(), getBaseUrl())
				.navigate()
				.clickButtonsButton()
				.getButtonLocation();

		assertEquals(actualLocation, expectedLocation, "A location of (72, 338) was not found. Please try again.");

	}

	@Test
	public void canGetColorOfButton() {

		String expectedColor = "rgba(138, 77, 118, 1)";

		String actualColor = new HomePage(getDriver(), getBaseUrl())
				.navigate()
				.clickButtonsButton()
				.getButtonColor();

		assertEquals(actualColor, expectedColor, "The expected color does not match the actual color of the button.");

	}

	@Test
	public void canGetSizeOfButton() {

		String expectedSize = "(176, 40)";

		String actualSize = new HomePage(getDriver(), getBaseUrl())
				.navigate()
				.clickButtonsButton()
				.getButtonSize();

		assertEquals(actualSize, expectedSize, "A size of (176, 40) was not detected. Please try again.");
	}
}
