package dicegame;

import dicegame.player.Player;
import dicegame.player.PlayerComp;

/**
 * Gra w odgadywanie wylosowanej liczby.
 * 
 * Zasady:
 * - komputer rzuca kostką (losuje liczby z zakresu 1..6)
 * - gracz (komputer lub człowiek) stara się odgadnąć liczbę
 * - jeżeli odgadnie, gra się kończy
 * - jeżeli nie odgadnie, rozpoczyna się kolejna runda (komputer losuje kolejną liczbę i gracz stara się ją odgadnąć)
 */
public class DiceGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //tworzymy obiekt gry
        Game game = new Game();
        
        //tworzymy obiekt gracza        
        Player player = new PlayerComp("Waldek");

        //dodajemy gracza do gry
        game.addPlayer(player);
        
        //uruchamiamy grę
        game.start();

    }
    
}
