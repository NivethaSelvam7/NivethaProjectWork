package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{

	public CreateLead() {		
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;	
	@FindBy(how=How.ID,using="createLeadForm_primaryEmail")
	private WebElement eleEmail;	
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
	private WebElement elephone;
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement clickCreateLeadButton;

	public CreateLead typeCompanyName(String data){
		type(eleCompanyName, data);
		return this;	
	}
	
	public CreateLead typeFirstName(String data){
		type(eleFirstName, data);
		return this;	
	}
	
	public CreateLead typeLastName(String data){
		type(eleLastName, data);
		return this;	
	}
	
	public CreateLead typeEmail(String data){
		type(eleEmail, data);
		return this;	
	}

	public CreateLead typePhone(String data){
		type(elephone, data);
		return this;	
	}

	public ViewLead clickCreateLeadButton(){
		click(clickCreateLeadButton);
		return new ViewLead();
	}

	






}
