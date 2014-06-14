package battleship;

import java.util.Scanner;

/**
 *
 * @author Ethan Stewart
 */
public class GameChoicesControl {

    public void displayOwnBoard(int currentPlayerNumber, String[][]playerOnePersonalBoard, String[][] playerTwoPersonalBoard) {
        String[][] ownBoard;
        if (currentPlayerNumber == 1) {
            ownBoard = playerOnePersonalBoard;
        } else {
            ownBoard = playerTwoPersonalBoard;
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(ownBoard[i][j] + "\t");
            }
            System.out.print("\n");
        }

    }

    public void displayOpponentBoard(int currentPlayerNumber, String[][] playerOneHitMissBoard, String[][] playerTwoHitMissBoard) {
        String[][] opponentBoard;
        if (currentPlayerNumber == 1) {
            opponentBoard = playerOneHitMissBoard;
        } else {
            opponentBoard = playerTwoHitMissBoard;
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(opponentBoard[i][j] + "\t");
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
