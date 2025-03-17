public class Prodotto {
    private String nome;
    private int codice;
    private int quantitaMagazzino;
    private double prezzo;

    public Prodotto(String nome, int codice, int quantitaMagazzino, double prezzo) {
        this.nome = nome;
        this.codice = codice;
        this.quantitaMagazzino = quantitaMagazzino;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public int getQuantitaMagazzino() {
        return quantitaMagazzino;
    }

    public void setQuantitaMagazzino(int quantitaMagazzino) {
        this.quantitaMagazzino = quantitaMagazzino;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void aggiornaQuantita(int quantitaMagazzino) {
        if (quantitaMagazzino + quantitaMagazzino < 0) {
            System.out.println("Errore: La quantità in magazzino non può essere negativa.");
        } else {
            quantitaMagazzino += quantitaMagazzino;
            System.out.println("Quantità aggiornata. Nuova quantità: " + quantitaMagazzino);
        }
    }

    public double calcolaValoreTotale() {
        return quantitaMagazzino * prezzo;
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "nome='" + nome + '\'' +
                ", codice=" + codice +
                ", quantitaMagazzino=" + quantitaMagazzino +
                ", prezzo=" + prezzo +
                '}';
    }
}
