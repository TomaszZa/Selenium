package WebPage.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WebPage.ToTestLogic.AbstractPageObject;

public class SearchBookPage extends AbstractPageObject {
	@FindBy(name = "dodawanie")
	private WebElement addBookButton;

	@FindBy(name = "searchButton")
	private WebElement searchBookButton;

	// @FindBy(className = "ng-scope")
	@FindBy(name = "ksiazki")
	List<WebElement> books;

	public SearchBookPage(WebDriver driver) {
		super(driver);
	}

	public AddBookPage clickAddBookButton() {
		addBookButton.click();
		return PageFactory.initElements(driver, AddBookPage.class);
	}

	public SearchBookPage clickSearchBookButton() {
		searchBookButton.click();
		return PageFactory.initElements(driver, SearchBookPage.class);
	}

	public Integer giveNumberOfShownBooks() {
		return books.size();
	}

}
