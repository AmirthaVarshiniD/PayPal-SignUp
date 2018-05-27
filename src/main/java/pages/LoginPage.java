package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import wdMethods.SeMethods;

public class LoginPage extends SeMethods{

	public LoginPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID,using="country")
	private WebElement eleCountry;
	
	public  EnterDetailsPage selectCountry(String data) {
		selectDropDownUsingText(eleCountry, data);
		return new EnterDetailsPage();
	}

}
