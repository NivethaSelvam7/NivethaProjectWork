package homeWork;

import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDropdownLastButOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//launch Chrome
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");

	}

}
