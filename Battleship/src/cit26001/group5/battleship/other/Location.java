/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package cit26001.group5.battleship.other;

import java.util.Scanner;

/**
 *
 * @author colto_000/Colton Blair
 */
public class Location {
    private int numRow;
    private int numCol;
    public String[][] listOfSpots;
    
    Location() {
        numRow = 5;
        numCol = 5;
        listOfSpots = makeStringListOfSpots();
    }
    
    public String[][] makeStringListOfSpots() {
        String[][] spotArray = new String[this.numRow][this.numCol];
        String[] locationRow = { "A", "B", "C", "D", "E"};
        String[] locationColumn = { "1", "2", "3", "4", "5"};
        for (int row = 0; row < 5; row++)
        {
            for (int col = 0; col < 5; col++)
            {
                spotArray[row][col] = locationRow[row] + locationColumn[col];
            }
        }
        
        return spotArray;
    }
    
    public void displayListOfSpots() {
        Location listOfSpotsObject = new Location();
        String[][] listOfSpots = listOfSpotsObject.makeStringListOfSpots();
        
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                System.out.print(listOfSpots[i][j] + "\t");
            }
            System.out.println("\n");
        }
    } 
}
