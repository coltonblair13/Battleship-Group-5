/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit26001.group5.battleship.menucontrol;

import cit26001.group5.battleship.game.Game;
import cit26001.group5.battleship.customExceptions.GameException;
import java.util.Scanner;

/**
 *
 * @author Adam
 */
public class GameMenuControl {

    public GameMenuControl() {

    }

    public GameMenuControl(Game game) throws GameException {
        throw new GameException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void displayGameSetup() {
        this.displayMenuBorder();
        System.out.println("\tPlace the location of your ships.\n");
        this.displayMenuBorder();

    }

    public void displayGameControl() {
        this.displayMenuBorder();
        System.out.println("\tEnter Coordinates:");
        this.displayMenuBorder();

    }

    public void displayBack() {
        this.displayMenuBorder();
        System.out.println("\tAre you sure you want to leave the battle?\n");
        System.out.println("\tYes\n");
        System.out.println("\tNo\n");
        this.displayMenuBorder();
    }

    public void displayMenuBorder() {
        System.out.println("\t===============================================================\n");
    }

    public void takeTurn() throws GameException {
        throw new GameException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void displayBoard()throws GameException {
        throw new GameException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void startNewGame()throws GameException {
        throw new GameException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void displayStatistics()throws GameException {
        throw new GameException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void displayPreferencesMenu()throws GameException {
        throw new GameException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void displayHelpMenu()throws GameException {
        throw new GameException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String[] sortPlayerList(String[] playerList) {
        int j;
        String temp;
        int i;
        
        for(j = 1; j < playerList.length; j++)
        {
            temp = playerList[j];
            for(i = j - 1; i >=0 && playerList[i].compareToIgnoreCase(temp) < 0; i--)
                playerList[i + 1] = playerList[i];
            playerList[i + 1] = temp;
        }
        return playerList;
    }
    
    public void displayPlayerList(String[] playerList) {
        for(int i = 0; i < playerList.length; i++)
        {
            System.out.println(playerList[i]);
        }
    }

}
