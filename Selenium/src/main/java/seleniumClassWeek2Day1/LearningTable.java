package seleniumClassWeek2Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningTable {
	public static void main(String[] args)  {
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
		driver.findElementById("createLeadForm_birthDate-button").click();
//		WebElement table = driver.findElementByXPath("//*[@id='ext-gen613']/table");
		List<WebElement> rows = driver.findElementsByClassName("daysrow");
		WebElement row4 = rows.get(3);
		List<WebElement> dayList = row4.findElements(By.className("day"));
		WebElement day = dayList.get(1);
		day.click();
		
		

}
}
