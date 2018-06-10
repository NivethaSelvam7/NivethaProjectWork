package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="Creating Lead LeafTaps Application";
		testNodes="Leads";
		category="Functional";
		authors="Nivetha";
		browserName="chrome";
		dataSheetName="TC003";
	}

	@Test(dataProvider="fetchData")
	public void createLead(String uname, String password,String companyName,String firstName,String lastName,String email,String phone) {
		
		new LoginPage()
		.enterUserName(uname)
		.enterPassword(password)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.typeCompanyName(companyName)
		.typeFirstName(firstName)
		.typeLastName(lastName)
		.typeEmail(email)
		.typePhone(phone)
		.clickCreateLeadButton()
		.verifyFirstName(firstName);
				
					
	}

}
