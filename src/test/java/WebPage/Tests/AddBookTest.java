package WebPage.Tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import WebPage.ToTestLogic.AbstractSelenium;
import WebPage.pages.AddBookPage;

public class AddBookTest extends AbstractSelenium {
	private AddBookPage addBookPage;

	@Override
	@Before
	public void setUp() { // dochodzimy do testowanej strony
		super.setUp();
		addBookPage = openLibraryPage().clickBookList().clickAddBookButton();
	}

	@Test
	public void testShouldntBePossibleToPressAButtonWithoutAuthor() {
		addBookPage.fillTitleText("Tytul");
		assertFalse(addBookPage.checkIfAddBookButtonIsPressed());
	}

	@Test
	public void testShouldntBePossibleToPressAButtonWithoutTitle() {
		addBookPage.clickAddAuthorButton().fillFirstNameInput("first").fillLastNameInput("last")
				.clickAddAuthorButtonWithData();
		assertFalse(addBookPage.checkIfAddBookButtonIsPressed());
	}

	@Test
	public void testShouldBePossibleToPressAButtonWithoutTitleAndAuthor() {
		addBookPage.clickAddAuthorButton().fillFirstNameInput("first").fillLastNameInput("last")
				.clickAddAuthorButtonWithData().fillTitleText("title");
		assertTrue(addBookPage.checkIfAddBookButtonIsPressed());
	}

}
