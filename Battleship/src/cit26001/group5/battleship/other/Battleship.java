package cit26001.group5.battleship.other;

import cit26001.group5.battleship.frames.*;
import cit26001.group5.battleship.menuviews.MainMenuView;
import cit26001.group5.battleship.menuviews.MainMenuView;
import cit26001.group5.battleship.menucontrol.MainMenuControl;
import java.util.Arrays;
import java.util.Scanner;
import javax.lang.model.type.ErrorType;


public class Battleship {

    String name;
    String instructions = "The object of Battleship is to sink all of your \n"
            + "opponent's ships before they sink yours. You each get to \n"
            + "choose where to place three ships on your board. You then \n"
            + "take turns guessing locations on the board where you think \n"
            + "your opponent's ships are. If you guess a location which \n"
            + "contains part of a ship, it's a hit; otherwise, it's a miss.";

    public static void main(String[] args) {
        /*Battleship battleship = null;
        final MainFrame mainFrame = new MainFrame();
        try {
            battleship = new Battleship();
            
            java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                mainFrame.setVisible(true);
            }
        });
        }

        finally {
            if (mainFrame != null)
                mainFrame.dispose();
        }*/
        
        MainMenuControl mmcObj = new MainMenuControl();
        mmcObj.startGame(2);
    }

    public void displayHelp() {
        System.out.println("Welcome, " + this.name + "\n");
        System.out.println(this.instructions);
    }

}
