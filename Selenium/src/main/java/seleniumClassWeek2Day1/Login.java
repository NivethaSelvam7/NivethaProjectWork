package seleniumClassWeek2Day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) {
		//Initiate ChromeDriver;

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//launch Chrome
		driver.get("http://leaftaps.com/opentaps");
		//Enter Username
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//Enter Password
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		//Click Login button;
		driver.findElementByClassName("decorativeSubmit").click();
		//Click on CRM/SFA link
		driver.findElementByLinkText("CRM/SFA").click();
		//Click on Create Lead
		driver.findElementByLinkText("Create Lead").click();
		//Enter Mandatory Fields
		driver.findElementById("createLeadForm_companyName").sendKeys("TechMahindra");
		driver.findElementById("createLeadForm_firstName").sendKeys("Nivetha");
		driver.findElementById("createLeadForm_lastName").sendKeys("Selvam");
		///Selecting Existing customer in Source dropdown
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dropdown= new Select(source);
		dropdown.selectByVisibleText("Existing Customer");
		//Selecting Car and Driver from Marketing Campaign dropdown
		WebElement marketingCampaign = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dropdown1= new Select(marketingCampaign);
		dropdown1.selectByIndex(3);
		//Printing all options of Industry Drop down
		WebElement Industry = driver.findElementById("createLeadForm_industryEnumId");
		Select dropdown2=new Select(Industry);
		List<WebElement> options = dropdown2.getOptions();
		System.out.println(dropdown2.getOptions().size());
		for (WebElement webElement : options) 
			System.out.println(webElement.getText());
		driver.findElementByClassName("smallSubmit").click();
	}

}
