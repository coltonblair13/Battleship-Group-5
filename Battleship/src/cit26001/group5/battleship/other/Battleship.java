package cit26001.group5.battleship.other;

import cit26001.group5.battleship.frames.*;
import cit26001.group5.battleship.menuviews.MainMenuView;
import cit26001.group5.battleship.menuviews.MainMenuView;
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
        Battleship battleship = null;
        try {
            battleship = new Battleship();
            
            java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Battleship.mainFrame = new MainFrame();
                
                Battleship.mainFrame.setVisible(true);
            }
        });
        }
        
        catch (Throwable exc) {
            ErrorType.displayErrorMsg("Unexpected error: " + exc.getMessage());
            ErrorType.displayErrorMsg(Arrays.toString(exc.getStackTrace()));
        }
        finally {
            if (Battleship.mainFrame != null)
                Battleship.mainFrame.dispose();
        }
    }

    public void displayHelp() {
        System.out.println("Welcome, " + this.name + "\n");
        System.out.println(this.instructions);
    }

}
