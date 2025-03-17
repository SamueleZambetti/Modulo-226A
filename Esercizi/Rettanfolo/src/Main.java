//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rettangolo r1 = new Rettangolo(10, 6);
        Rettangolo r2 = new Rettangolo(7, 5);
        Rettangolo r3 = new Rettangolo(4, 4);

        System.out.println("Rettangolo 1: " + r1 + ", Area: " + r1.getArea() + ", Perimetro: " + r1.getPerimetro() + ", Diagonale: " + r1.getDiagonale());
        System.out.println("Rettangolo 2: " + r2 + ", Area: " + r2.getArea() + ", Perimetro: " + r2.getPerimetro() + ", Diagonale: " + r2.getDiagonale());
        System.out.println("Rettangolo 3: " + r3 + ", Area: " + r3.getArea() + ", Perimetro: " + r3.getPerimetro() + ", Diagonale: " + r3.getDiagonale());
    }
}