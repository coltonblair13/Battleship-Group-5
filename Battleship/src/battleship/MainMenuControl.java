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
    public void startGame(long noPlayers) {
        /*
        This function will contain code that will allow the user to start
        a new game.
        */        
        /*if (noPlayers != 1  &&  noPlayers != 2) {
            System.out.println("startGame - invalid number of players specified.");
            return;
        }
        
        Game game;
        if (noPlayers == 1) {
            game = this.create("ONE_PLAYER");
        }
        else {
            game = this.create("TWO_PLAYER");
        }

        /*GameMenuView gameMenu = new GameMenuView(game);
        gameMenu.getInput();*/
        System.out.println("The startGame function works.");
    }

    
    
    public Game create(String gameType) {
        /*
        The code currently in this function is just a placeholder
        so I could get rid of the little red exclamation point.
        */
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
