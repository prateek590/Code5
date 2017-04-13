package puzzles2;

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

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test12 {

	public static void main(String[] args) throws IOException {

		String address = System.getProperty("user.dir") + File.separator + "Downloads" + File.separator
				+ "permutations.txt";
		String address2 = System.getProperty("user.dir") + File.separator + "Downloads" + File.separator
				+ "meaningfulPermutations.txt";
		String address3 = System.getProperty("user.dir") + File.separator + "Downloads" + File.separator
				+ "4-letterWords.txt";

		BufferedWriter bw = null;
		FileWriter fw = null;

		BufferedWriter bw2 = null;
		FileWriter fw2 = null;

		BufferedReader br = null;
		FileReader fr = null;

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + File.separator + "chromedriver" + File.separator + "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		Random r = new Random();

		Scanner input = new Scanner(System.in);

		Set<String> set = new HashSet<String>();

		System.out.println("Enter the string");

		String name = input.nextLine();

		System.out.println("Enter the number of combination of letter: ");

		int number = input.nextInt();

		String out = "";

		int c = 0;

		int w = 1000000;

		char[] name1 = new char[number];

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
			// System.out.println(out);
			set.add(out);
			w--;
		}

		try {
			fw = new FileWriter(address);
			bw = new BufferedWriter(fw);
			fw2 = new FileWriter(address2);
			bw2 = new BufferedWriter(fw2);
			fr = new FileReader(address3);
			br = new BufferedReader(fr);
		} catch (Exception e) {
			e.printStackTrace();
		}

		ArrayList<String> list = new ArrayList<String>();
		String currentLine;
		while ((currentLine = br.readLine()) != null) {
			for (String word : currentLine.split(" ")) {
				list.add(word);
			}

		}
		int count = 0;
		for (String s : set) {
			System.out.println(s);

			try {
				for (String w1 : list) {
					if (w1.contains(s)) {
						count++;
						bw2.write(s + " ");
					}
				}

				bw.write(s + "\n");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		try {
			bw2.write("\n\nTotal number of meaningful words are: " + count);
			if (bw != null)
				bw.close();

			if (fw != null)
				fw.close();

			if (bw2 != null)
				bw2.close();

			if (fw2 != null)
				fw2.close();

			if (br != null)
				br.close();

			if (fr != null)
				fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// System.out.println(set);
		System.out.println("\n\nTotal number of permutations: " + set.size());
		/*
		 * System.out.println("\n\nFinding meaningful words...");
		 * driver.get("http://www.litscape.com/words/length/"+number+"_letters/"
		 * +number+"_letter_words.html"); String
		 * wordList=driver.findElement(By.xpath("//div[@id='wordlistdisplay']"))
		 * .getText(); int meaningfulWords=0; for (String s1 : set) {
		 * if(wordList.contains(s1)){ System.out.println(s1); meaningfulWords++;
		 * } } System.out.println("\n\nNumber of meaningful words: "
		 * +meaningfulWords);
		 */
	}
}
