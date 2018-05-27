package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import wdMethods.SeMethods;

public class EnterDetailsPage extends SeMethods{

	public EnterDetailsPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="paypalAccountData_firstName")
	private WebElement eleFirstName;
	public  EnterDetailsPage typeFirstName(String data) {
		type(eleFirstName, data);
		return this;
	}
	@FindBy(how=How.ID,using="paypalAccountData_firstName")
	private WebElement eleLastName;
	public  EnterDetailsPage typeLastName(String data) {
		type(eleLastName, data);
		return this;
	}

	@FindBy(how=How.ID,using="paypalAccountData_email")
	private WebElement eleEmail;
	
	public  EnterDetailsPage typeEmail(String data) {
		type(eleEmail, data);
		return this;
	}
	@FindBy(how=How.ID,using="paypalAccountData_password")
	private WebElement elePassword;
	
	public  EnterDetailsPage typePassword(String data) {
		type(elePassword, data);
		return this;
	}
	@FindBy(how=How.ID,using="paypalAccountData_confirmPassword")
	private WebElement eleConfirmPassword;
	
	public  EnterDetailsPage typeConfirmPassword(String data) {
		type(eleConfirmPassword, data);
		return this;
	}
	
}
