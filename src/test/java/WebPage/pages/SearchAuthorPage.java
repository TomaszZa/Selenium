package WebPage.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WebPage.ToTestLogic.AbstractPageObject;

public class SearchAuthorPage extends AbstractPageObject {
	// @FindBy(xpath = "//button") // czemu nie znajduje ??

	@FindBy(name = "authorsButton")
	private WebElement searachAuthorsButton;
	@FindBy(name = "firstNames")
	private List<WebElement> names;
	@FindBy(linkText = "Book List")
	private WebElement bookListLink;

	public SearchAuthorPage(WebDriver driver) {
		super(driver);
	}

	public SearchAuthorPage clickSearchAuthorsButton() {
		searachAuthorsButton.click();
		return PageFactory.initElements(driver, SearchAuthorPage.class);
	}

	public Integer giveNumberOfShownAuthors() {
		return names.size();
	}

	public SearchBookPage clickBookListLink() {
		bookListLink.click();
		return PageFactory.initElements(driver, SearchBookPage.class);
	}

}
