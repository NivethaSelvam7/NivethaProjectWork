package testcases.Lead;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import excel.LearnExcel;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	//Before @Test , @BeforeMethods from ProjectMethods will be executed. This method has login method.
	
	@Test(dataProvider="fetchData")
	public void createLead(String company,String fName, String lName, String email, String phone) throws IOException {
		click(locateElement("linkText", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"),company);
		type(locateElement("id", "createLeadForm_firstName"),fName );
		type(locateElement("id", "createLeadForm_lastName"), lName);
		type(locateElement("id", "createLeadForm_primaryEmail"), email);
		//easy way to convert any data type to string .concat "" with int
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), phone);
		click(locateElement("name", "submitButton"));
		takeSnap();

	}
	@DataProvider(name="fetchData")

	public Object[][] fetchData() throws IOException {
		LearnExcel rdata = new LearnExcel();
		return rdata.readExcel();
		
	}
}












