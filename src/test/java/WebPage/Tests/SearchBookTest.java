package WebPage.Tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import WebPage.ToTestLogic.AbstractSelenium;
import WebPage.pages.SearchBookPage;

public class SearchBookTest extends AbstractSelenium {
	private SearchBookPage searchBookPage;

	@Override
	@Before
	public void setUp() { // dochodzimy do testowanej strony
		super.setUp();
		searchBookPage = openLibraryPage().clickBookList();
	}

	@Test
	public void testShouldShowOneBookMoreWhenAdded() {
		Integer booksPrevSize;
		searchBookPage.clickSearchBookButton();
		booksPrevSize = searchBookPage.giveNumberOfShownBooks();
		searchBookPage.clickAddBookButton().clickAddAuthorButton().fillFirstNameInput("first").fillLastNameInput("last")
				.clickAddAuthorButtonWithData().fillTitleText("title").clickAddBookButton().clickBookListLink()
				.clickSearchBookButton();
		assertEquals(++booksPrevSize, searchBookPage.giveNumberOfShownBooks());
	}

}
