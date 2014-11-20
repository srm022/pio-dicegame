package dicegame;

import dicegame.player.PlayerComp;

/**
 * Gra w odgadywanie wylosowanej liczby.
 * 
 * Zasady:
 * - komputer rzuca kostką (losuje liczby z zakresu 1..6)
 * - gracze (komputer lub człowiek) starają się odgadnąć liczbę
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
        
        //do gry dodajemy pierwszego gracza
        game.addPlayer(new PlayerComp("Waldek"));
        
        //do gry dodajemy drugiego gracza o tym samym imieniu
        game.addPlayer(new PlayerComp("Marian"));
        
        
        //uruchamiamy serię gier
        for (int i=0; i<3; ++i) {
            game.start();
        }
        //wyświetlamy statystyki
        game.stats().print();

        //kasujemy punktację
        game.stats().reset();
        
        //uruchamiamy grę i wyświetlamy statystyki
        game.start();
        game.stats().print();

    }
    
}
