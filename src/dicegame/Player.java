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
        int guess = guesser.nextInt(6) + 1;
        System.out.println("Strzał (guess): " + guess);
        return guess;
    } 
}
