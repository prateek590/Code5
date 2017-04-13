package puzzle;

import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test11 {

 public static void main(String[] args) {

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
  //for (String s : set) 
      //System.out.println(s);
  Set<String> set2 = new TreeSet<String>();
  //System.out.println(set);
  
  for(String s:set)
	  set2.add(s);
  int count1=0;
  for(String s2:set2){
	//  System.out.println(s2);
	  count1++;
	  if(s2.contains(name)){
		  break;
	  }
  }
	  if(count1>0)
	  System.out.println("The rank of the word is: "+count1);
	  else
		  System.out.println("Word not found!!");
  
  
 }
}
 