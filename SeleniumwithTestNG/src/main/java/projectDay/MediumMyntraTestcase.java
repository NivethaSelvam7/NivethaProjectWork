package projectDay;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MediumMyntraTestcase {

	public static void main(String[] args) {

		//		1	Launch the chrome browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	
		//		2	Open Myntra website 
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	

		//		3	In Searchbox type "Sunglasses" and Enter
		WebElement txtsearch = driver.findElementByClassName("desktop-searchBar");
		txtsearch.sendKeys("sunglasses");
		driver.getKeyboard().sendKeys(Keys.ENTER);

		//		4	Print all unique brand names of the Sunglasses
		List<WebElement> brands = driver.findElementsByClassName("product-brand");
		Set<String> setbrand = new HashSet<String>();
		for (WebElement brand : brands) {
			setbrand.add(brand.getText());	
		}
		System.out.println("The Unique brands are "+setbrand);

		//		5	Get the count of the sunglasses with 40% discounts
		List<WebElement> pricediscounts = driver.findElementsByClassName("product-discountPercentage");
		for (WebElement discount :pricediscounts) {
			String text = discount.getText();
			if(text.contains("40"))
			{
				System.out.println();
			}
			
		}
		
		
		//		6	And the print count of the product those are Unisex
		//		7	Click on Green color Filter icon
		//		8	Click on second listed search result of the sun glasses
		//		9	Print the name of the product
		//		10	Click Add to Bag 
		//		11	Click Go to Bag
		//		12	Verfiy the product name and price is correct
		//		13	close browser


	}

}
