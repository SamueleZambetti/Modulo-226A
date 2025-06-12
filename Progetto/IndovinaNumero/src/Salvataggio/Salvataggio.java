package Salvataggio;

import Giocatore.Giocatore;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe cje gestisce il salvataggio e la lettura dei punteggi
 */
public class Salvataggio {
    private Path path;

    /**
     * Costruttore che prende il percorso del file per salvare
     */
    public Salvataggio(Path path) {
        this.path = path;
    }

    /**
     * Salva i dati di un giocatore nel file
     */
    public void Scrivi(Giocatore g){
        List<String> lines = new ArrayList<>();
        lines.add(g.getNome() + ";" + g.getTentativi() + ";" + g.getData().toString());
        try {
            Files.write(path, lines, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Errore durante il salvataggio del punteggio.");
        }
    }

    /**
     * Legge tutti i punteggi salvati e li restituisce come stringa
     */
    public String Leggi(){
        ArrayList<Giocatore> list = new ArrayList<>();
        if (Files.exists(path)){
            try{
                List<String> lines = Files.readAllLines(path);
                for (String line : lines){
                    String[] split = line.split(";");
                    if (split.length == 3){
                        String nome = split[0];
                        int tentativi = Integer.parseInt(split[1]);
                        LocalDate data = LocalDate.parse(split[2]);
                        Giocatore g = new Giocatore(nome, tentativi);
                        g.setData(data);
                        list.add(g);
                    }
                }
            } catch (IOException e) {
                System.out.println("Errore nella lettura dei punteggi.");
            }
        }
        return list.toString();
    }
}
