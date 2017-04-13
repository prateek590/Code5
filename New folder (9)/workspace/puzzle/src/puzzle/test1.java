package puzzle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test1 {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prateekbhardwaj\\Desktop\\c.exe");
		WebDriver driver = new ChromeDriver();

		// And now use this to visit Google
		driver.get("http://10.0.1.86");
		WebElement element0 = driver.findElement(By.xpath("html/body/div[1]/ul/li[5]/ul/li[4]/a"));
		element0.click();
		int[] arr = {11,12,13,21,22,23,31,32,33};
		WebElement element1 = driver.findElement(By.id("11"));
		WebElement element2 = driver.findElement(By.id("12"));
		WebElement element3 = driver.findElement(By.id("13"));
		WebElement element4 = driver.findElement(By.id("21"));
		WebElement element5 = driver.findElement(By.id("22"));
		WebElement element6 = driver.findElement(By.id("23"));
		WebElement element7 = driver.findElement(By.id("31"));
		WebElement element8 = driver.findElement(By.id("32"));
		WebElement element9 = driver.findElement(By.id("33"));
			
			for(int i=0;i<100;i++)
			{
			double x = Math.random();
			if(x<0.1 && x>0 && arr[0]!=0)
			{
		element1.click();
			arr[0]=0;
			}
			if(x<0.2 && x>0.1 && arr[1]!=0){
		element2.click();
		arr[1]=0;
			}
			if(x<0.3 && x>0.2 && arr[2]!=0)
			{
				element3.click();
			arr[2]=0;
			}
			if(x<0.4 && x>0.3 && arr[3]!=0)
			{
				element4.click();
			arr[3]=0;
			}
			if(x<0.5 && x>0.4 && arr[4]!=0)
			{
				element5.click();
			arr[4]=0;
			}
				if(x<0.6 && x>0.5 && arr[5]!=0)
			{
				element6.click();
			arr[5]=0;
			}
				if(x<0.7 && x>0.6 && arr[6]!=0)
			{
				element7.click();
				arr[6]=0;
			}
			if(x<0.8 && x>0.7 && arr[7]!=0)
			{
				element8.click();
			arr[7]=0;
			}
				if(x<0.9 && x>0.8 && arr[8]!=0)
			{
				element9.click();
			arr[8]=0;
			}
		}
		
	}
		
		
		
	}


