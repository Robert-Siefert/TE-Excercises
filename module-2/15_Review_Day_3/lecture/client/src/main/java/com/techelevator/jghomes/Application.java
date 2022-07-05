package com.techelevator.jghomes;

import com.techelevator.homes.model.Home;
import com.techelevator.homes.view.UserInterface;
import com.techelevator.jghomes.services.HomeClientService;


public class Application {

    private UserInterface ui;
    private HomeClientService homeCS;

    private final String GET_LIST_OF_HOMES = "1";
    private final String ADD_HOME = "2";
    private final String DELETE_HOME = "3";
    private final String SEARCH_FOR_HOME_BY_MLS = "4";
    private final String EXIT_PROGRAM = "5";

    /**
     * The main entry point in the application
     */
    public static void main(String[] args) {


        Application app = new Application();
        app.run();

    }

    public Application() {
        ui = new UserInterface();
        homeCS = new HomeClientService();

    }

    private void run() {

        while (true) {

            String choice = ui.printMenuOptions();

            //TODO: Remove next line. Here to test looping only
            System.out.println("You picked " + choice);

            if (choice.equals("1")) {    // retrieve all homes
                retrieveHomes();
            }
            else if (choice.equals("2")) {    //add a home
                addHome();
            }
            else if (choice.equals("3")) {   //delete a home
                deleteHome();
            }
            else if (choice.equals("4")) {    //search for a home
                searchForHomeByMLSId();
            }
            else if (choice.equals("5")) {    // exit program
                break;
            }
            else {   // not a valid choice. let user know
                ui.printStatusMessage("Not a valid choice");
            }

        }

    }

    private void searchForHomeByMLSId() {
       String mlsId = ui.askUserForMLSID();

        ui.printHome(homeCS.getHomeByMLSID(mlsId));


    }

    private void retrieveHomes() {

       ui.printHomes(homeCS.retrieveAllHomes());


    }

    private void addHome() {

        Home newHome = ui.getHomeInfo();

        ui.printHome(homeCS.addHome(newHome));


    }

    private void deleteHome() {
        String mlsId = ui.askUserForMLSID();

        if (homeCS.deleteHome(mlsId)) {
            ui.printStatusMessage("Home:"+mlsId + "was deleted");
        }else{
            ui.printStatusMessage("Home not Found");
        }


    }





}
