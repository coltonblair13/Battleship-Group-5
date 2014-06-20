
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
    Player playerB;*/
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
    
    /*public void displayPlayers(){
        System.out.println("\n\tHere are the two default players in the game of Battleship.");
        this.playerA.displayName();
        this.playerB.displayName();
    }*/
    /*
    In the hitOrMiss function, we wrote it with certain objects that are
    still being created. We desk checked very thoroughly and otherwise
    tested as much as we could, and will continue to debug tomorrow and Saturday
    as the other parts are written.
    -Ethan Stewart
    */
    public int locationArrayIndex(char locationString)
    {
        /*Location locations = new Location();
        char[] listOfSpots = locations.makeListOfSpots();
        for (int i = 0; i < listOfSpots.length; i++) {
            if(locationString == listOfSpots[i]) {
                return i;
            }            
        }*/     
        return -1;
    }
    
    /*
    This function
    */
    /*public void hitOrMiss(char guess) {
        Player currentPlayer = new Player();
        
        Location shipSpots = new Location();
        int guessValue = this.locationArrayIndex(guess);
        if(guessValue < 0)
            System.out.println(this.errorMessage);
        int locationArray = this.locationArrayIndex(guess);
        if(shipSpots[locationArray] == 0)
        {
            shipSpots.displayValue = (char) 88;
            shipSpots.hits += 1;
            currentPlayer.hitsLeft -= 1;
            System.out.println("\tYou got a hit!\n"
                    + "\tYou need " + "Player.currentPlayer.hitsLeft"
                    + " hits to win.\n");
        }
        else
        {
           shipSpots[locationArray].displayValue = (char) 77;
           System.out.println("\tYou missed!\n"
                    + "\tYou need " + "Player.currentPlayer.hitsLeft"
                    + " hits to win.\n");
        }
    
    }*/
    Player player1 = new Player();
    Player player2 = new Player();
    
    public void endOfGameStats() {
        int player1Hits = this.player1.player1Hits;
        int player2Hits = this.player2.player2Hits;
        int player1Misses = this.player1.player1Misses;
        int player2Misses = this.player2.player2Misses;
        int player1Shots = player1Hits + player1Misses;
        int player2Shots = player2Hits + player2Misses;
        String gameWinner;
        if(player1Hits > player2Hits)
            gameWinner = this.player1.name1;
        else
            gameWinner = this.player2.name2;
        int gamesWonPlayer1 = this.player1.player1Wins;
        int gamesLostPlayer1 = this.player1.player1Losses;
        int gamesWonPlayer2 = this.player2.player2Wins;
        int gamesLostPlayer2 = this.player2.player2Losses;
        double player1WinPercent = (double) gamesWonPlayer1 / (double) 
                this.player1.player1TotalGames * 100;
        player1WinPercent = Math.round(player1WinPercent * 10) / 10;
        double player1LosePercent = 100 - player1WinPercent;
        double player2WinPercent = (double) gamesWonPlayer2 / (double) 
                this.player2.player2TotalGames * 100;
        player2WinPercent = Math.round(player2WinPercent * 10) / 10;
        double player2LosePercent = 100 - player2WinPercent;
        System.out.println("GAME OVER!");
        System.out.println("Congratulations, " + gameWinner
                    + "! You won!\n"
                    + "\nStats for " + this.player1.name1
                    + "\nHits:\t\t" + player1Hits
                    + "\nMisses:\t\t" + player1Misses
                    + "\nTotal Shots:\t" + player1Shots
                    + "\n% Games Won:\t" + gamesWonPlayer1
                    + "\n% Games Lost:\t" + gamesLostPlayer1);
        System.out.println("\nStats for " + this.player2.name2
                    + "\nHits:\t\t" + player2Hits
                    + "\nMisses:\t\t" + player2Misses
                    + "\nTotal Shots:\t" + player2Shots
                    + "\n% Games Won:\t" + gamesWonPlayer2
                    + "\n% Games Lost:\t" + gamesLostPlayer2);
        
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
