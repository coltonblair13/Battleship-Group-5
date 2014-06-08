package battleship;

import java.util.Scanner; /*Imports the Scanner utility to read input*/


public class Battleship {

    String name;
    String instructions = "The object of Battleship is to sink all of your \n"
            + "opponent's ships before they sink yours. You each get to \n"
            + "choose where to place three ships on your board. You then \n"
            + "take turns guessing locations on the board where you think \n"
            + "your opponent's ships are. If you guess a location which \n"
            + "contains part of a ship, it's a hit; otherwise, it's a miss.";

    public static void main(String[] args) {
        /*Battleship myGame = new Battleship();
         myGame.getName();
         myGame.displayHelp();
         Board boardSize = new Board();
         boardSize.displaySize();
        
         Game game = new Game();
         game.displayWinningMessage();
        
         Player player1 = new Player();
         player1.displayName();
        
         Game showStats = new Game();
         showStats.endOfGameStats();
        
         Location displaySpots = new Location();
         displaySpots.makeListOfSpots();

        Board testBoard = new Board();
        testBoard.createHitMissBoard();

        /*Board testBoard2 = new Board();
         testBoard2.createPlayerBoard();

         HelpMenuView testHelp = new HelpMenuView();
         testHelp.getInput();
        
         MainMenuView testMain = new MainMenuView();
         testMain.getInput();*/
        /*Location displaySpots = new Location();
         displaySpots.displayListOfSpots();
        
         displaySpots.displayOccupiedSpots();*/
         GetGuessView testGuessObject = new GetGuessView();
         for(int i = 0; i < 2; i++)
             testGuessObject.getGuess();
        
        /*Player testNameSort = new Player();
        String[] playerList = testNameSort.getName();
        GameMenuControl sortFunction = new GameMenuControl();
        playerList = sortFunction.sortPlayerList(playerList);
        sortFunction.displayPlayerList(playerList);*/        
    }

    public void displayHelp() {
        System.out.println("Welcome, " + this.name + "\n");
        System.out.println(this.instructions);
    }

}
