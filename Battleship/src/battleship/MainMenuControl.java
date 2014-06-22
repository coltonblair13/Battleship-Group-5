/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import java.io.Serializable;

/**
 *
 * @author Ethan Stewart
 */


public class MainMenuControl implements Serializable {

    public void startGame(long noPlayers) {
        /*
         This function will contain code that will allow the user to start
         a new game.
         */
        if (noPlayers != 1 && noPlayers != 2) {
            System.out.println("startGame - invalid number of players specified.");
            return;
        }

        Game game;
        if (noPlayers == 1) {
            System.out.println("One player game still under construction. Please "
                    + "choose a different option.");
        } else {
            game = this.create("TWO_PLAYER");
        }
    }

    public Game create(String gameType) {

        if ("TWO_PLAYER".equals(gameType)) {
            Player player1 = new Player();
            Player player2 = new Player();
            GameChoicesView gameChoicesViewObject = new GameChoicesView();
            Board boardObject = new Board();
            int currentPlayer;

            /*
             String[][] playerOnePersonalBoard = player1.setPlayerShips(player1);
             String[][] playerTwoPersonalBoard = player2.setPlayerShips(player2);
             String[][] playerOneHitMissBoard = boardObject.createHitMissBoard();
             String[][] playerTwoHitMissBoard = boardObject.createHitMissBoard();*/
            Player playerToPass;
            for (int i = 0; i < 12; i++) {
                if (gameChoicesViewObject.playerNumber == 1) {
                    playerToPass = player1;
                } else {
                    playerToPass = player2;
                }
                String command = gameChoicesViewObject.getInput(playerToPass);
                if ("Q".equals(command)) {
                    break;
                }
            }
        }

        Game placeholder = new Game();

        return placeholder;
    }

    public void displayHelpMenu() {
        /*
         This function allows the user to access the Help menu.
         */
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.getInput();
    }
}
