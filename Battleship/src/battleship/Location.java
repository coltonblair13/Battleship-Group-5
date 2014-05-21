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
    /*public char[] makeListOfSpots() {
        char[] hitMissBoard = new char[100];
        char location = 'A';
        for(int i = 0; i < hitMissBoard.length; i++) {
            int counter = i % 10;
            hitMissBoard[i] = location + (char) (counter + 49);
            if((i + 1) % 10 == 0)
                hitMissBoard[i] = location + (char) 49 + (char) 48;
            if((i + 1) == 10)
                location = 'B';
            if((i + 1) == 20)
                location = 'C';
            if((i + 1) == 30)
                location = 'D';
            if((i + 1) == 40)
                location = 'E';
            if((i + 1) == 50)
                location = 'F';
            if((i + 1) == 60)
                location = 'G';
            if((i + 1) == 70)
                location = 'H';
            if((i + 1) == 80)
                location = 'I';
            if((i + 1) == 90)
                location = 'J';
        }
        /*for(int i = 0; i < hitMissBoard.length; i++) {
            System.out.println(hitMissBoard[i]);
            if((i + 1) % 10 == 0)
                System.out.println('\n');
        }
        return hitMissBoard;
    }
    
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
