package dicegame;

import java.util.Random;

/**
 * Klasa reprezentuje komputerowego gracza odgadującego wylosowaną liczbę.
 * 
 * Klasa rozszerza abstrakcyjną klasę Player
 * 
 */
public class PlayerComp extends Player {
    
    //"odgadywacz"
    private Random guesser = new Random();
    
    /**
     * Metoda odgadująca liczbę.
     * 
     * @return odgadnięta (wylosowana) liczba
     */ 
    @Override
    public int guess() {
        int guess = guesser.nextInt(6) + 1;
        System.out.println("Strzał (guess): " + guess);
        return guess;
    } 
}
