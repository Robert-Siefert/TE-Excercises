package com.techelevator;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordSearch {

	public static void main(String[] args)  {
		String fileName;
		String wordToSearch;
		Scanner userInput = new Scanner(System.in);
		boolean caseSensitive;

		System.out.println("What is the fully qualified name of the file that should be searched?");
		fileName = userInput.nextLine();
		System.out.println("What word do you want to search for?");
		wordToSearch = userInput.nextLine();
		System.out.println("Should the search be case sensitive? (Y/N");
		if (userInput.nextLine().toUpperCase().equals("Y")) {
			caseSensitive = true;
		} else {
			caseSensitive = false;
		}


		File file = new File(fileName);
		try{
			Scanner fileScanner = new Scanner(file);
			if (caseSensitive) {
				int i = 1;
				while (fileScanner.hasNextLine()) {
					String currentline = fileScanner.nextLine();
					if (currentline.contains(wordToSearch)) {
						System.out.println(i + ") " + currentline);
					}
					i++;

				}
			} else {
				int i = 1;
				while (fileScanner.hasNextLine()) {
					wordToSearch = wordToSearch.toLowerCase();
					String currentline = fileScanner.nextLine();
					if (currentline.toLowerCase().contains(wordToSearch)) {
						System.out.println(i + ") " + currentline);
					}
					i++;

				}
			}
		}
		catch(FileNotFoundException e){
			System.out.println("Error: File Not Found");

		}

	}
}
