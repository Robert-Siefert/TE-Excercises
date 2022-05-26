package com.techelevator;

public class FruitTree {
    private int piecesOfFruitLeft;
    private String typeOfFruit;

    public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
        piecesOfFruitLeft = startingPiecesOfFruit;
        this.typeOfFruit = typeOfFruit;

    }

    public int getPiecesOfFruitLeft() {
        return piecesOfFruitLeft;
    }

    public String getTypeOfFruit() {
        return typeOfFruit;
    }
    public boolean pickFruit(int numberOfPiecedToRemove){
        if (numberOfPiecedToRemove<=piecesOfFruitLeft) {
            piecesOfFruitLeft -= numberOfPiecedToRemove;
            return true;
        }else{
            return false;
        }
    }
}
