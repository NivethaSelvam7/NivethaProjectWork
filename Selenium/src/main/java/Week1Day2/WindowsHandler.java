package Week1Day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElementByLinkText("Contact Us").click();
		//print how many windows available in the session
		int size = driver.getWindowHandles().size();
		System.out.println(size);
		//switch to second window
		Set<String> setwindowHandles = driver.getWindowHandles();
		List<String> lstwindowHandles = new ArrayList<String>();
		lstwindowHandles.addAll(setwindowHandles);
		driver.switchTo().window(lstwindowHandles.get(1));
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
		
		
		
		
		
		

	}

}
