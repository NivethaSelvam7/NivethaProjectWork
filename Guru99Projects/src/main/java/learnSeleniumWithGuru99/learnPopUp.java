package learnSeleniumWithGuru99;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnPopUp {
	public static void main (String args[]) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jsbin.com/usidix/1 ");
		driver.findElementByXPath("//input[@value='Go!']").click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("The Message in Pop up box is: "+		text);
		alert.accept();
		
		
		
		
	}

}
