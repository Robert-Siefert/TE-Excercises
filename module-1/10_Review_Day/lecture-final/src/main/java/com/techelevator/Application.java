package com.techelevator;

import java.util.List;

public class Application {



    /**
     * The main entry point in the application
     */
    public static void main(String[] args) {

        Application app = new Application();
        app.run();

    }

    private void run() {

        UserInterface ui = new UserInterface();
        Inventory homeInventory = new Inventory();
        boolean running = true;

        while (running) {

            String choice = ui.displayMenu();
            System.out.println(choice);

            if (choice.equals("1")) {
                List<Home> retrievedHomes = homeInventory.retrieveAllHomes();
                ui.printHomes(retrievedHomes);
            }
            else if (choice.equals("2")){
                System.out.println("You choice option 2");
            }
            else if (choice.equals("3")){
                System.out.println("You choice option 3");
            }
            else if (choice.equals("4")){
                System.out.println("You choice option 4");
            }
            else if (choice.equals("5")){
                ui.printMessage("Thanks for supporting slumlord Vinny. Goodbye");
                running = false;
            }
            else {
                ui.printMessage("Invalid Choice");
            }



        }





    }


}
