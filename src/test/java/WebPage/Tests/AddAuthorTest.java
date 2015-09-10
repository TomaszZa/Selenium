package WebPage.Tests;

import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

import WebPage.ToTestLogic.AbstractSelenium;
import WebPage.pages.AddAuthorPage;

public class AddAuthorTest extends AbstractSelenium {
	private AddAuthorPage addAuthorPage;

	@Override
	@Before
	public void setUp() { // dochodzimy do testowanej strony
		super.setUp();
		addAuthorPage = openLibraryPage().clickBookList().clickAddBookButton().clickAddAuthorButton();
	}

	@Test
	public void testShouldntBePossibleToPressAButtonWithOnlyFirstName() {
		addAuthorPage.fillFirstNameInput("firstName");
		assertFalse(addAuthorPage.checkIfAddAuthorButtonIsClicable());

	}

	@Test
	public void testShouldntBePossibleToPressAButtonWithOnlyLastName() {
		addAuthorPage.fillLastNameInput("lastName");
		assertFalse(addAuthorPage.checkIfAddAuthorButtonIsClicable());
	}

}
