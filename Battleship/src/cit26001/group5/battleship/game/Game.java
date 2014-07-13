
package cit26001.group5.battleship.game;

import cit26001.group5.battleship.other.Board;
import cit26001.group5.battleship.other.Player;

/**
 *
 * @author Adam Kelley
 */


public class Game {
    String gameType;
    Player currentPlayer;
    Player otherPlayer;
    Player winner;
    Player loser;
    String status;
    Board board;
    String winningMessage = "\n\t**************************************************************"
            + "\n\t Congratulations " + "this.winner.name" + "! You won the game!"
            + "\n\t Sorry " + "this.loser.name" + ", You are the loser."
            + "\n\t************************************************************";
    String errorMessage = "Invalid row/column combination. Please try again.\n"
            +"Row must be a letter from A to J.\n"
            + "Column must be a number from 1 to 10.\n"
            + "Don't type any spaces between the row and column.";
    int currentPlayerNumber = 1;
    
    public void displayWinningMessage(){
        System.out.println(this.winningMessage);
        
    }
     
}
