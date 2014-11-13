package dicegame;

import dicegame.player.Player;
import java.util.Random;

/**
 * Klasa zawierająca logikę gry.
 * 
 */
public class Game {
    
    /**
     * Pole przechowuje obiekt gracza.
     */
    private Player player;
    
    /**
     * Metoda dodająca (ustawiająca) obiekt gracza.
     * 
     * @param player obiekt gracza
     */
    public void addPlayer(Player player) {
        this.player = player;
    }
    
    /**
     * Metoda zawierająca logikę sterującą grą.
     */
    public void start() {
        Random dice = new Random();     //obiekt losujący (kostka)
        int number,                     //wylosowana liczba
            guess;                      //propozycja (strzał) gracza
        
        do {
            number = dice.nextInt(6) + 1;
            System.out.println("Wylosowane (number): " + number);

            guess = player.guess();     //wywołujemy metodę guess() obiektu gracza (klasy PlayerComp lub PlayerHuman)

            System.out.println("Gracz " + player.getName() + ": " + guess); //wyświetlamy informację zawierającą imię gracza i jego propozycję
            
            if (number == guess) {
                System.out.println("BRAWO!");
            } else {
                System.out.println("PUDŁO!");
            }
            
            System.out.println("---------------------------------------------");
        
        } while (number != guess);    
    }
    
}
