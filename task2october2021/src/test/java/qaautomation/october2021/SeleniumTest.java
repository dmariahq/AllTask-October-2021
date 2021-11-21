package qaautomation.october2021;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import october.automation.pages.LoginPage;
import october.automation.pages.ProfilePage;

public class SeleniumTest extends BaseWebTestHeadless {

	LoginPage loginPage = new LoginPage(driver, explicitWait);
	ProfilePage profilePage = new ProfilePage(driver, explicitWait);

	@Test
	public void test1() {
		String username = "fullstackdemo";
		String password = "fullstackdemo";
		// login page
		loginPage.login(username, password);
		// profile page
		String actualText = profilePage.getProfileText(username);
		assertEquals(actualText, username);
	}
}
