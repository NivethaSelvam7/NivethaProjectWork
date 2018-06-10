package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class EditLead extends SeMethods{

	
	public void signUp() throws InterruptedException {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement uName = locateElement("id", "username");
		type(uName, "DemoSalesManager");
		WebElement pwd = locateElement("id", "password");
		type(pwd, "crmsfa");
		WebElement loginButton = locateElement("class", "decorativeSubmit");
		click(loginButton);
		//Click crm/sfa link
		WebElement crm_sfa = locateElement("linktext","CRM/SFA");
		click(crm_sfa);
		//Click Leads link
		WebElement Leads = locateElement("linktext","Leads");
		click(Leads);
		//Click Find leads
		WebElement findLeads = locateElement("link","Find Leads");
		click(findLeads);
		//Enter first name
		WebElement ID = locateElement("name", "id");
		type(ID, "10062");
		//Click Find leads button
		List<WebElement> className = driver.findElementsByClassName("x-btn-text");
//		System.out.println(className.size());
//		int i=0;
//		for (WebElement webElement : className) {
//			String text = webElement.getText();	
//			System.out.println(i+":"+text);
//			i++;
//		}
		WebElement FindLeadButton = className.get(6);
		click(FindLeadButton);
		//Click on first resulting lead
		WebElement Table = locateElement("xpath","//table[@class='x-grid3-row-table']");
		List<WebElement> rows = Table.findElements(By.tagName("tr"));
		WebElement row = rows.get(0);
		List<WebElement> cols = row.findElements(By.tagName("td"));
		WebElement Col = cols.get(0);
		WebElement lead = Col.findElement(By.tagName("a"));
		click(lead);
		//Verify Title
		verifyTitle("View Lead | opentaps CRM");
		//Click edit
		WebElement Edit = locateElement("linktext","Edit");
		click(Edit);
		
		
		
		



	}
}