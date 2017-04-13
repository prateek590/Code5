package puzzle;

import java.io.File;
import java.util.Random;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test7 {

	public static void main(String[] args) {
		Random r = new Random();
		String characters = "abcdefghijklmnopqrstuvwxyz";
		char[][] alpha = new char[30][30];
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
		driver.get("http://www.litscape.com/words/length/"+len+"_letters/"+len+"_letter_words.html");
		String word="";
		
		for(int i=0;i<alpha.length;i++){
			if(i%1==0)
			driver.get("http://www.litscape.com/words/length/"+len+"_letters/"+len+"_letter_words.html");
			for(int j=0;j<alpha[i].length-len+1;j++){
				word="";
				for(int z=0;z<len;z++){
				word+=alpha[i][j+z];
				}
				//System.out.println(word);
				try{
		if(driver.findElement(By.xpath("//div[@id='wordlistdisplay']")).getText().contains(word)){
			System.out.println(word);
		}
				}
		catch(Exception e){
			continue;
		}
		
		
				}
		}
		for(int i=0;i<alpha.length;i++){
			if(i%1==0)
				driver.get("http://www.litscape.com/words/length/"+len+"_letters/"+len+"_letter_words.html");
			for(int j=0;j<alpha[i].length-len+1;j++){
				word="";
				for(int z=0;z<len;z++){
				word+=alpha[j+z][i];
				
				}
				//System.out.println(word);
				try{
		if(driver.findElement(By.xpath("//div[@id='wordlistdisplay']")).getText().contains(word)){
	System.out.println(word);
		}
		}
				catch(Exception e){
					continue;
				}
		}
	}
	}
}
