package learnSeleniumWithGuru99;

import org.openqa.selenium.chrome.ChromeDriver;

public class basicLoginAndVerifyTitle {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/newtours/");
	String expectedTitle = "Welcome: Mercury Tours";
	String title = driver.getTitle();
	if(title.contentEquals(expectedTitle))
	{
		System.out.println("Correct Title");
	}
	else {
		
		System.out.println("incorrect title");
	}
	driver.findElementByName("userName").sendKeys("mngr136027");
	driver.findElementByName("password").sendKeys("udAbyty");
	driver.findElementByName("submit").click();
	driver.close();
	System.exit(0);
	
	}
	

}
