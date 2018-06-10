package homeWork;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownselector {

	public static void main(String[] args) {
		int i=0;
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//launch Chrome
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElementByLinkText("Sign up").click();
		WebElement Country = driver.findElementById("userRegistrationForm:countries");
		Select dropdown=new Select(Country);
		List<WebElement> options = dropdown.getOptions();
		for (WebElement webElement : options) {

			if(webElement.getText().charAt(0)=='E')
			{

				i++;
				if(i==2)
				{
					System.out.println(webElement.getText());
				webElement.click();

			}
			}

		}
	}

}
