package seleniumClassWeek2Day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Irctc_SignUp {
	public static void main(String[] args) throws InterruptedException {
		//Initiate ChromeDriver;

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//launch Chrome
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElementByLinkText("Sign up").click();
		//Name
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Nivetha");
		//Gender
		driver.findElementById("userRegistrationForm:gender:1").click();
		//Marital Status
		driver.findElementById("userRegistrationForm:maritalStatus:1").click();
		//Date of Birth
		WebElement dobday = driver.findElementById("userRegistrationForm:dobDay");
		Select dd1=new Select(dobday);
		dd1.selectByValue("01");
		WebElement dobmonth = driver.findElementById("userRegistrationForm:dobMonth");
		Select dd2=new Select(dobmonth);
		dd2.selectByValue("07");
		WebElement dobyear = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select dd3=new Select(dobyear);
		dd3.selectByValue("1993");		
		//Occupation
		WebElement occupation = driver.findElementById("userRegistrationForm:occupation");
		Select dd4=new Select(occupation);
		dd4.selectByValue("2");
		//Country
		WebElement country = driver.findElementById("userRegistrationForm:countries");
		Select dd5=new Select(country);
		dd5.selectByIndex(1);
		//Mail Id
		driver.findElementById("userRegistrationForm:email").sendKeys("nivethaselvam5@gmail.com");
		//mobile number
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9962382823");
		//Nationality
		WebElement nationality = driver.findElementById("userRegistrationForm:nationalityId");
		Select dd6=new Select(nationality);
		dd6.selectByIndex(1);
		
		//Address
		driver.findElementById("userRegistrationForm:address").sendKeys("No.3,Nakkiran street");
		//Pincode
		driver.findElementById("userRegistrationForm:pincode").sendKeys("603202",Keys.TAB);
		Thread.sleep(1000);
		//City name
		WebElement city = driver.findElementById("userRegistrationForm:cityName");
		Select dd7=new Select(city);
		dd7.selectByValue("Kanchipuram");
		Thread.sleep(1000);
		//Post Office
		WebElement postoffice = driver.findElementById("userRegistrationForm:postofficeName");
		Select dd8=new Select(postoffice);
		dd8.selectByValue("Guduvanchery S.O");
					
	}
	

}
