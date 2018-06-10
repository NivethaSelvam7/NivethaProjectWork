package learnSeleniumWithGuru99;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginGmail {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Launching browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String URL ="https://accounts.google.com/signin";
		String email  = "nivethaselvam5@gmail.com";
		String password= "selvamshanthi";
		//Hitting URL
		driver.get(URL);
		driver.findElementById("identifierId").sendKeys(email);
		//clicking next button
		driver.findElementById("identifierNext").click();
		driver.findElementByXPath("//input[@name='password']").sendKeys(password);
		driver.findElement(By.id("passwordNext")).click();
	
		driver.close();
		driver.quit();
	
		
		

	

	}

}
