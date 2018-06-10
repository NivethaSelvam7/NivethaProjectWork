package seleniumClassWeek2Day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingMultipleElements {
	public static void main(String[] args) throws InterruptedException {
		//Initiate ChromeDriver;

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//launch Chrome
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		List<WebElement> links = driver.findElementsByTagName("a");
		int count=0;
		for (WebElement link : links) {

			String linktext = link.getText();
			if(linktext.contains("a"))
			{
				System.out.println(linktext);
				count++;
			}


		}
		System.out.println(count);

	}
}
