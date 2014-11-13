package dicegame;

import dicegame.player.Player;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Klasa zawierająca logikę gry.
 * 
 */
public class Game {
    
    /**
     * Pole przechowuje listę obiektów graczy.
     */
    private List<Player> players = new ArrayList<>();
    
    /**
     * Metoda dodająca obiekt gracza do listy.
     * 
     * @param player obiekt gracza
     */
    public void addPlayer(Player player) {
        players.add(player);
    }
    
    /**
     * Metoda zawierająca logikę sterującą grą.
     */
    public void start() {
        Random dice = new Random();     //obiekt losujący (kostka)
        int number,                     //wylosowana liczba
            guess;                      //propozycja (strzał) gracza
        
        boolean repeat;                 //czy powtórzyć pętlę do-while
        
        do {
            repeat = true;  //zakładamy, że trzeba będzie powtórzyć grę
            
            number = dice.nextInt(6) + 1;
            System.out.println("Wylosowane (number): " + number);

            for (Player player : players) {
                guess = player.guess();     //wywołujemy metodę guess() obiektu gracza (klasy PlayerComp lub PlayerHuman)

                System.out.println("Gracz " + player.getName() + ": " + guess); //wyświetlamy informację zawierającą imię gracza i jego propozycję

                if (number == guess) {
                    System.out.println("BRAWO!");
                    repeat = false;         //kończymy grę
                } else {
                    System.out.println("PUDŁO!");
                }
            }
                
            System.out.println("---------------------------------------------");
        
        } while (repeat);    
    }
    
}
