/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package battleship;

import java.util.Scanner;

/**
 *
 * @author Adam
 */
public class GameMenuControl {
    public GameMenuControl(){
        
    }

    GameMenuControl(Game game) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void displayGameSetup() {
        this.displayMenuBorder();
        System.out.println("\tPlace the location of your ships.\n");
        this.displayMenuBorder();
        
    }
    
    public void displayGameControl() {
        this.displayMenuBorder();
        System.out.println("\tEnter Coordinates:");
        this.displayMenuBorder();
        
    }
    
     public void displayBack() {
        this.displayMenuBorder();
        System.out.println("\tAre you sure you want to leave the battle?\n");
        System.out.println("\tYes\n");
        System.out.println("\tNo\n");
        this.displayMenuBorder();
    }
    public void displayMenuBorder(){
        System.out.println("\t===============================================================\n");
    }

    void takeTurn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void displayBoard() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void startNewGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void displayStatistics() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void displayPreferencesMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void displayHelpMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}