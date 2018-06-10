package Week1Day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsAndFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch chrome
		System.getProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("Nivetha Selvam");
		prompt.accept();
		String text = driver.findElementById("demo").getText();
		if(text.contains("Nivetha Selvam"))
		{
			System.out.println(text);
		}
		
		
		

	}

}
