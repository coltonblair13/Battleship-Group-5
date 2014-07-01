package cit26001.group5.battleship.menucontrol;

import battleship.Player;
import cit26001.group5.battleship.menuviews.HelpMenuView;
import java.util.Scanner;

/**
 *
 * @author Ethan Stewart
 */
public class GameChoicesControl {

    public void displayOwnBoard(Player player) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(player.personalBoard[i][j] + "\t");
            }
            System.out.print("\n");
        }

    }

    public void displayOpponentBoard(Player player) {
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(player.hitMissBoard[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    public void startNewGame() {
        Scanner input = new Scanner(System.in);
        System.out.println("Are you sure you want to start a new game? (y/n)");
        String userInput = input.next();
        do {
            switch (userInput) {
                case "y":
                    new MainMenuControl().startGame(2);
                    break;
                case "n":
                    break;
                default:
                    System.out.println("Invalid input. Enter a \"y\" for yes, or "
                            + "a \"n\" for no.");
                    break;
            }
        } while (!"y".equals(userInput) && !"n".equals(userInput));
    }

    public void calcStatistics() {
        System.out.println("The function to calculate your statistics is under construction."
                + "Please choose a different option.");
    }

    public void goToHelp() {
        new HelpMenuView().getInput();
    }

}
