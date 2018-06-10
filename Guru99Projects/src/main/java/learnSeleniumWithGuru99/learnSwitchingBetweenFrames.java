package learnSeleniumWithGuru99;

import org.openqa.selenium.chrome.ChromeDriver;

public class learnSwitchingBetweenFrames {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/selenium/deprecated.html");
	driver.switchTo().frame("classFrame");
	driver.findElementByLinkText("Deprecated").click();
	driver.close();
	}
	

}
