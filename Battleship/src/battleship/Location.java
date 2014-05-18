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
    int row;
    int column;
    Player player;
    int displayValue = 0;
    int hits = 0;
    
    /**
     *
     * @return
     */
    public char[] makeListOfSpots() {
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
        }*/
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
            char inputLocation;
            for(int x = 0; x < 3; x++) {
                char inputLocation += input.next().charAt(x);
            }
            Game check = new Game();
            int desiredLocation;
            if(desiredLocation < 0)
                shipLocations[i] = "";
        }
        for (int i = 0; i < listOfSpots.length; i++) {
            int counter = 0;
            if(shipLocations[counter] == listOfSpots[i])
                listOfSpots[i] = '0';
            else
                counter++;
        }     
        return -1;
    }
    
    
    
    
    
    public Location() {
        
    }
    
    /*public void occupyLocation(Player player) {
        this.player = player;
    }*/
    
    public void pegMarker() {
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