package com.qa.StringManipulation;

import java.util.Arrays;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		String myString = "Joe is very tired";
		countWordsReverse(myString);
	}
	
	public static void countWords(String s) {
		int word = 0;
		int numberOfWords = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.substring(i, i+1).equals(" ")) {
				System.out.println(s.substring(word, i));
				word = i+1;
				numberOfWords++;
			} else if (i == s.length() - 1) {
				System.out.println(s.substring(word, i+1));
				numberOfWords++;
			}
		}
		
		System.out.println(numberOfWords);
	}
	
	public static void countWordsArray(String s) {
		String[] myArray = s.split(" ");
				
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	}
	
	public static void countWordsReverse(String s) {
		int word = s.length()-1;
		int numberOfWords = 0;
		for (int i = word; i > 0; i--) {
			if (s.substring(i, i+1).equals(" ")) {
				System.out.println(s.substring(i, word-1));
				word = i;
				numberOfWords++;
			} else if (i == 0) {
				System.out.println(s.substring(i, word));
				numberOfWords++;
			}
		}
	}
}
