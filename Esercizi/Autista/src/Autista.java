public class Autista {
    private String nome;
    private String cognome;
    private Veicolo veicolo;
    private Sede sede;
    public Autista(String nome, String cognome, Veicolo veicolo, Sede sede) {
        this.nome = nome;
        this.cognome = cognome;
        this.veicolo = veicolo;
        this.sede = sede;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Veicolo getVeicolo() {
        return veicolo;
    }

    public void setVeicolo(Veicolo veicolo) {
        this.veicolo = veicolo;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }
}
