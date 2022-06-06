package com.techelevator;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class WordSearch {

	public static void main(String[] args) {
		String filename;
		String wordToSearch;
		Scanner userInput = new Scanner(System.in);

		System.out.println("What is the fully qualified name of the file that should be searched?");
		filename = userInput.nextLine();
		System.out.println("What word do you want to search for?");
		wordToSearch = userInput.nextLine();

		Scanner fileScanner = new Scanner(filename);
		Map<Integer, String> linesInFile = new HashMap<>();
		int i = 1;
		while(fileScanner.hasNextLine()){
			linesInFile.put((Integer)i,fileScanner.nextLine());
			i++;
		}

		Map<Integer, String> linesWithWord = new HashMap<>();
		Set<Integer> linesInFileKeys = linesInFile.keySet();

		for(Integer key: linesInFileKeys){
			if (linesInFile.get(key).contains(wordToSearch)) {
				linesWithWord.put(key,linesInFile.get(key));
			}
		}
		Set<Integer> linesWithWordKeys = linesWithWord.keySet();

		for (Integer key: linesWithWordKeys) {
			System.out.println(key +") " + linesWithWord.get(key));
		}







	}

}
