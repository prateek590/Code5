package puzzles2;

import java.io.File;
import java.util.Random;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test6 {

	public static void main(String[] args) {
		Random r = new Random();
		String characters = "abcdefghijklmnopqrstuvwxyz";
		char[][] alpha = new char[5][5];
		for(int i=0;i<alpha.length;i++)
			for(int j=0;j<alpha[i].length;j++)
				alpha[i][j]=characters.charAt(r.nextInt(26));
		for(int i=0;i<alpha.length;i++){
			for(int j=0;j<alpha[i].length;j++){
				System.out.print(alpha[i][j]+"     ");
			}
			System.out.println();
	}
		
		Scanner input = new Scanner(System.in);
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + File.separator + "chromedriver" + File.separator + "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 3);
		System.out.println("Enter the length of word that you want to look for: ");
		int len = input.nextInt();
		String word="";
		for(int i=0;i<alpha.length;i++){
			for(int j=0;j<alpha[i].length-len+1;j++){
				word="";
				for(int z=0;z<len;z++){
				word+=alpha[i][j+z];
				}
		driver.get("http://dictionary.com");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(word);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		//WebElement meaning = driver.findElement(By.xpath("//span[text()='There are no results for: ']"));
		try{
		if(driver.findElement(By.xpath("//h2[text()='More suggestions:']")).isDisplayed())//driver.findElement(By.xpath("//span[text()='There are no results for: ']")).isDisplayed()
		{
			System.out.println(word+" not found");
		}
		}
		catch(Exception e){
		
			System.out.println(word);
		}
				}
			}
		}
		//WebElement element = wait.until(
		     //   ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()='There are no results for: ")));
		
		
	

}
