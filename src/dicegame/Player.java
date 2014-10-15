package dicegame;

/**
 * Abstrakcyjna klasa bazowa dla klas graczy.
 * 
 * Definiuje abstrakcyjną metodę guess().
 */

public abstract class Player {

    /**
     * Metoda zwraca odgadniętą liczbę (strzał).
     * 
     * @return odgadnięta liczba 
     */
    public abstract int guess();
    
}
