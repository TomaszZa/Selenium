package WebPage.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WebPage.ToTestLogic.AbstractPageObject;

public class HomePage extends AbstractPageObject {
	@FindBy(linkText = "Book List")
	private WebElement bookList;
	@FindBy(linkText = "Author List")
	private WebElement authorList;

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver.get("http://localhost:9000/#/main/welcome");
	}

	public SearchBookPage clickBookList() {
		bookList.click();
		return PageFactory.initElements(driver, SearchBookPage.class);
	}
}
