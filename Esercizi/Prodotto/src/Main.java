import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il nome del prodotto:");
        String nome = scanner.nextLine();

        System.out.println("Inserisci il codice del prodotto:");
        int codice = scanner.nextInt();

        System.out.println("Inserisci la quantità in magazzino:");
        int quantitaMagazzino = scanner.nextInt();

        System.out.println("Inserisci il prezzo del prodotto:");
        double prezzo = scanner.nextDouble();

        Prodotto prodotto = new Prodotto(nome, codice, quantitaMagazzino, prezzo);
        System.out.println(prodotto);

        System.out.println("Inserisci la quantità da aggiungere o rimuovere:");
        int qtDaAggiornare = scanner.nextInt();

        prodotto.aggiornaQuantita(qtDaAggiornare);
        System.out.println("Valore totale: " + prodotto.calcolaValoreTotale());

        scanner.close();
    }
}
