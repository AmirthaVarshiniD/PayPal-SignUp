package payPalSignUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class PayPalSignUp extends SeMethods{
@Test
	public void signUp() throws InterruptedException {
		startApp("chrome", "https://www.paypal.com");
		click(locateElement("id", "signup-button"));
		WebElement radio = locateElement("id", "radio-personal");
		boolean selected = verifySelected(radio);
		if(!selected)
		{
			click(radio);
		}
		click(locateElement("link", "Next"));
		WebElement dd = locateElement("id", "country");
		selectDropDownUsingText(dd, "Australia");
		Thread.sleep(2000);
		type(locateElement("id", "paypalAccountData_email"), "varshini.blue7@gmail.com");
		type(locateElement("id", "paypalAccountData_password"), "varshini1");
		type(locateElement("id", "paypalAccountData_confirmPassword"), "varshini1");

		click(locateElement("id", "/appData/action"));
		closeBrowser();

	}

}
