package dicegame;

import java.util.HashMap;
import java.util.Map;

/**
 * Klasa odpowiadająca za prowadzenie statystyk.
 */
public class Stats {
    
    /**
     * Mapa służy do przechowywania par klucz-wartość.
     * 
     * W tym przypadku kluczem jest nazwa gracza (String),
     * a wartością liczba punktów (Integer).
     */
    private Map<String, Integer> stats = new HashMap<>();
    
    /**
     * Metoda wstawia do mapy wpis dla gracza o nazwie name.
     * 
     * @param name nazwa gracza
     */
    public void addPlayerName(String name) {
        stats.put(name, 0);
    }
    
    /**
     * Metoda zwiększająca punkty gracza o nazwie name.
     * 
     * @param name nazwa gracza
     */
    public void andTheWinnerIs(String name) {
        int score = stats.get(name);
        stats.put(name, score+1);
    }
    
    /**
     * Metoda kasująca punktację. 
     */
    public void reset() {
        for (Map.Entry<String, Integer> stat : stats.entrySet()) {
            stat.setValue(0);
        }
    }
    
    /**
     * Metoda wyświetlająca statystyki dla wszystkich graczy.
     */
    public void print() {
        System.out.println("***************************************************");
        
        for (Map.Entry<String, Integer> stat : stats.entrySet()) {
            System.out.println(stat.getKey() + ": " + stat.getValue());
        }
        
        System.out.println("***************************************************");
    }
    
}
