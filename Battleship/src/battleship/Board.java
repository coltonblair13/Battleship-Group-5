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
    public void createPlayerBoard() {
        //This line creates a new array with 100 elements.
        char[] playerBoardArray = new char[100];
        
        //This loop puts a dash (-) as the value for each element of the array.
        for(int i = 0; i < playerBoardArray.length; i++) {
            //The line below means "Go to the element in playerBoardArray at
            //index number (whatever is in i) and set the value as a dash.
            playerBoardArray[i] = '-';
        }
        
        //This loop creates the board by displaying it.
        for(int i = 0; i < playerBoardArray.length; i++) {
            System.out.print(playerBoardArray[i] + "\t");
            //This if statement creates a new line after each row has 10 spaces.
            if((i + 1) % 10 == 0)
                System.out.print("\n");  
        }
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
    public static void showBoard(int[][] board){
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

    }

    public static void initShips(int[][] ships){
        Random random = new Random();
        
        for(int ship=0 ; ship < 3 ; ship++){
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
    }​

    
    
}
