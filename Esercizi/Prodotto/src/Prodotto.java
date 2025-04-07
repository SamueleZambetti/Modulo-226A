/**
 * La classe Prodotto rappresenta un prodotto con nome, codice, quantità in magazzino e prezzo.
 * Fornisce metodi per gestire e aggiornare le informazioni del prodotto.
 */
public class Prodotto {

    /**
     * Nome del prodotto.
     */
    private String nome;

    /**
     * Codice identificativo del prodotto.
     */
    private int codice;

    /**
     * Quantità del prodotto disponibile in magazzino.
     */
    private int quantitaMagazzino;

    /**
     * Prezzo unitario del prodotto.
     */
    private double prezzo;

    /**
     * Costruttore della classe Prodotto.
     *
     * @param nome Nome del prodotto
     * @param codice Codice identificativo del prodotto
     * @param quantitaMagazzino Quantità iniziale disponibile in magazzino
     * @param prezzo Prezzo unitario del prodotto
     */
    public Prodotto(String nome, int codice, int quantitaMagazzino, double prezzo) {
        this.nome = nome;
        this.codice = codice;
        this.quantitaMagazzino = quantitaMagazzino;
        this.prezzo = prezzo;
    }

    /**
     * Restituisce il nome del prodotto.
     *
     * @return Nome del prodotto
     */
    public String getNome() {
        return nome;
    }

    /**
     * Imposta il nome del prodotto.
     *
     * @param nome Nuovo nome del prodotto
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Restituisce il codice identificativo del prodotto.
     *
     * @return Codice del prodotto
     */
    public int getCodice() {
        return codice;
    }

    /**
     * Imposta il codice identificativo del prodotto.
     *
     * @param codice Nuovo codice del prodotto
     */
    public void setCodice(int codice) {
        this.codice = codice;
    }

    /**
     * Restituisce la quantità del prodotto disponibile in magazzino.
     *
     * @return Quantità disponibile in magazzino
     */
    public int getQuantitaMagazzino() {
        return quantitaMagazzino;
    }

    /**
     * Imposta la quantità del prodotto disponibile in magazzino.
     *
     * @param quantitaMagazzino Nuova quantità in magazzino
     */
    public void setQuantitaMagazzino(int quantitaMagazzino) {
        this.quantitaMagazzino = quantitaMagazzino;
    }

    /**
     * Restituisce il prezzo unitario del prodotto.
     *
     * @return Prezzo unitario del prodotto
     */
    public double getPrezzo() {
        return prezzo;
    }

    /**
     * Imposta il prezzo unitario del prodotto.
     *
     * @param prezzo Nuovo prezzo unitario del prodotto
     */
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    /**
     * Aggiorna la quantità disponibile in magazzino sommando il valore specificato.
     * Se l'aggiornamento porta la quantità a un valore negativo, mostra un messaggio di errore.
     *
     * @param QtM Quantità da aggiungere (o sottrarre, se negativa) alla quantità in magazzino
     */
    public void aggiornaQuantita(int QtM) {
        if (this.quantitaMagazzino + QtM < 0) {
            System.out.println("Errore: La quantità in magazzino non può essere negativa.");
        } else {
            this.quantitaMagazzino += QtM;
            System.out.println("Quantità aggiornata. Nuova quantità: " + this.quantitaMagazzino);
        }
    }

    /**
     * Calcola il valore totale del prodotto in magazzino (quantità × prezzo unitario).
     *
     * @return Valore totale del prodotto in magazzino
     */
    public double calcolaValoreTotale() {
        return quantitaMagazzino * prezzo;
    }

    /**
     * Restituisce una rappresentazione testuale del prodotto.
     *
     * @return Stringa contenente le informazioni del prodotto
     */
    @Override
    public String toString() {
        return "Prodotto:" + nome + "; Codice:" + codice + "; QtM:" + quantitaMagazzino + "; Prezzo:" + prezzo;
    }
}
