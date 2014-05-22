/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package battleship;

import java.util.Scanner;

/**
 *
 * @author Ethan Stewart
 */
public class HelpMenuView {
    private final static String[][] menuItems = {
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
        
    } 
    
    // Display the help menu and get the end users input selection
    public void getInput() {       
              
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            
            this.display(); // Display the menu
            
            // Get command entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
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
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < HelpMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
}
