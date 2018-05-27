package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import wdMethods.SeMethods;

public class SignUpPage extends SeMethods{

	public SignUpPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID,using="radio-personal")
	private WebElement eleRadioButton;
	
	public  SignUpPage isSelected() {
		boolean selected = verifySelected(eleRadioButton);
		if(!selected) {
		click(eleRadioButton);
		}
		return new SignUpPage();
	}
	@FindBy(how=How.LINK_TEXT,using="Next")
	private WebElement eleNextButton;
	public LoginPage clickNext()
	{
		click(eleNextButton);
		return new LoginPage();
	}

}
