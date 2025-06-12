package Gioco;

import java.util.Random;

/**
 * Classe che gestisce la logica
 */
public class Gioco {
    private Random random = new Random();

    /**
     * Genera un numero casuale tra min e max
     */
    public int generaNumero(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    /**
     * Controlla se il tentativo è troppo basso
     */
    public boolean isTooLow(int guess, int secret) {
        return guess < secret;
    }

    /**
     * Controlla se il tentativo è troppo alto
     */
    public boolean isTooHigh(int guess, int secret) {
        return guess > secret;
    }
}
