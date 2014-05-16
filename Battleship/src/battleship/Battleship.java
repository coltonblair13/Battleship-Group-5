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
        Battleship myGame = new Battleship();
        myGame.getName();
        myGame.displayHelp();
        Board boardSize = new Board();
        boardSize.displaySize();
        
        Game game = new Game();
        game.displayWinningMessage();
        
        Player player1 = new Player();
        player1.displayName();
    }
    
    
    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        this.name = input.next();
    }
    
    public void displayHelp() {
        System.out.println("Welcome, " + this.name + "\n");
        System.out.println(this.instructions);
    }
    
    
    
}