package battleship;

import java.awt.Point;
import java.util.Scanner;

/**
 *
 * @author Ethan Stewart
 */
public class GetGuessView {
    
    public void getGuess() {

        Scanner inFile = new Scanner(System.in); // get input file      
        String[] coordinates;
        Point location = null;
        
        boolean valid = false;
        
        Location occupiedSpots = new Location();
        String[] occupiedSpotsList = occupiedSpots.createListOccupiedSpots(5);
        

        while (!valid) {
            // prompt for the row and column numbers
            System.out.println("\n\n\t" + "this.game.currentPlayer.name" + " it is your turn."
                + " Enter a row letter and column number (For example: G3)");
            
            // get the value entered by the user 
            String strRowColumn = inFile.nextLine(); 
            
            // trim off all extra blanks from the input
            strRowColumn = strRowColumn.trim();  
            
            // replace any commas enter with blanks
            strRowColumn = strRowColumn.replace(',', ' '); 
            
            // tokenize the string into an array of words
            coordinates = strRowColumn.split("\\s");
            
            //Converts row letter to uppercase if necessary
            coordinates[0] = coordinates[0].toUpperCase();

            //Following commented out for time being.
            /*if (coordinates.length < 1) { // the value entered was not blank?
                new BattleshipError().displayError(
                        "You must enter two numbers, a row and the column, "
                        + "or a \"Q\" to quit. Try again.");
                continue;
            }    

            else if (coordinates.length == 1) { // only one coordinate entered?
                if (coordinates[0].toUpperCase().equals("Q")) { // Quit?
                    return null;
                } else { // wrong number of values entered.
                    new BattleshipError().displayError(
                        "You must enter two numbers, a row and the column, "
                        + "or a \"Q\" to quit. Try again.");
                    continue;
                }
            }


            
            // convert each of the cordinates from a String type to 
            // an integer type
            int row = Integer.parseInt(coordinates[0]);
            int column = Integer.parseInt(coordinates[1]);
                     
            Board board = this.game.board; // get the game board*/
            
            //Check against array for valid location-ness
            Location validCheckObject = new Location();
            String[][] listOfSpots = validCheckObject.makeStringListOfSpots();
            boolean checkValidLocal = false;
            for (int i = 0; i < 10; i++)
            {
                for (int j = 0; j < 10; j++)
                {
                    if (strRowColumn.equals(listOfSpots[i][j]))
                    {
                    checkValidLocal = true;
                    break;
                    }
                }
                
            }
            if (checkValidLocal == false)
                new BattleshipError().displayError(
                        "Please enter a valid location, "
                        + "or a \"Q\" to quit. Try again.");
            
            //Check against array for occupied or not, set variable to true or false
            boolean boolHitMiss = false;
            for (int i = 0; i < occupiedSpotsList.length; i++)
            {
                if (strRowColumn.equals(occupiedSpotsList[i]))
                {
                    boolHitMiss = true;
                    break;
                }
            }
            
            //If true, display hit message
            if (boolHitMiss == true)
                System.out.println("Hit!");
            //If false, display miss message
            else
                System.out.println("Miss!");
            
            // create a Point object to store the row and column coordinates in
            /*location = new Point(row-1, column-1);
            
            // check to see if the location entered is already occupied
            if ( board.boardLocations[row-1][column-1].player != null ) {
                new BattleshipError().displayError(
                    "The current location is taken. Select another location");
                continue;
            }*/

            valid = true; // a valid location was entered

        }
        
        //return location; 
            
    }
}
