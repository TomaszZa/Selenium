package WebPage.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WebPage.ToTestLogic.AbstractPageObject;

public class AddBookPage extends AbstractPageObject {
	@FindBy(name = "dodawanieAut")
	private WebElement addAuthorButton;

	@FindBy(name = "titleText")
	private WebElement titletext;

	@FindBy(id = "Dod")
	private WebElement addBookButton;

	public AddBookPage(WebDriver driver) {
		super(driver);
	}

	public AddAuthorPage clickAddAuthorButton() {
		addAuthorButton.click();
		return PageFactory.initElements(driver, AddAuthorPage.class);
	}

	public AddBookPage fillTitleText(String title) {
		titletext.sendKeys(title);
		return PageFactory.initElements(driver, AddBookPage.class);
	}

	public boolean checkIfAddBookButtonIsPressed() {
		return driver.findElement(By.id("Dod")).isEnabled();
	}

}
