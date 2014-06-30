/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit26001.group5.battleship.menuviews;

import battleship.HelpMenuControl;
import battleship.MenuView;
import java.util.Scanner;

/**
 *
 * @author Ethan Stewart
 */
public class HelpMenuView extends MenuView {
    public final static String[][] menuItems = {
        {"B", "The board"},
        {"C", "A computer player"}, 
        {"G", "The game of Battleship"},
        {"H", "Hits and Misses"},
        {"R", "A regular player"},
        {"S", "Ships"},
        {"Q", "Quit Help"}        
    };
    
    // Create instance of the HelpMenuControl (action) class
    private HelpMenuControl helpMenuControl = new HelpMenuControl();
    
    // Default constructor
    public HelpMenuView() {
        setMenuItems(menuItems);
    } 
    
    // Display the help menu and get the end users input selection
    public void getInput() {       
              
        String command;
        
        do {
            
            this.display(); // Display the menu
            
            // Get command entered
            command = getCommand();
            
            switch (command) {
                case "B":
                    this.helpMenuControl.displayBoardHelp();
                    break;
                case "C":
                    this.helpMenuControl.displayComputerPlayerHelp();
                    break;
                case "G":
                    this.helpMenuControl.displayGameHelp();
                    break;                  
                case "H":
                    this.helpMenuControl.displayHitsMissesHelp();
                    break;
                case "R":
                    this.helpMenuControl.displayRealPlayerHelp();
                    break;
                 case "S":
                    this.helpMenuControl.displayShipHelp();
                    break; 
                case "Q": 
                    break;
                default: 
                    System.out.println("Invalid input. Please select a valid option from the menu.");
                    continue;
            }
        } while (!command.equals("Q"));  
        
         return;
    }

        // displays the help menu
}
