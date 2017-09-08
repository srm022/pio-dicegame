package dicegame;

import java.util.Random;

/**
 * Klasa Player reprezentuje gracza odgadującego wylosowaną liczbę.
 * 
 */
public class Player {
    //"odgadywacz"
    private Random guesser = new Random();
    
    //metoda odgadująca liczbę
    public int guess() {
        return guesser.nextInt(6) + 1;
    } 
}
