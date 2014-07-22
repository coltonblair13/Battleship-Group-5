package cit26001.group5.battleship.menuviews;

import cit26001.group5.battleship.menucontrol.GameChoicesControl;
import cit26001.group5.battleship.other.GetGuessView;
import cit26001.group5.battleship.customExceptions.MenuException;
import cit26001.group5.battleship.other.Player;
import cit26001.group5.battleship.interfaces.*;

/**
 *
 * @author Ethan Stewart
 */
public class GameChoicesView extends MenuView implements EnterInfo{
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
    public int playerNumber = 1;
    private Player player;
    
    // Default constructor
    public GameChoicesView() {
        setMenuItems(menuItems);
    } 
    
    // Display the help menu and get the end users input selection

    /**
     *
     * @param player
     * @return 
     */
    public String getInput(Player player) {
        
        String command = null;
        do {
            try {
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
            }
            }
            catch (MenuException exc) {
                System.out.println(exc.getMessage());
            }
        } while (!command.equals("Q") && !command.equals("G"));
        return command;
    }

    private String getCommand() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
