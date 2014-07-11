package cit26001.group5.battleship.other;

import cit26001.group5.battleship.menuviews.MainMenuView;
import java.util.Scanner; /*Imports the Scanner utility to read input*/
import cit26001.group5.battleship.menuviews.MainMenuView;


public class Battleship {

    String name;
    String instructions = "The object of Battleship is to sink all of your \n"
            + "opponent's ships before they sink yours. You each get to \n"
            + "choose where to place three ships on your board. You then \n"
            + "take turns guessing locations on the board where you think \n"
            + "your opponent's ships are. If you guess a location which \n"
            + "contains part of a ship, it's a hit; otherwise, it's a miss.";

    public static void main(String[] args) {
        new MainMenuView().getInput();
    }

    public void displayHelp() {
        System.out.println("Welcome, " + this.name + "\n");
        System.out.println(this.instructions);
    }

}
