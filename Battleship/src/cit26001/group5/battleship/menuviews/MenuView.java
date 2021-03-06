package cit26001.group5.battleship.menuviews;

import java.util.Scanner;
import cit26001.group5.battleship.interfaces.*;

/**
 *
 * @author Ethan Stewart
 */
public class MenuView implements DisplayInfo, EnterInfo {
    private String[][] menuItems = null;
    
    public MenuView() {
        
    }
    
    public MenuView(String[][] menuArray) {
        this.menuItems = menuArray;
    }
    
    public String[][] getMenuItems() {
        return menuItems;
    }
    
    public void setMenuItems(String[][] menuArray) {
        this.menuItems = menuArray;
    }
    
    @Override
    public String getInput() {
        String command;
        Scanner input = new Scanner(System.in);
        command = input.next();
        return command;
    }
    
    /**
     *
     */
    @Override
    public void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (String[] menuItem : menuItems) {
            System.out.println("\t   " + menuItem[0] + "\t" + menuItem[1]);
        }
        System.out.println("\t===============================================================\n");
    }   
}