package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Module1CodingAssessment {

	public static void main(String[] args) {
		Module1CodingAssessment mca = new Module1CodingAssessment();
		mca.run();

	}
	List<MovieRental> movieRentals = new ArrayList<>();
	private void run() {
		MovieRental superman = new MovieRental("Superman","DVD",false);
		MovieRental ironMan = new MovieRental("Iron Man","BLUERAY",true);
		MovieRental citizenKane = new MovieRental("Citizen Kane","VHS",false);


		movieRentals.add(superman);
		movieRentals.add(ironMan);
		movieRentals.add(citizenKane);


		printMovieList();
		printMoviesToFIle();

	}

	public void printMovieList(){
		for (MovieRental movieRental: movieRentals) {
			System.out.println(movieRental.toString());
		}
	}
	public void printMoviesToFIle()  {

		File destinationFile = new File("movies.txt");
		try (PrintWriter writer = new PrintWriter(destinationFile)){
			for (MovieRental movieRental: movieRentals) {
				writer.println(movieRental.toString());
			}
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}


	}

}
