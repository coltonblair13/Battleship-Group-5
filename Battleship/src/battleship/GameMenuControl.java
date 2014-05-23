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
    
}
