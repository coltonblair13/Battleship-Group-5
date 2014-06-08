/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package battleship;

import java.util.Scanner;

    /**Author Chelsea Miller
 * This is a lot of coding I know, but this is what I was able to come up with from looking at 
 * examples of code. We need to change some of the names to match what is in our game, and I have 
 * been waiting to hear from Adam what he is using for his, as ours will have the same names and be 
 * pretty similar. But this should allow to place, then check. I found it at
 * http://stackoverflow.com/questions/5622135/need-help-programming-battleship-location-selector-checker
 * 
 * @author chellybean145
 */
    public class Ship {

    private final int rows;
    private final int cols;

    private char[][] board;

    public Ship(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        board = new char[rows][cols];
    }

    public void place(Ship[] ships) {

        Arrays.sort(ships,new Comparator<Ship>() {

            @Override
            public int compare(Ship s1, Ship s2) {
                return Integer.valueOf(s1.size).compareTo(Integer.valueOf(s2.size));
            }
        });

        for (int j = 0; j < rows; j++)
            for (int k = 0; k < cols; k++)
                board[j][k] = '-'; // Empty position

        char[][] checked = new char[rows][cols];
        Random random = new Random();
        for (int i = ships.length - 1; i >=0; i--) {
            for (int j = 0; j < rows; j++)
                for (int k = 0; k < cols; k++)
                    checked[j][k] = 'U'; // Unchecked position
            boolean placed = false;
            while (! placed) {
                int r = random.nextInt(rows);
                int c = random.nextInt(cols);
                if (checked[r][c] == 'U') {
                    checked[r][c] = 'C'; // Checked position
                    if (board[r][c] == '-') {
                        int direction = random.nextInt(4);
                        // 0 = North; 1 = East; 2 = South; 3 = West;
                        if (canPlace(ships[i], r, c, direction)) {
                            place(ships[i], r, c, direction);
                            placed = true;
                        }
                    }               
                }
            }
        }
    }

    private void place(Ship ship, int row, int col, int direction) {
        int size = ship.getSize();
        switch (direction) {
        case 0: // North
            for (int  i = row; i >= row - (size - 1); i--)
                board[i][col] = 'S';
            break;

        case 1: // East
            for (int i = col; i <= col + (size - 1); i++)
                board[row][i] = 'S';
            break;

        case 2: // South
            for (int i = row; i <= row + (size - 1); i++)
                board[i][col] = 'S';
            break;

        default: // West
            for (int i = col; i >= col - (size - 1); i--) 
                board[row][i] = 'S';
            break;
        }       
    }

    private boolean canPlace(Ship ship, int row, int col, int direction) {
        int size = ship.getSize();
        boolean thereIsRoom = true;
        switch (direction) {
        case 0: // North
            if (row - (size - 1) < 0)
                thereIsRoom = false;
            else 
                for (int  i = row; i >= row - (size - 1) && thereIsRoom; i--)
                    thereIsRoom = thereIsRoom & (board[i][col] == '-');
            break;

        case 1: // East
            if (col + (size - 1) >= cols)
                thereIsRoom = false;
            else
                for (int i = col; i <= col + (size - 1) && thereIsRoom; i++)
                    thereIsRoom = thereIsRoom & (board[row][i] == '-');
            break;

        case 2: // South
            if (row + (size - 1) >= rows)
                thereIsRoom = false;
            else
                for (int i = row; i <= row + (size - 1) && thereIsRoom; i++)
                    thereIsRoom  = thereIsRoom & (board[i][col] == '-');
            break;

        default: // West
            if (col - (size - 1) < 0) 
                thereIsRoom = false;
            else
                for (int i = col; i >= col - (size - 1) && thereIsRoom; i--) 
                    thereIsRoom = thereIsRoom & (board[row][i] == '-');
            break;
        }
        return thereIsRoom;
    }

    public void printBoard() {
        for (int i = 0; i < rows; i++)
            System.out.println(Arrays.toString(board[i]));
    }


    
 
    public static void main(String[] args) {
    Ship[] ships = new Ship[] {
            new Ship(1),
            new Ship(3),
            new Ship(2),
            new Ship(3)
    };
    BattleshipBoard battleshipBoard = new BattleshipBoard(7, 7);
    battleshipBoard.place(ships);
    battleshipBoard.printBoard();
}
    
    
    public String[][] makeStringListOfSpots() {
        String[][] listOfSpots = new String[10][10];
        String[] locationRow = { "A", "B", "C", "D", "E",
            "F", "G", "H", "I", "J" };
        String[] locationColumn = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10" };
        for (int row = 0; row < 10; row++)
        {
            for (int col = 0; col < 10; col++)
            {
                listOfSpots[row][col] = locationRow[row] + locationColumn[col];
            }
        }
        
        return listOfSpots;
    }
    
    public void displayListOfSpots() {
        Location listOfSpotsObject = new Location();
        String[][] listOfSpots = listOfSpotsObject.makeStringListOfSpots();
        
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                System.out.println(listOfSpots[i][j]);
            }
            System.out.println("\n");
        }
    }
    
    public String[] createListOccupiedSpots(int shipSpots) {
        String[] occupiedSpots = new String[shipSpots];
        for (int i = 0; i < shipSpots; i++)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter a location: ");
            occupiedSpots[i] = input.nextLine();
        }
        
        return occupiedSpots;
    }
    
    
    
    public void displayOccupiedSpots() {
        Location occupiedSpotsObject = new Location();
        String[] occupiedSpotsList = occupiedSpotsObject.createListOccupiedSpots(5);
        for (int i = 0; i < occupiedSpotsList.length; i++)
        {
            System.out.println(occupiedSpotsList[i]);
        }
    }

    /*This is a code that I was able to get from stackoverflow.  I made a few adjustments 
    but am not sure if it will do the job.  This code should help us to randomly place ships 
    on the computer side. Author - Adam Kelley*/ 
    public void placeAllShips() {
        int dir = 0;
        int xCoord = 0;
        int yCoord = 0;
        boolean flag;
        boolean overlap;
        for (int i=0; i<10; i++) {
            flag = true;
            overlap = false;
        while (flag) {
            xCoord = (int)(Math.random()*(10)); 
            yCoord = (int)(Math.random()*(10)); 
            dir = (int)(Math.random()*(2)); //get a random direction, 0 = horizontal, 1 = vertical
            if ((place[xCoord][yCoord].hasShip()==false)&&(((dir==0)&&((xCoord+i)<=9))||((dir==1)&&((yCoord+i)<=9)))) {
                for (int j=0; j<i+1; j++) {
                    if ((dir==0)&&(place[xCoord+j][yCoord].hasShip())) {
                        overlap = false;
                }
            else if ((dir==1)&&(place[xCoord][yCoord+j].hasShip())) {
              overlap = true;
            }
          }
          if (overlap==false) {
            flag = false;
          }
        }
      }
      System.out.println(xCoord+":"+yCoord+":"+dir);
      for (int k=0; k<i+1; k++) {
        if (dir==0) {
          placment[xCoord+k][yCoord].setHasShip(true);
        }
        else {
          placment[xCoord][yCoord+k].setHasShip(true);
        }
      }
    }
  }
}
