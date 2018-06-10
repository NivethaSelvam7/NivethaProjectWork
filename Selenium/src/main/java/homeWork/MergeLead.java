package homeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Launch the browser
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[1]").click();
		Set<String> setwindowHandles = driver.getWindowHandles();
		List<String> lstwindowHandles= new ArrayList<String>();
		lstwindowHandles.addAll(setwindowHandles);
		driver.switchTo().window(lstwindowHandles.get(1));
		driver.manage().window().maximize();
		driver.findElementByName("id").sendKeys("10155");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.switchTo().window(lstwindowHandles.get(0));
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[2]").click();
		Set<String> settolead = driver.getWindowHandles();
		List<String> lsttolead= new ArrayList<String>();
		lsttolead.addAll(settolead);
		driver.manage().window().maximize();
		//System.out.println(driver.getWindowHandles().size());
		driver.findElementByName("id").sendKeys("10167");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.switchTo().window(lsttolead.get(0));
		driver.findElementByLinkText("Merge").click();
		String alerttext = driver.switchTo().alert().getText();
		System.out.println(alerttext);
		driver.switchTo().alert().accept();
		
		








	}

}
