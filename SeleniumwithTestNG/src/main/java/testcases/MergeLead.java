package testcases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class MergeLead extends SeMethods{

	@Test
	public void merge() {
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
		//Click Leads link
		WebElement leads =driver.findElementByLinkText("Leads");
		click(leads);
		//Click Merge leads
		WebElement mergeLeads =driver.findElementByLinkText("Merge Leads");
		click(mergeLeads);
		//Click on Icon near From Lead
		WebElement img = locateElement("xpath","(//img[@src='/images/fieldlookup.gif'])[1]");
		click(img);
		//Move to new window
		switchToWindow(1);
		//Enter Lead ID
		WebElement leadId = locateElement("name", "id");
		type(leadId, "10062");
		//Click Find Leads button
		WebElement findLeads = locateElement("xpath","//button[text()='Find Leads']");
		click(findLeads);
		//Click First Resulting lead
		WebElement resulting_lead = locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		//clickwithoutSnap(resulting_lead);
		//Switch back to primary window
		switchToWindow(0);
		//Click on Icon near To Lead
		WebElement img1 = locateElement("xpath","(//img[@src='/images/fieldlookup.gif'])[2]");
		click(img1);
		//Move to new window
		switchToWindow(1);
		//Enter Lead ID
		WebElement ToleadId = locateElement("name", "id");
		type(ToleadId, "10065");
		
		WebElement findLeads1 = locateElement("xpath","(//button[@class='x-btn-text'])[1]");
		click(findLeads1);
		
		
		











	}
}