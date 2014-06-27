/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package battleship;

import java.util.Scanner;

/**
 *
 * @author Ethan Stewart
 */
public abstract class Menu {
    private String[][] menuItems = null;
    
    public Menu() {
        
    }
    
    public Menu(String[][] menuItems) {
        this.menuItems = menuItems;
    }
    
    public String[][] getMenuItems() {
        return menuItems;
    }
    
    public void setMenuItems(String[][] menuArray) {
        this.menuItems = menuArray;
    }
    
    public String getCommand() {
        String command;
        Scanner input = new Scanner(System.in);
        command = input.next();
        return command;
    }
    
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }   
}
