/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. This is a test
 */

package battleship;

/**
 *
 * @author Ethan Stewart
 */
public class Board {
    int rowCount = 5;
    int columnCount = 5;
    String[][] playerOnePersonalBoard = this.createPlayerBoard();
    String[][] playerOneHitMissBoard = this.createHitMissBoard();
    String[][] playerTwoPersonalBoard = this.createPlayerBoard();
    String[][] playerTwoHitMissBoard = this.createHitMissBoard();
    
 
    
    public void displaySize() {
        System.out.println("\nThe Battleship board contains " + this.rowCount + " rows and " + this.columnCount + " columns.\n");
    }
    
    public String[][] createPlayerBoard() {
        //This line creates a new 5X5 multi-dimensional array.
        String[][] playerBoardArray = new String[5][5];
        
        //This loop puts a tilde (~) as the value for each element of the array.
        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                playerBoardArray[i][j] = "~";
            }
        }
        
        return playerBoardArray;
    }
    
    public String[][] createHitMissBoard() {
        //This line creates a new 5X5 multi-dimensional array.
        String[][] hitMissArray = new String[5][5];
        
        //This loop puts a tilde (~) as the value for each element of the array.
        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                hitMissArray[i][j] = "~";
            }
        }
        
        return hitMissArray;
    }
    
    
    /*public static void showBoard(int[][] board){
        System.out.println("\t1 \t2 \t3 \t4 \t5");
        System.out.println();
        
        for(int row=0 ; row < 5 ; row++ ){
            System.out.print((row+1)+"");
            for(int column=0 ; column < 5 ; column++ ){
                if(board[row][column]==-1){
                    System.out.print("\t"+"~");
                }else if(board[row][column]==0){
                    System.out.print("\t"+"*");
                }else if(board[row][column]==1){
                    System.out.print("\t"+"X");
                }
                
            }
            System.out.println();
        }

    }*/

    
    
    /*public static void initShips(int[][] ships){
        Random random = new Random();
        
        for(int ship=0 ; ship < 5 ; ship++){
            ships[ship][0]=random.nextInt(5);
            ships[ship][1]=random.nextInt(5);
            
            //let's check if that shot was already tried 
            //if it was, just finish the do...while when a new pair was randomly selected
            for(int last=0 ; last < ship ; last++){
                if( (ships[ship][0] == ships[last][0])&&(ships[ship][1] == ships[last][1]) )
                    do{
                        ships[ship][0]=random.nextInt(5);
                        ships[ship][1]=random.nextInt(5);
                    }while( (ships[ship][0] == ships[last][0])&&(ships[ship][1] == ships[last][1]) );
            }
            
        }
    }*/

    
    
}
