package puzzle;

import java.io.File;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test10 {

 public static void main(String[] args) {
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
  String out ="";
  int c=0;
  int w=1000000;
  char[] name1 = new char[number];
  while(w!=0){
   out="";
   int[] num = new int[name.length()];
   for(int i=0;i<name.length();i++)
    num[i]=i;
   for(int i=0;i<number;i++){
   while(true){
    int index = r.nextInt(name.length());
   c=num[index];
   if(c!=-1){
   num[index]=-1;
   break;
   }
   }
   name1[i]=name.charAt(c);
  out+=name1[i];
  }
  //System.out.println(out);
   set.add(out);
  w--;
 }
  for (String s : set) 
      System.out.println(s);
  
  //System.out.println(set);
  System.out.println("\n\nTotal number of permutations: "+set.size());
  System.out.println("\n\nFinding meaningful words...");
   driver.get("http://www.litscape.com/words/length/"+number+"_letters/"+number+"_letter_words.html");
   String wordList=driver.findElement(By.xpath("//div[@id='wordlistdisplay']")).getText();
   int meaningfulWords=0;
   for (String s1 : set) {
    if(wordList.contains(s1)){
     System.out.println(s1);
    meaningfulWords++;
    }
   } 
   System.out.println("\n\nNumber of meaningful words: "+meaningfulWords);
 }
}
 