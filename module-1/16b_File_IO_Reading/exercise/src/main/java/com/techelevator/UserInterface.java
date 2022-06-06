package com.techelevator;

import java.util.Scanner;

public class UserInterface {
    String filename;
    Scanner scanner = new Scanner(System.in);
    public void menu(){
        System.out.println("What is the fully qualified name of the file that should be searched?");
        filename = scanner.nextLine();

    }

}
