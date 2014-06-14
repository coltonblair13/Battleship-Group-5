/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

/**
 *
 * @author Ethan Stewart
 */
public class MainMenuControl {

    Player playerObject = new Player();
    String player1 = playerObject.name1;
    String player2 = playerObject.name2;

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
        /*
         The code currently in this function is just a placeholder
         so I could get rid of the little red exclamation point.
         */
        if ("TWO_PLAYER".equals(gameType)) {
            GameChoicesView gameChoicesViewObject = new GameChoicesView();
            Board boardObject = new Board();
            int currentPlayer;

            /*String[][] playerOnePersonalBoard = playerObject.setPlayerOneShips(player1);
             String[][] playerTwoPersonalBoard = playerObject.setPlayerTwoShips(player2);
             String[][] playerOneHitMissBoard = boardObject.createHitMissBoard();
             String[][] playerTwoHitMissBoard = boardObject.createHitMissBoard();*/
            String[][] playerOnePersonalBoard = playerObject.setPlayerOneShips(player1);
            String[][] playerTwoPersonalBoard = playerObject.setPlayerTwoShips(player2);
            String[][] playerOneHitMissBoard = boardObject.createHitMissBoard();
            String[][] playerTwoHitMissBoard = boardObject.createHitMissBoard();
            for (int i = 0; i < 12; i++) {
                if (gameChoicesViewObject.playerNumber == 1) {
                    currentPlayer = 1;
                } else {
                    currentPlayer = 2;
                }
                String command = gameChoicesViewObject.getInput(playerOnePersonalBoard, playerOneHitMissBoard,
                        playerTwoPersonalBoard, playerTwoHitMissBoard, currentPlayer);
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
