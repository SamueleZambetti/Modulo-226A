import java.util.Scanner;

public class Coordinator {
       private char[][] griglia = new char[5][5];
       private Scanner scanner = new Scanner(System.in);

       public Coordinator() {
              for (int i = 0; i < 5; i++) {
                     for (int j = 0; j < 5; j++) {
                            griglia[i][j] = ' ';
                     }
              }
       }

       private int leggiCoordinata(String messaggio) {
              while (true) {
                     System.out.print(messaggio);
                     if (scanner.hasNextInt()) {
                            int valore = scanner.nextInt();
                            if (valore >= 0 && valore <= 4) {
                                   return valore;
                            } else {
                                   System.out.println(valore < 0 ? "Valore troppo piccolo " + valore : "Valore troppo grande " + valore);
                            }
                     } else {
                            System.out.println("Inserire solo numeri interi");
                            scanner.close();
                     }
              }
       }

       public void start() {
              int riga = leggiCoordinata("Inserire coordinata riga [0;4]: ");
              int colonna = leggiCoordinata("Inserire coordinata colonna [0;4]: ");

              griglia[riga][colonna] = 'X';

              System.out.println(" 01234");
              for (int i = 0; i < 5; i++) {
                     System.out.print(i);
                     for (int j = 0; j < 5; j++) {
                            System.out.print(griglia[i][j]);
                     }
                     System.out.println();
              }
       }
}