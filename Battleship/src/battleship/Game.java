
package battleship;

/**
 *
 * @author Adam Kelley
 */
public class Game {
    String gameType;
    Player playerA;
    Player playerB;
    Player currentPlayer;
    Player otherPlayer;
    Player winner;
    Player loser;
    String status;
    Board board;
    
    public Game(){
        this.playerA = new Player();
        this.playerA.name = "Nephi";
        this.playerB = new Player();
        this.playerB.name = "Moriancumer";
        
    }
    
    public void displayWinningMessage(){
        System.out.println(
            "\n\t**************************************************************"
            + "\n\t Congradulations " + this.winner.name + "! You won the game!"
            + "\n\t Sorry " + this.loser.name + ", You are the loser."
            + "\n\t************************************************************");
        
    }
    
    public void displayPlayers(){
        System.out.println("\n\tHere are the two default players in the game of Battleship.");
        this.playerA.displayName();
        this.playerB.displayName();
    }
        
}
