//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Prodotto prodotto = new Prodotto("Laptop", 101, 10, 799.99);
        System.out.println(prodotto);

        prodotto.aggiornaQuantita(5);
        System.out.println("Valore totale: " + prodotto.calcolaValoreTotale());

        prodotto.aggiornaQuantita(-20);
        System.out.println("Valore totale: " + prodotto.calcolaValoreTotale());
    }
}