package cit26001.group5.battleship.menuviews;

import battleship.MainMenuControl;
import battleship.MenuView;
import java.util.Scanner;

/**
 *
 * @author chellybean145
 */
public class MainMenuView extends MenuView {

    public final static String[][] menuItems = {
        {"1", "One player game"},
        {"2", "Two player game"},
        {"H", "Help"},
        {"X", "Exit Battleship"}
    };
    
    MainMenuView() {
        setMenuItems(menuItems);
    }
    
    MainMenuControl mainMenuControl = new MainMenuControl();

    public void getInput() {

        String command;

        do {
            this.display(); // display the menu

            // get commaned entered
            command = getCommand();

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

        return;
    }
}
