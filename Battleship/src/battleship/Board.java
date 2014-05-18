/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    /* This method is used for determining wither there is a hit or a miss on the 
    board.  This method also creates the default values of the board. Author - Adam
    */
    public void hitMissBoard(){
        int[] hitMissArray;
        hitMissArray = new int[100];
        for (int i=0, i < 100, i++); {
            hitMissArray[i]=0;
        }
        for (int i = 0, i < 100, i++);{
            system.out.println(hitMissArray[i] + "\t");
            if((i + 1) % 10 == 0)
                system.out.println(hitMisArray[i] + "\n");
                           
        }
    }
}
