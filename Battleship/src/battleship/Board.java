/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. This is a test
 */

package battleship;

/**
 *
 * @author BE$T
 */
public class Board {
    int rowCount = 10;
    int columnCount = 10;
    
 
    
    public void displaySize() {
        System.out.println("\nThe Battleship board contains " + this.rowCount + " rows and " + this.columnCount + " columns.\n");
    }
    /* This method is used for determining whether there is a hit or a miss on the 
    board.  This method also creates the default values of the board. Author - Adam
    */
    public void hitMissBoard(){
        int[] hitMissArray;
        hitMissArray = new int[100];
        for (int i=0; i < 100; i++) {
            hitMissArray[i]=0;
        }
        for (int i = 0; i < 100; i++) {
            System.out.println(hitMissArray[i] + "\t");
            if((i + 1) % 10 == 0)
                System.out.println(hitMissArray[i] + "\n");
                           
        }
    }
    
    
    //Needs to be a public function, returns nothing so is void. And you can
    //name it whatever you want.
    public String[] createPlayerBoard() {
        //This line creates a new array with 100 elements.
        String[] playerBoardArray = new String[100];
        
        //This loop puts a dash (-) as the value for each element of the array.
        for(int i = 0; i < playerBoardArray.length; i++) {
            //The line below means "Go to the element in playerBoardArray at
            //index number (whatever is in i) and set the value as a dash.
            playerBoardArray[i] = "-";
        }
        
        return playerBoardArray;
    }
    
    public void createHitMissBoard() {
        //This line creates a new array with 100 elements.
        String[] hitMissArray = new String[100];
        
        //This loop puts a dash (-) as the value for each element of the array.
        for(int i = 0; i < hitMissArray.length; i++) {
            //The line below means "Go to the element in playerBoardArray at
            //index number (whatever is in i) and set the value as a dash.
            hitMissArray[i] = "0";
        }
        //Create a variable to store the output.
        String output = "";
        //This loop creates the board by displaying it.
        for(int i = 0; i < hitMissArray.length; i++) {
            output += hitMissArray[i];
            System.out.print(hitMissArray[i] + "\t");
            //This if statement creates a new line after each row has 10 spaces.
            if((i + 1) % 10 == 0)
                System.out.print("\n");  
        }
    }
    
    
}
