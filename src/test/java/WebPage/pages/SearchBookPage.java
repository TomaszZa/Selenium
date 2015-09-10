package WebPage.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WebPage.ToTestLogic.AbstractPageObject;

public class SearchBookPage extends AbstractPageObject {
	@FindBy(name = "dodawanie")
	private WebElement addBookButton;

	public SearchBookPage(WebDriver driver) {
		super(driver);
	}

	public AddBookPage clickAddBookButton() {
		addBookButton.click();
		return PageFactory.initElements(driver, AddBookPage.class);
	}

}
