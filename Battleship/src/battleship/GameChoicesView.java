package battleship;

import java.util.Scanner;

/**
 *
 * @author Ethan Stewart
 */
public class GameChoicesView {
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
        
    } 
    
    // Display the help menu and get the end users input selection
    public String getInput(String[][] playerOnePersonalBoard, String[][] playerOneHitMissBoard, 
                         String[][] playerTwoPersonalBoard, String[][] playerTwoHitMissBoard, 
                         int currentPlayer) {       
              
        //Declare variable for user to enter an option.
        String command;
        //Create object for the input.
        Scanner inFile = new Scanner(System.in);
        
        
        
        do {
            
            System.out.println("Player " + currentPlayer + "'s turn");
            this.display(); // Display the menu
            
            // Get the user's choice and make it uppercase
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            //Each option in this switch will eventually be updated
            //to call an actual function from the GameChoicesControl class.
            switch (command) {
                case "G":
                    playerNumber = getGuessViewObject.getGuess(playerOnePersonalBoard, playerOneHitMissBoard, 
                            playerTwoPersonalBoard, playerTwoHitMissBoard, currentPlayer);
                    break;
                case "P":
                    this.gameChoicesControl.displayOwnBoard(currentPlayer, playerOnePersonalBoard, playerTwoPersonalBoard);
                    break;
                case "O":
                    this.gameChoicesControl.displayOpponentBoard(currentPlayer, playerOneHitMissBoard, playerTwoHitMissBoard);
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
        
         return command;
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
