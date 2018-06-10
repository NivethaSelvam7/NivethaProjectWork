package projectDay;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookSimpleTestCases {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(op);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElementById("email").sendKeys("abc@gmail.com");
		driver.findElementById("pass").sendKeys("abcabc");
		driver.findElementById("loginbutton").click();
		driver.findElementByClassName("_1frb").sendKeys("TestLeaf");
		driver.getKeyboard().sendKeys(Keys.ENTER);
		WebElement testLeaf = driver.findElementByXPath("//div[text()='TestLeaf']");
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(testLeaf));
		testLeaf.click();		
		WebElement like = driver.findElementByXPath("//button[text()='Like']");
		wait.until(ExpectedConditions.elementToBeClickable(like));
		like.click();
		driver.findElementByLinkText("TestLeaf").click();
		driver.findElementByXPath("(//span[text()='Reviews'])[1]").click();
		List<WebElement> reviews = driver.findElementsByXPath("//div[@class='_1dwg _1w_m _q7o']");
		for (WebElement webElement : reviews) {
			
			System.out.println(webElement.getText());
		}
		
		



	}

}
