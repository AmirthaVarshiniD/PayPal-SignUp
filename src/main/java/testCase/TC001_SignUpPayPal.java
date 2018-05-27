package testCase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_SignUpPayPal extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC001_SignUpPayPal";
		testDescription="Sign Up in PayPal Application";
		testNodes="signUp";
		category="Smoke";
		authors="Amirtha";
		browserName="chrome";
		dataSheetName="TC001";
	}
	@Test(dataProvider="fetchData")
	public void signUp(String country,String fName,String lName,String email,String password,String cPassword) {
		
		new HomePage()
		.clickSignUp()
		.isSelected()
		.clickNext()
		.selectCountry(country)
		.typeFirstName(fName)
		.typeLastName(lName)
		.typeEmail(email)
		.typePassword(password)
		.typeConfirmPassword(cPassword);
	}

}
