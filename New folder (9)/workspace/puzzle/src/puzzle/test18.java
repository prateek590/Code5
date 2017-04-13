package puzzle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test18 {

	public static void main(String[] args) throws IOException {

		String address = System.getProperty("user.dir") + File.separator + "Downloads" + File.separator
				+ "permutations.txt";
		
		String address2 = System.getProperty("user.dir") + File.separator + "Downloads" + File.separator
				+ "meaningfulPermutations.txt";

		int meaningfulWords = 0;

		BufferedWriter bw = null;
		
		FileWriter fw = null;

		BufferedWriter bw2 = null;
		
		FileWriter fw2 = null;
		
		try {
			fw = new FileWriter(address);
			bw = new BufferedWriter(fw);
			fw2 = new FileWriter(address2);
			bw2 = new BufferedWriter(fw2);

		} catch (Exception e) {
		
			e.printStackTrace();
	
		}

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + File.separator + "chromedriver" + File.separator + "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		Random r = new Random();

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the string");

		String name = input.nextLine();

		int number = 3;

		int count = 0;

		do {

			Set<String> set = new HashSet<String>();
		
			count = 0;
			
			int c = 0;
			
			String out = "";
			
			char[] name1 = new char[number];
			
			int w = 10000000;
			
			while (w != 0) {
			
				out = "";
				
				int[] num = new int[name.length()];
				
				for (int i = 0; i < name.length(); i++)
				
					num[i] = i;
				for (int i = 0; i < number; i++) {
					
					while (true) {
					
						int index = r.nextInt(name.length());
						
						c = num[index];
						
						if (c != -1) {
						
							num[index] = -1;
							
							break;
						
						}
					}
					
					name1[i] = name.charAt(c);
					
					out += name1[i];
				}

				set.add(out);
			
				w--;
			}
			
			String wordList = "";
			
			driver.get("http://www.litscape.com/words/length/" + number + "_letters/" + number + "_letter_words.html");
			
			wordList = driver.findElement(By.xpath("//div[@id='wordlistdisplay']")).getText();

			System.out.println("\nFinding " + number + "-letter meaningful words...");
			
			for (String s : set) {

				try {

					if (wordList.contains(s)) {
			
						count++;
						
						meaningfulWords++;
						
						bw2.write(s + ", ");
					
					}
					
					bw.write(s + "\n");
				
				}

				catch (Exception e) {
				
					e.printStackTrace();
				
				}

			}
			
			bw2.write("\nTotal Number of " + number + "-letter Meaningful Words are: " + count + "\n\n");
			
			number++;
		} 
		
		while (number <= name.length());
		
		System.out.println("\n\nTotal number of meaningful words are: " + meaningfulWords);

		try {

			bw2.write("\n\nTotal Number of Meaningful Words are: " + meaningfulWords);
		
			if (bw != null)
			
				bw.close();

			if (fw != null)
				
				fw.close();

			if (bw2 != null)
				
				bw2.close();

			if (fw2 != null)
				
				fw2.close();

		} 
		
		catch (Exception e) {

			e.printStackTrace();

		}

	}
}
