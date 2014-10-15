package dicegame;

import java.util.Random;

/**
 * Trzecia wersja gry w odgadywanie wylosowanej liczby.
 * 
 * Zmiany:
 * - logika odpowiadająca za zachowanie gracza komputerowego została przeniesiona do klasy PlayerComp
 * - w klasie PlayerHuman znalazł się kod odpowiedzialny za zachowania gracza-człowieka
 * - abstrakcyjna klasa Player zawiera abstrakcyjną metodę guess(), zapewniając w ten sposób wspólny interfejs obu typów graczy
 * 
 * Zasady:
 * - komputer rzuca kostką (losuje liczby z zakresu 1..6)
 * - gracz (też komputer) stara się odgadnąć liczbę (też losuje)
 * - jeżeli odgadnie, gra się kończy
 * - jeżeli nie odgadnie, rozpoczyna się kolejna runda (komputer losuje kolejną liczbę i gracz stara się ją odgadnąć)
 */
public class DiceGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Obiekt gracza trzymamy w zmiennej obiektowej typu Player.
           Dzięki temu, że zastosowaliśmy dziedziczenie, możemy przypisać tej
           zmiennej obiekt klasy PlayerComp lub PlayerHuman. Obiekty obu klas
           mają metodę guess(), a to jest dla poniższego kodu najważniejsze.
        */
        
//        Player player = new PlayerComp();    //obiekt komputerowego gracza
        Player player = new PlayerHuman();   //obiekt gracza-człowieka
        
        Random dice = new Random();     //obiekt losujący (kostka)
        int number,                     //wylosowana liczba
            guess;                      //propozycja (strzał) gracza
        
        do {
            number = dice.nextInt(6) + 1;
            System.out.println("Wylosowane (number): " + number);

            guess = player.guess();     //wywołujemy metodę guess() obiektu gracza (klasy PlayerComp lub PlayerHuman)

            if (number == guess) {
                System.out.println("BRAWO!");
            } else {
                System.out.println("PUDŁO!");
            }
            
            System.out.println("---------------------------------------------");
        
        } while (number != guess);
    }
    
}