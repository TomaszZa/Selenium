package WebPage.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WebPage.ToTestLogic.AbstractPageObject;

public class AddAuthorPage extends AbstractPageObject {
	@FindBy(name = "dodawanieAutora")
	private WebElement addAuthorButton;
	@FindBy(name = "input1")
	private WebElement textInput1;
	@FindBy(name = "input2")
	private WebElement textInput2;

	public AddAuthorPage(WebDriver driver) {
		super(driver);
	}

	public AddAuthorPage fillFirstNameInput(String firstName) {
		textInput1.sendKeys(firstName);
		return PageFactory.initElements(driver, AddAuthorPage.class);
	}

	public AddAuthorPage fillLastNameInput(String lastName) {
		textInput2.sendKeys(lastName);
		return PageFactory.initElements(driver, AddAuthorPage.class);
	}

	public AddBookPage clickAddAuthorButtonWithData() {
		addAuthorButton.click();
		return PageFactory.initElements(driver, AddBookPage.class);
	}

	public boolean checkIfAddAuthorButtonIsClicable() {
		return driver.findElement(By.name("dodawanieAutora")).isEnabled();
	}
}
