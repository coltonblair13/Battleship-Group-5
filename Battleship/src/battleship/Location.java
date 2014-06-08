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
        String[][] listOfSpots = new String[10][10];
        String[] locationRow = { "A", "B", "C", "D", "E",
            "F", "G", "H", "I", "J" };
        String[] locationColumn = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10" };
        for (int row = 0; row < 10; row++)
        {
            for (int col = 0; col < 10; col++)
            {
                listOfSpots[row][col] = locationRow[row] + locationColumn[col];
            }
        }
        
        return listOfSpots;
    }
    
    public void displayListOfSpots() {
        Location listOfSpotsObject = new Location();
        String[][] listOfSpots = listOfSpotsObject.makeStringListOfSpots();
        
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                System.out.println(listOfSpots[i][j]);
            }
            System.out.println("\n");
        }
    }
    
    public String[] createListOccupiedSpots(int shipSpots) {
        String[] occupiedSpots = new String[shipSpots];
        for (int i = 0; i < shipSpots; i++)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter a location: ");
            occupiedSpots[i] = input.nextLine();
        }
        
        return occupiedSpots;
    }
    
    public void displayOccupiedSpots() {
        Location occupiedSpotsObject = new Location();
        String[] occupiedSpotsList = occupiedSpotsObject.createListOccupiedSpots(5);
        for (int i = 0; i < occupiedSpotsList.length; i++)
        {
            System.out.println(occupiedSpotsList[i]);
        }
    }
    
    /*
    public boolean shipLocations() {
        Location locations = new Location();
        char[] listOfSpots = locations.makeListOfSpots();
        String[] shipLocations = new String[17];
        for(int i = 0; i < shipLocations.length; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter desired ship location: ");
            String inputLocation = input.next();
            //char inputLocation;
            for(int x = 0; x < 3; x++) {
                char inputLocation += input.next().charAt(x);
            }
            Game check = new Game();
            /*int desiredLocation;
            if(desiredLocation < 0)
                shipLocations[i] = "";*/
        }
        /*for (int i = 0; i < listOfSpots.length; i++) {
            int counter = 0;
            if(shipLocations[counter] == listOfSpots[i])
                listOfSpots[i] = '0';
            else
                counter++;
        }     
        return -1;
    }*/
    
    
    
    
    
    /*public Location() {
        
    }
    
    public void occupyLocation(Player player) {
        this.player = player;
    }*/
    
    /*public void pegMarker() {
        if (this.player != null) {
            System.out.println(this.player.marker);
        }
        else {
            System.out.println(" ");
        }
    }

    private static class Player {
        private boolean marker;

        public Player() {
        }
    }
            
       
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package battleship;

/**
 *
 * @author colto_000/Colton Blair
 */
/*public class Location {

    int row;
    int column;
    Player player;
    private int[][] grid;

  

    public void occupyLocation(Player player) {
        this.player = player;
    }

    public void pegMarker() {
        if (this.player != null) {
            System.out.println(this.player.marker);
        } else {
            System.out.println(" ");
        }
    }

    private static class Player {

        private boolean marker;

        public Player() {
        }
    }

    public static final int OUT_OF_BOUNDS = -1;

    public static final int EMPTY = 0;
    public static final int SHIP = 1;
    public static final int HIT = 2;
    public static final int MISS = 3;

    private static final int DIRECTION_RIGHT = 0;
    private static final int DIRECTION_DOWN = 1;

    private static final int SHIP1_LENGTH = 5;
    private static final int SHIP2_LENGTH = 4;
    private static final int SHIP3_LENGTH = 3;
    private static final int SHIP4_LENGTH = 3;
    private static final int SHIP5_LENGTH = 2;

    private static final int[] SHIP_LENGTHS
            = {
                SHIP1_LENGTH,
                SHIP2_LENGTH,
                SHIP3_LENGTH,
                SHIP4_LENGTH,
                SHIP5_LENGTH
            };

    private static int totalHitsRequired;

    public final int NUM_ROWS;
    public final int NUM_COLS;

    public Location(int numRows, int numCols) {
        NUM_ROWS = numRows;
        NUM_COLS = numCols;

        initializeGrid();

        calculateTotalHitsRequired();

        placeAllShips();
    }

    private void initializeGrid() {

    }

    private static void calculateTotalHitsRequired() {
        totalHitsRequired = 0;

        for (int length : SHIP_LENGTHS) {
            totalHitsRequired += length;
        }
    }

    private void placeAllShips() {

    }

    public boolean attack(int row, int col) {

        return false;
    }

    public boolean allDestroyed() {

        return false;
    }

    private boolean inBounds(int row, int col) {
        return ((row >= 0) && (row < NUM_ROWS)
                && (col >= 0) && (col < NUM_COLS));
    }

    public int getCell(int row, int col) {
        if (inBounds(row, col)) {
            return grid[row][col];
        } else {
            return OUT_OF_BOUNDS;
        }
    }

    public void printGrid() {

    }
}*/
    
    
    
