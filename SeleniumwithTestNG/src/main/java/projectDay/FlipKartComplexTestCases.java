package projectDay;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipKartComplexTestCases {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// 1.  Launch the Chrome browser 
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// 2.  Enter URL
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//3.Close the login screen
		driver.getKeyboard().sendKeys(Keys.ESCAPE);

		//4.Mouse over to TVs & Appliances
		WebElement tv_appliances = driver.findElementByXPath("//span[text()='TVs & Appliances']");
		Actions builder =new Actions(driver);
		builder.moveToElement(tv_appliances).perform();

		//5. Click on Samsung product
		//WebElement samsung = driver.findElementByXPath("(//span[text()='Samsung'])[2]");
		WebElement samsung = driver.findElementByXPath("//a[@title='TVs & Appliances']/following-sibling::ul/li/ul/li/ul/li[8]/a");
		WebDriverWait wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(samsung));		
		samsung.click();

		//6.In Price filter, select min price to 25000
		WebElement min_price = driver.findElementByXPath("//span[text()='Price']/../../following-sibling::div[3]/div/select");
		Select price1=new Select(min_price);
		price1.selectByValue("25000");	

		//7.In Price filter, select max price to 60000
		
		WebElement max_price = driver.findElementByXPath("//span[text()='Price']/../../following-sibling::div[3]/div[3]/select");
		Select price2=new Select(max_price);
		price2.selectByIndex(3);

		//		8.Click on Screensize filter
		driver.getKeyboard().sendKeys(Keys.PAGE_DOWN);
		WebElement screenSize = driver.findElementByXPath("//div[text()='Screen Size']");
		wait.until(ExpectedConditions.elementToBeClickable(screenSize));
		screenSize.click();
		
		//		9	Check 48 - 55 size box

		WebElement chkBoxSize = driver.findElementByXPath("(//div[text()='48 - 55'])[1]");
		wait.until(ExpectedConditions.elementToBeClickable(chkBoxSize));
		
		chkBoxSize.click();
		
		//		10	Click on the first product 
		//WebDriverWait waitTV= new WebDriverWait(driver,30);
		Thread.sleep(3000);
		WebElement firstTV = driver.findElementByXPath("(//div[@class='col col-7-12'])[1]");
		//waitTV.until(ExpectedConditions.elementToBeClickable(firstTV));
		firstTV.click();
		String priceTV1parentwindow = driver.findElementByXPath("(//div[@class='_1uv9Cb'])[1]/div[1]").getText();
		
		//		11	Switch to New window 
		Set<String> setwindowHandles = driver.getWindowHandles();
		List<String> listwindowHandles= new ArrayList<String>();
		listwindowHandles.addAll(setwindowHandles);
		driver.switchTo().window(listwindowHandles.get(1));	
		
		
		//		12	Confirm the price on the first window is same as in second window
		String priceTV1childwindow = driver.findElementByXPath("(//div[@class='_1uv9Cb'])[1]/div[1]").getText();
		System.out.println(priceTV1parentwindow  + priceTV1childwindow);
		if(priceTV1parentwindow.equals(priceTV1childwindow)) {
			System.out.println(" The price on the first window is same as in second window ");
		}
		//		13	Close the window
		driver.close();
		System.out.println("Child window is closed");
		
		//		14	Switch back to parent window 
		Set<String> setwindowHandles1 = driver.getWindowHandles();
		List<String> listwindowHandles1= new ArrayList<String>();
		listwindowHandles1.addAll(setwindowHandles1);
		driver.switchTo().window(listwindowHandles1.get(0));
		System.out.println("Parent window is active");
		
		
		//		15	Check Add to Compare for the first 2 products
		
		driver.findElementByXPath("(//span[text()='Add to Compare'])[1]").click();
		
		driver.findElementByXPath("(//span[text()='Add to Compare'])[2]").click();
		
		//		18	Click on compare button (on right bottom corner)
		driver.findElementByXPath("//span[text()='COMPARE']").click();
		
		//		19	Verify the Compare appears as section title
		String secTitle = driver.findElementByXPath("//div[@class='_3eykh1']/div[2]").getText();
		if(secTitle.equals("2 items"))
		{
			System.out.println("Section title is "+secTitle+" as expected");
		}
		
		//		20	Print the lowest price between the two items
		String tvPrice1 = driver.findElementByXPath("(//div[@class='_1vC4OE'])[1]").getText().replaceAll("\\D", "");
		String tvPrice2 = driver.findElementByXPath("(//div[@class='_1vC4OE'])[2]").getText().replaceAll("\\D", "");
		int intTvPrice1 = Integer.parseInt(tvPrice1);
		int intTvPrice2 = Integer.parseInt(tvPrice2);
		if(intTvPrice1>intTvPrice2)
		{
			System.out.println(intTvPrice2+" is lowest price between the two items");
		}
		else
		{
			System.out.println(intTvPrice1+" is lowest price between the two items");
		}


	}

}