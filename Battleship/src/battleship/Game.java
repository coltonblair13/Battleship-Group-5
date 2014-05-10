
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
    /*Player playerA;
    Player playerB;
    Player currentPlayer;
    Player otherPlayer;*/
    Player winner;
    Player loser;
    String status;
    Board board;
    String winningMessage = "\n\t**************************************************************"
            + "\n\t Congratulations " + "this.winner.name" + "! You won the game!"
            + "\n\t Sorry " + "this.loser.name" + ", You are the loser."
            + "\n\t************************************************************";
    
    /*public Game(){
        this.playerA = new Player();
        this.playerA.name = "Nephi";
        this.playerB = new Player();
        this.playerB.name = "Moriancumer";
        
    }*/
    
    public void displayWinningMessage(){
        System.out.println(this.winningMessage);
        
    }
    
    /*public void displayPlayers(){
        System.out.println("\n\tHere are the two default players in the game of Battleship.");
        this.playerA.displayName();
        this.playerB.displayName();
    }*/
        
}
