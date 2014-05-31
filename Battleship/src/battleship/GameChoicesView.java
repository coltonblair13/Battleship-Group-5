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
    
    // Create instance of the HelpMenuControl (action) class
    private GameChoicesControl gameChoicesControl = new GameChoicesControl();
    
    // Default constructor
    public GameChoicesView() {
        
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
            
            //Each option in this switch will eventually be updated
            //to call an actual function from the GameChoicesControl class.
            switch (command) {
                case "G":
                    this.gameChoicesControl.makeNewGuess();
                    break;
                case "P":
                    this.gameChoicesControl.displayOwnBoard();
                    break;
                case "O":
                    this.gameChoicesControl.displayComputerPlayerHelp();
                    break;                  
                case "N":
                    this.gameChoicesControl.displayHitsMissesHelp();
                    break;
                case "S":
                    this.gameChoicesControl.displayRealPlayerHelp();
                    break;
                 case "H":
                    this.gameChoicesControl.displayShipHelp();
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
