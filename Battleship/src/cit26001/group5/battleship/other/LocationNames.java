package cit26001.group5.battleship.other;

/**
 *
 * @author Ethan Stewart
 */
enum LocationNames {
    A1(0, 0), A2(0, 1), A3(0, 2), A4(0, 3), A5(0, 4), 
    B1(1, 0), B2(1, 1), B3(1, 2), B4(1, 3), B5(1, 4), 
    C1(2, 0), C2(2, 1), C3(2, 2), C4(2, 3), C5(2, 4), 
    D1(3, 0), D2(3, 1), D3(3, 2), D4(3, 3), D5(3, 4), 
    E1(4, 0), E2(4, 1), E3(4, 2), E4(4, 3), E5(4, 4);
    
    private int xNum;
    private int yNum;
    
    LocationNames(int x, int y) {
        xNum = x;
        yNum = y;
    }
    
    int getX() { return xNum; }
    int getY() { return yNum; }
}
