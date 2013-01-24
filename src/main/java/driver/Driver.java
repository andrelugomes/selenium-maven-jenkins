package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
	
	public WebDriver chromeStart() {
		String os = System.getProperty("os.name");
		if (os.contains("Windowns")) {
			System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		}
		if(os.contains("Linux")){
			System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
		}
		return  new ChromeDriver();
	}
	
	public WebDriver fireFoxStart() {
		return  new FirefoxDriver();
	}
}