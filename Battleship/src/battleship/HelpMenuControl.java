/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package battleship;

/**
 *
 * @author Ethan Stewart
 */
public class HelpMenuControl {
    public HelpMenuControl() {
        
    } 

    public void displayBoardHelp() {
        System.out.println();
        this.displayHelpBorder();             
        System.out.println( 
                "\tThe game board for Battleship is a 10X10 grid of squares."
                + "\n\tPlayers place their ships in different locations. They then "
                + "\n\tguess different locations in an attempt to find all of their "
                + "\n\topponent's ships. The first one to \"sink\" all five of their "
                + "\n\topponent's ships wins!");
        displayHelpBorder();
    }
    
    
        
    public void displayGameHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                 "\tThe objective of the game is to be the first player to sink "
                 + "\n\tall of their opponent's ships is the winner. Each player"
                 + "\n\ttakes a turn to guess a location on the board in hopes that "
                 + "\n\tthey can hit part of a ship. First one to sink all five "
                 + "\n\tof their opponent's ships wins."); 
        displayHelpBorder();
    }
            
    public void displayRealPlayerHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                "\tA real player manually takes their turn by guessing "
                + "\n\ta location on the board."); 
        displayHelpBorder();
    }
    
                   
    public void displayComputerPlayerHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                "\tA computer based player automatically guesses a square "
                + "\n\timmediately after a real player in a single player game."
                ); 
        displayHelpBorder();
    }
             
    public void displayShipHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
               "\tEach player starts with five ships. One is five squares long, "
               + "\n\tone is four, two are three, and one is two. Each guess "
               + "\n\tcontaining part of a ship is a hit; when all sections of a ship "
               + "\n\thave been hit, the ship is sunk."); 
        displayHelpBorder();
    }
                 
    public void displayHitsMissesHelp() {
        System.out.println();
        displayHelpBorder();
        System.out.println(
                "\tIf the square you guess contains part of an opponent's ship, "
                + "\n\tthen it will dispay an X. If you miss it will display an O.");
        displayHelpBorder();
    }
    
    
    public void displayHelpBorder() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
