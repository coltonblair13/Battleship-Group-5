/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit26001.group5.battleship.menuviews;

import cit26001.group5.battleship.other.BattleshipError;
import cit26001.group5.battleship.game.Game;
import cit26001.group5.battleship.menucontrol.GameMenuControl;
import cit26001.group5.battleship.customExceptions.GameException;
import java.util.Scanner;

/**
 *
 * @author Colton Blair
 */
public class GameMenuView {
    
    private Game game;
    private GameMenuControl gameMenuControl = new GameMenuControl(); 


    private final static String[][] menuItems = {
        {"T", "Take your turn"},
        {"D", "Display the board"},
        {"N", "New Game"},
        {"R", "Report stastics"},
        {"P", "Change game preferences"},
        {"H", "Help"},
        {"Q", "QUIT"}
    };

    public GameMenuView(Game game) {
        try {
        this.gameMenuControl = new GameMenuControl(game);
        }
        catch (GameException exc) {
            System.out.println(exc.getMessage());
        }
        
    }

    
    
    public void getInput() {
   
        String command = null;
        Scanner inFile = new Scanner(System.in);

        do {
            try{
            this.display(); // display the menu

            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "T":
                    this.gameMenuControl.takeTurn();
                    break;
                case "D":
                    gameMenuControl.displayBoard();
                    break;
                case "N":
                    gameMenuControl.startNewGame();
                    break;
                case "R":
                    gameMenuControl.displayStatistics();
                    break;
                case "P":
                    gameMenuControl.displayPreferencesMenu();
                    break;
                case "H":
                    gameMenuControl.displayHelpMenu();
                    break;
                case "Q":                   
                    break;
                default: 
                    new BattleshipError().displayError("Invalid command. Please enter a valid command.");
            }
        } catch (GameException e) {
                    System.out.println("\n" + e.getMessage());
                }  
        } while (!command.equals("Q"));
    }
    


    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (String[] menuItem : GameMenuView.menuItems) {
            System.out.println("\t   " + menuItem[0] + "\t" + menuItem[1]);
        }
        System.out.println("\t===============================================================\n");
    }
  
}
