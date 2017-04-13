

import java.io.File;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

public class simple 
{

	
	static String myname = "Vikash Kumar";
	public static void main(String[] args) throws Exception
	{
	//	WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + File.separator + "chromedriver" + File.separator + "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://10.0.1.86/tatoc/basic/grid/gate");
	    driver.manage().window().maximize();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	        
	    //Part 1
        js.executeScript("document.getElementsByClassName('greenbox')[0].click();");//.click();
        
	    //Part 2
	    String color1 = (String) js.executeScript("return document.querySelector('#main').contentWindow.document.querySelector('#answer').className;");
		String color2 = (String) js.executeScript("return document.querySelector('#main').contentWindow.document.querySelector('#child').contentWindow.document.getElementById('answer').getAttribute('class');");
		while(!color1.equals(color2))
		{
			js.executeScript("document.getElementById('main').contentWindow.document.getElementsByTagName('a')[0].click();");
			Thread.sleep(500);
			color2=(String)js.executeScript("return document.querySelector('#main').contentWindow.document.querySelector('#child').contentWindow.document.getElementById('answer').getAttribute('class');");
		}		
		js.executeScript("document.getElementById('main').contentWindow.document.getElementsByTagName('a')[1].click();");
		
		//Part 3
		WebElement element1 = (WebElement)js.executeScript("return document.getElementById('dragbox')");
	    WebElement target = (WebElement)js.executeScript("return document.getElementById('dropbox')");
	    new Actions(driver).dragAndDrop(element1, target).perform();
        Thread.sleep(500);
        js.executeScript("$('a:contains(\"Proceed\")').trigger('click')");  
	    
        //Part 4
	    String mainwindow=driver.getWindowHandle();
	    js.executeScript("$('a:contains(\"Launch Popup Window\")').trigger('click')");
	    for(String winHandle :driver.getWindowHandles())
	    {
	        driver.switchTo().window(winHandle);
	        if(driver.getTitle().equals("Popup - Basic Course - T.A.T.O.C"))
	        {
	            break;
	        }
	    }
	    js.executeScript("document.getElementById(\"name\").value=\"Vikash Kumar\";");
	    Thread.sleep(500);
	    js.executeScript("document.getElementById('submit').click();");
        driver.switchTo().window(mainwindow);
	    js.executeScript("$('a:contains(\"Proceed\")').trigger('click')");    
	    
	    //Part 5
	    js.executeScript("$('a:contains(\"Generate Token\")').trigger('click')");
	    String s3 = (String)js.executeScript("return document.getElementById('token').textContent;");
		s3 = "Token="+s3.substring(7,s3.length());
		Cookie name = new Cookie("mycookie",s3);
		driver.manage().addCookie(name);
		js.executeScript("$('a:contains(\"Proceed\")').trigger('click')");    
	    
	    driver.close();
	}
}
