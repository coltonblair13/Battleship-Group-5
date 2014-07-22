package cit26001.group5.battleship.menuviews;

import cit26001.group5.battleship.menucontrol.MainMenuControl;
import cit26001.group5.battleship.interfaces.GetLocation;
import java.util.Scanner;

/**
 *
 * @author chellybean145
 */
public class MainMenuView extends MenuView implements GetLocation{

    public final static String[][] menuArray = {
        {"Start game"},
        {"H", "Help"},
        {"X", "Exit Battleship"}
    };
    
    public MainMenuView() {
        super(menuArray);
    }
    
    MainMenuControl mainMenuControl = new MainMenuControl();

    /**
     *
     * @return
     */
    @Override
    public String getInput() {

        String command;

        do {
            this.display(); // display the menu

            // get commaned entered
            Scanner input = new Scanner(System.in);
            command = input.nextLine();

            switch (command) {
                case "1":
                    this.mainMenuControl.startGame(1);
                    break;
                case "2":
                    this.mainMenuControl.startGame(2);
                    break;
                case "H":
                    this.mainMenuControl.displayHelpMenu();
                    break;
                case "X":
                    break;
                default:
                    System.out.println("Invalid command. Please enter a valid command.");
                    continue;
            }
        } while (!command.equals("X"));

        return command;
    }

    @Override
    public String getLocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
