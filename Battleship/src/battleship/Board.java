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
        System.out.println(" rows and " 
                + "\nThe Battleship board contains " + this.rowCount + " rows and " + this.columnCount + " columns.\n");
    }
}
