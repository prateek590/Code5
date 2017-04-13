import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg1 {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + File.separator + "chromedriver" + File.separator + "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		
		
		
	}

}
