package testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable");
		WebElement frame = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(frame);
		WebElement draggable = driver.findElementByXPath("//div[@id='draggable']/p");
		Actions builder=new Actions(driver);
		builder.dragAndDropBy(draggable, 313,106).perform();
		builder.release(draggable).perform();

	}

}
