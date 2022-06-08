package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Module1CodingAssessment {

	public static void main(String[] args) {
		Module1CodingAssessment mca = new Module1CodingAssessment();
		mca.run();
	}

	private void run() {
		MovieRental superman = new MovieRental("Superman","DVD",false);
		MovieRental ironMan = new MovieRental("Iron Man","BLUERAY",true);
		MovieRental citizenKane = new MovieRental("Citizen Kane","VHS",false);


		List<MovieRental> movieRentals = new ArrayList<>();
		movieRentals.add(superman);
		movieRentals.add(ironMan);
		movieRentals.add(citizenKane);


	}

}
