package qaautomation.october2021;

import org.testng.annotations.Test;

import october.automation.pages.CommonPage;
import utils.TestUtility;

public class CommonPageTest extends BaseWebTest {

	CommonPage commonPage = new CommonPage(driver, explicitWait);

	@Test
	public void testSwitching() {
		commonPage.openNewTab();
		commonPage.switchWindow(1);
		commonPage.openURL("https://facebook.com");
		commonPage.openNewWindow();
		commonPage.switchWindow(2);
		commonPage.openURL("https://twitter.com");
		commonPage.switchWindow(0);
	}

	@Test
	public void testJavascript() {
		String alertScript = "alert('beware of alert')";
		commonPage.runJavaScriptCommand(alertScript);
		TestUtility.hardWait(2);
		commonPage.acceptAlert();
		TestUtility.hardWait(2);
	}

	@Test
	public void testNavigateBrowser() {
		commonPage.openURL("https://facebook.com");
		commonPage.navigateBrowser("back");
		TestUtility.hardWait(2);
		commonPage.navigateBrowser("forward");
		TestUtility.hardWait(2);
		commonPage.navigateBrowser("refresh");

	}

}
