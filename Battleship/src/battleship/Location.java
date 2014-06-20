/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package battleship;

import java.util.Scanner;

/**
 *
 * @author colto_000/Colton Blair
 */
public class Location {
    /*int row;
    int column;
    Player player;
    int displayValue = 0;
    int hits = 0;
    
    /**
     *
     * @return
     */
    
    /*int size;

    public Location(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;

    }*/
    
    //Adding a comment to test my commit.
    
    public String[][] makeStringListOfSpots() {
        String[][] listOfSpots = new String[5][5];
        String[] locationRow = { "A", "B", "C", "D", "E"};
        String[] locationColumn = { "1", "2", "3", "4", "5"};
        for (int row = 0; row < 5; row++)
        {
            for (int col = 0; col < 5; col++)
            {
                listOfSpots[row][col] = locationRow[row] + locationColumn[col];
            }
        }
        
        return listOfSpots;
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