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
                System.out.println("You choice option 2 - Add home");

                // ask the user for the home info --> ex:  ui.askUserForHomeInfo()  --> returns a home

                // call the inventory class to add the home
                //homeInventory.addHome(home);


            }
            else if (choice.equals("3")){
                //call the submenu
                boolean subMenuRunning = true;

                while (subMenuRunning) {
                    String option = ui.displaySubMenu();
                    if (option.equals("1")) {
                        //TODO: Remove this code later - illustration purposes only
                        System.out.println("SubMenu Option 1 was chosen");
                    }
                    else if (option.equals("2")) {
                        System.out.println("SubMenu Option 2 was chosen");
                    }
                    else if (option.equals("3")) {
                        subMenuRunning = false;
                    }
                    else {
                        ui.printMessage("You done picked the wrong one");
                    }

                }

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
