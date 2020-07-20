package SeleniumFramework.SeleniumFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DesiredCapabilityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
		
	System.setProperty("webdriver.chrome.driver", projectpath+"\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com");
	
	}

}
