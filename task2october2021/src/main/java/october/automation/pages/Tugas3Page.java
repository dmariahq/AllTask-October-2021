package october.automation.pages;


import java.util.Set;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tugas3Page extends BasePage {

	public Tugas3Page(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver.get(), this);
	}

	public void openURL(String url) {
		driver.get().get(url);
	}

	public void iframe() {
		driver.get().switchTo().frame(0);
	}

	public void switchiFrame(int index) {
		
		driver.get().switchTo().frame(1);
	}

	public void navigateBrowser(String actionName) {
		if (actionName.equalsIgnoreCase("forward")) {
			driver.get().navigate().forward();
		}
		if (actionName.equalsIgnoreCase("back")) {
			driver.get().navigate().back();
		}
		if (actionName.equalsIgnoreCase("refresh")) {
			driver.get().navigate().refresh();
		}

	}

	

	public void acceptAlert() {
		driver.get().switchTo().alert().accept();
	}

}
