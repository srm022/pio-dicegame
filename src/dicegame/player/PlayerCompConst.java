/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dicegame.player;

/**
 *
 * @author olek
 */
public class PlayerCompConst extends Player {
    
    public PlayerCompConst() {}
    
    public PlayerCompConst(String name) {
        super(name);
    }
    
    
    @Override
    public int guess() {
        return 3;
    }
    
}
