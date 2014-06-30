package cit26001.group5.battleship.menuviews;

import battleship.GameChoicesControl;
import battleship.GetGuessView;
import battleship.MenuView;
import java.util.Scanner;

/**
 *
 * @author Ethan Stewart
 */
public class GameChoicesView extends MenuView {
    private final static String[][] menuItems = {
        {"G", "Make your guess"},
        {"P", "Display your board"}, 
        {"O", "Display opponent's board (your hits and misses)"},
        {"N", "New game"},
        {"S", "Calculate statistics"},
        {"H", "Help"},
        {"Q", "Quit"}        
    };
    
    // Create instance of the GameChoicesControlControl (action) class
    GameChoicesControl gameChoicesControl = new GameChoicesControl();
    GetGuessView getGuessViewObject = new GetGuessView();
    int playerNumber = 1;
    
    // Default constructor
    public GameChoicesView() {
        setMenuItems(menuItems);
    } 
    
    // Display the help menu and get the end users input selection
    public void getInput() {
        String command;
        do {            
            System.out.println("player.name" + "'s turn");
            this.display(); // Display the menu
            
            // Get the user's choice and make it uppercase
            command = getCommand();
            
            //Each option in this switch will eventually be updated
            //to call an actual function from the GameChoicesControl class.
            switch (command) {
                case "G":
                    playerNumber = getGuessViewObject.getGuess(player);
                    break;
                case "P":
                    this.gameChoicesControl.displayOwnBoard(player);
                    break;
                case "O":
                    this.gameChoicesControl.displayOpponentBoard(player);
                    break;                  
                case "N":
                    this.gameChoicesControl.startNewGame();
                    break;
                case "S":
                    this.gameChoicesControl.calcStatistics();
                    break;
                 case "H":
                    this.gameChoicesControl.goToHelp();
                    break; 
                case "Q": 
                    break;
                default: 
                    System.out.println("Invalid input. Please select a valid option from the menu.");
                    continue;
            }
        } while (!command.equals("Q") && !command.equals("G"));  
    }
}
