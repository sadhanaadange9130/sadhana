//Author-Sadhana Gautam Adange
//code to display the longest word in a text file.


package com.question2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LongWord {

	
		 public static void main(String [ ] args) throws FileNotFoundException {
             new LongWord().findLongestWords();
        }

    public String findLongestWords() throws FileNotFoundException {

      String longest_word = "";
      String current;
      Scanner sc = new Scanner(new File("C:\\sadhana\\longword.txt"));


      while (sc.hasNext()) {
         current = sc.next();
          if (current.length() > longest_word.length()) {
            longest_word = current;
          }

      }
        System.out.println("\n"+longest_word+"\n");
           return longest_word;
           }
}

	


