package WebPage.Tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import WebPage.ToTestLogic.AbstractSelenium;
import WebPage.pages.SearchAuthorPage;

public class SearchAuthorTest extends AbstractSelenium {
	private SearchAuthorPage searchAuthorPage;

	@Override
	@Before
	public void setUp() { // dochodzimy do testowanej strony
		super.setUp();
		searchAuthorPage = openLibraryPage().clickAuthorList();
	}

	@Test
	public void testShouldShowOneBookMoreWhenAdded() {
		Integer authorsPrevSize;
		searchAuthorPage.clickSearchAuthorsButton();
		authorsPrevSize = searchAuthorPage.giveNumberOfShownAuthors();
		searchAuthorPage.clickBookListLink().clickAddBookButton().clickAddAuthorButton().fillFirstNameInput("first")
				.fillLastNameInput("last").clickAddAuthorButtonWithData().fillTitleText("title").clickAddBookButton()
				.clickBookListLink().clickAuthorListLink().clickSearchAuthorsButton();
		assertEquals(++authorsPrevSize, searchAuthorPage.giveNumberOfShownAuthors());
	}

}