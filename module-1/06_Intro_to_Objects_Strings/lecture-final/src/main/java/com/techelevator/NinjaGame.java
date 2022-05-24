package com.techelevator;

public class NinjaGame {

    public static void main(String[] args) {

        Ninja steve;



        Ninja tony = new Ninja();
        tony.setName("Tony");
        tony.setCanFight(true);
        tony.setFavoriteWeapon("Light Saber");
        tony.setVisible(true);


        Ninja dylan = new Ninja();
        dylan.setName("Dylan");
        dylan.setCanFight(false);
        dylan.setVisible(false);
        dylan.setFavoriteWeapon("pillow");

        System.out.println(tony.getName());
        System.out.println(tony.getFavoriteWeapon());


        String ninjaName = dylan.getName();



        //String methods
        String name = ninjaName.toLowerCase();
        System.out.println(name);

        System.out.println(dylan.getName());
        System.out.println(dylan.getFavoriteWeapon());

        if (ninjaName.equals("Bob")) {
            //my name is Bob
        }

        String newName = ninjaName.concat(" The Great!");    // ninjaName + " The Great!"

        String searchValueEnd = "day";

        if (ninjaName.endsWith(searchValueEnd)) {

        }

        if(ninjaName.contains("la")) {

        }


        if (ninjaName.length() > 0) {
            // ok to
        }

        ninjaName.isEmpty();

    }


}
