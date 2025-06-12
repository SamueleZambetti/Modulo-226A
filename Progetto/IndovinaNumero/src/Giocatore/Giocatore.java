package Giocatore;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Classe che rappresenta un giocatore con nome, tentativi e data
 */
public class Giocatore {
    private String nome;
    private int tentativi;
    private LocalDate data;

    /**
     * Crea un nuovo Giocatore
     * @param nome Nome del giocatore
     * @param tentativi Numero di tentativi
     */
    public Giocatore(String nome, int tentativi) {
        this.nome = nome;
        this.tentativi = tentativi;
        this.data = LocalDate.now();
    }

    public Giocatore(String nome, int tentativi, LocalDate data) {
        this.nome = nome;
        this.tentativi = tentativi;
        this.data = data;
    }

    /**
     * Restituisce il nome del giocatore
     * @return Nome del giocatore
     */
    public String getNome() {
        return nome;
    }

    /**
     * Restituisce il numero di tentativi
     * @return Numero di tentativi
     */
    public int getTentativi() {
        return tentativi;
    }

    /**
     * Restituisce la data del risultato
     * @return Data
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * Imposta una nuova data
     * @param data Data da impostare
     */
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return nome + " - " + tentativi + " tentativi - " + data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Giocatore giocatore = (Giocatore) o;
        return tentativi == giocatore.tentativi &&
                Objects.equals(nome, giocatore.nome) &&
                Objects.equals(data, giocatore.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, tentativi, data);
    }
}
