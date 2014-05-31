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
public class GameChoicesControl {
    public void makeNewGuess() {
        GetGuessView getGuessView = new GetGuessView();
        
        getGuessView.getGuess();
    }
    
    
    
    /*
    Author: Ethan
    This function, to be called from GameChoicesView, fills the array with
    the default board for yourself. In the future, it will be displaying from
    an array that is updated with each guess.
    */
    public void displayOwnBoard() {
        //Create instance of Board class to access necessary function.
        Board ownBoard = new Board();
        
        //Create the array containing what should be displayed
        //for each location.
        String[] playerBoardArray = ownBoard.createPlayerBoard();
        
        //Loop through the array and display the value within each index.
        for(int i = 0; i < playerBoardArray.length; i++) {
            System.out.print(playerBoardArray[i] + "\t");
            //This if statement creates a new line after each row has 10 spaces.
            if((i + 1) % 10 == 0)
                System.out.print("\n");  
        }
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
