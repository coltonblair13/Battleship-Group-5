
package battleship;

/**
 *
 * @author Adam Kelley
 */

/*
Hey Adam-
I was helping Chelsea with the creation of the Player class, like we'd talked
about on Thursday. In order to streamline the program more, I commented out your
player-related instance variables in this class, so it currently just contains
an instance variable for the winning message and the function to display that
(I also had to make the call to display the winner and loser into strings so
it would compile and run correctly. We can change that when we build the
actual game).
This was the best way we could figure out to make sure both yours and hers
work as they're supposed to. E-mail or text me if you see any issues or need
me to explain that better.
-Ethan Stewart
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

// Author: Adam 
    //This function is to record the loser in the game.
     /*public void recordLoser() {
        if (this.currentPlayer == this.player1) {
            this.loser = this.player1;
            this.winner = this.player2;
        } else {
            this.loser = this.player2;
            this.winner = this.player1;
        }*/
        
        /*
        Adam--
        I changed a couple of variables so that the error messages would
        go away and I could push this to GitHub. If you have any questions about
        what I did, you can text me or email me or possibly set up a 
        Google Hangout.
        --Ethan
        */

        /*long noWins = this.winner.wins;
        noWins++;
        this.winner.wins = noWins;
        long noLosses = this.loser.losses;
        noLosses++;
        this.loser.losses = noLosses;

        this.status = new Player().setLoser();
        
    }*/
     
}
