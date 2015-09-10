package WebPage.ToTestLogic;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.PageFactory;

import WebPage.pages.HomePage;

public class AbstractSelenium {
	private WebDriver driver;

	@Before
	public void setUp() {
		FirefoxProfile prifile = new FirefoxProfile();
		prifile.setPreference("init.sccept_languages", "en");
		driver = new FirefoxDriver(prifile);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}

	public HomePage openLibraryPage() {
		return PageFactory.initElements(driver, HomePage.class);
	}

	@After
	public void turnDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
