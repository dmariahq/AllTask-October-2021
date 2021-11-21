package october.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

	By loginLink = By.xpath("//a[normalize-space()='Log In/Register As Student']");
	By username = By.xpath("//input[@id='username']");
	By password = By.id("password");
	By loginButton = By.xpath("//button[normalize-space()='Login']");

	public LoginPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver.get(), this);
	}

	public void loginNotRefactor(String user, String pass) {
		driver.get().findElement(loginLink).click();
		driver.get().findElement(username).sendKeys(user);
		driver.get().findElement(password).sendKeys(pass);
		driver.get().findElement(loginButton).click();

	}

	public void login(String user, String pass) {
		clickAndWaitByXpath(loginLink);
		setText(username, user);
		setText(password, pass);
		clickAndWaitByXpath(loginButton);
	}

}
