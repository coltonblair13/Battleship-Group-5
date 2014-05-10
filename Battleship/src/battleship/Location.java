/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package battleship;

/**
 *
 * @author colto_000/Colton Blair
 */
public class Location {
    int row;
    int column;
    Player player;
    
    
    public Location() {
        
    }
    
    public void occupyLocation(Player player) {
        this.player = player;
    }
    
    public void pegMarker() {
        if (this.player != null) {
            System.out.println(this.player.marker);
        }
        else {
            System.out.println(" ");
        }
    }

    private static class Player {
        private boolean marker;

        public Player() {
        }
    }
            
       
    
}