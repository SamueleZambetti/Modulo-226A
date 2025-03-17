//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Star star = new Star("Sole (G2V - nana gialla)", 1.0, 1.989E30, 1.41E18, 4.6E9);
        Star star1 = new Star("Betelgeuse (M1-2 Ia - supergigante rossa)", 100000.0, 2.0E31, 1.0E27, 1.0E7);
        Star star2 = new Star("Sirius A (A1V - stella bianca di sequenza principale)", 25.0, 3.978E30, 3.1E18, 2.5E8);
        System.out.println(star.toString());
        System.out.println();
        System.out.println(star1.toString());
        System.out.println();
        System.out.println(star2.toString());
    }
}