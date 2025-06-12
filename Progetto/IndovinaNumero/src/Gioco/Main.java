package Gioco;

import Giocatore.Giocatore;
import Salvataggio.Salvataggio;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/**
 * Classe principale che avvia il gioco "Indovina il numero".
 * Gestisce il menu con diverse opzioni:
 * 1. L'utente indovint il numero del PC
 * 2. Il PC indovina il numero pensato dall'utente
 * 3. Visualizza i punteggi salvati
 * 4. Esci dal programma
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gioco gioco = new Gioco();
        Path path = Paths.get("D:\\CPT\\I2aa\\Professionale\\226A\\GitHub\\Modulo-226A\\Progetto\\IndovinaNumero\\src\\salvataggio.txt");
        Salvataggio salvataggi = new Salvataggio(path);

        while (true) {
            System.out.println("\n=== INDOVINA IL NUMERO ===");
            System.out.println("1. Tu indovint il numero del PC");
            System.out.println("2. Il PC indovina il numero che hai pensato");
            System.out.println("3. Mostra punteggi salvati");
            System.out.println("4. Esci");
            System.out.print("Scegli un'opzione: ");

            String scelta = scanner.nextLine();
            switch (scelta) {
                case "1":
                    System.out.print("Inserisci il tuo nome: ");
                    String nome = scanner.nextLine();

                    int numeroSegreto = gioco.generaNumero(1, 100);
                    System.out.println("Ho scelto un numero tra 1 e 100. Prova a indovinare!");
                    int tentativi = 0;
                    int guess;
                    do {
                        System.out.print("Tuo tentativo: ");
                        String line = scanner.nextLine();
                        try {
                            guess = Integer.parseInt(line);
                            tentativi++;
                            if (gioco.isTooLow(guess, numeroSegreto)) {
                                System.out.println("Troppo basso!");
                            } else if (gioco.isTooHigh(guess, numeroSegreto)) {
                                System.out.println("Troppo alto!");
                            } else {
                                System.out.println("Hai indovinato in " + tentativi + " tentativi!");
                                Giocatore g = new Giocatore(nome, tentativi);
                                salvataggi.Scrivi(g);
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Inserisci un numero valido!");
                            guess = -1;
                        }
                    } while (guess != numeroSegreto);
                    break;

                case "3":
                    String tutti = salvataggi.Leggi();
                    if (tutti.isEmpty()) {
                        System.out.println("Nessun punteggio salvato.");
                    } else {
                        System.out.println("\n=== PUNTEGGI SALVATI ===");
                        System.out.println(tutti);
                    }
                    break;

                case "4":
                    System.out.println("Ciao!");
                    scanner.close();
                    return;

                case "2":
                    System.out.print("Inserisci il tuo nome: ");
                    String nomeUtente = scanner.nextLine();
                    System.out.print("Pensa a un numero tra 1 e 100");
                    scanner.nextLine();

                    int min = 1;
                    int max = 100;
                    int tentativiPC = 0;
                    int guessPC;

                    while (true) {
                        guessPC = gioco.generaNumero(min, max);
                        tentativiPC++;
                        System.out.println("Il PC prova: " + guessPC);
                        System.out.print("Il numero è (1) troppo basso, (2) troppo alto, (3) corretto");
                        String risposta = scanner.nextLine();

                        if (risposta.equals("1")) {
                            if (gioco.isTooLow(guessPC, max)) {
                                min = guessPC + 1;
                            }
                        } else if (risposta.equals("2")) {
                            if (gioco.isTooHigh(guessPC, min)) {
                                max = guessPC - 1;
                            }
                        } else if (risposta.equals("3")) {
                            System.out.println("Il PC ha indovinato il tuo numero in " + tentativiPC + " tentativi!");
                            Giocatore gPC = new Giocatore("PC contro " + nomeUtente, tentativiPC);
                            salvataggi.Scrivi(gPC);
                            break;
                        } else {
                            System.out.println("Risposta non valida. Inserisci 1, 2 o 3.");
                            tentativiPC--;
                        }

                        if (min > max) {
                            System.out.println("Hai dato indicazioni sbagliate");
                            break;
                        }
                    }
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        }
    }
}
