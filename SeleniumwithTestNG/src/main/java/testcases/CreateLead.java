package testcases;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class CreateLead extends SeMethods{
		
	
	public void signUp() {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement uName = locateElement("id", "username");
		type(uName, "DemoSalesManager");
		WebElement pwd = locateElement("id", "password");
		type(pwd, "crmsfa");
		WebElement loginButton = locateElement("class", "decorativeSubmit");
		click(loginButton);

		//Click crm/sfa link
		WebElement crm_sfa =driver.findElementByLinkText("CRM/SFA");
		click(crm_sfa);
		//Click Create Lead
		WebElement createLead =driver.findElementByLinkText("Create Lead");
		click(createLead);
		//Enter Company Name
		WebElement companyname = locateElement("id", "createLeadForm_companyName");
		type(companyname,"TechMahindra");
		//Enter First Name
		WebElement first_Name = locateElement("id", "createLeadForm_firstName");
		type(first_Name,"Nivetha");
		//Enter Last Name
		WebElement last_Name = locateElement("id", "createLeadForm_lastName");
		type(last_Name,"Selvam");
		//Choose Source
		WebElement source = locateElement("id", "createLeadForm_dataSourceId");
		selectDropDownUsingText(source,"Employee");
		//click Lead
		WebElement clickLead = locateElement("name", "submitButton");
		click(clickLead);
		//verify First name
		WebElement verifyLead = locateElement("id", "viewLead_firstName_sp");
		verifyExactText(verifyLead,"Nivetha");
		
		
	}
}