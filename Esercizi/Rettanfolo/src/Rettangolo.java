/**
 *Classe modella rettangolo
 *
 * @author Samuele Zambetti
 * @version 10 Marzo 2025
 */

public class Rettangolo {
    private int latoMaggiore;
    private int latoMinore;

    public Rettangolo(int latoMaggiore, int latoMinore) {
        if (latoMaggiore > latoMinore && latoMaggiore > 0 && latoMinore > 0) {
            this.latoMaggiore = latoMaggiore;
            this.latoMinore = latoMinore;
        } else {
            this.latoMaggiore = 7;
            this.latoMinore = 5;
            System.out.println("Valori non validi,default (7x5)" );
        }
    }

    public Rettangolo() {
        this.latoMaggiore = 7;
        this.latoMinore = 5;
    }

    public int getLatoMaggiore() {
        return latoMaggiore;
    }

    public int getLatoMinore() {
        return latoMinore;
    }

    /**
     * Calcola l'area del rettangolo
     * @return il risultato della moltiplicazione tra latoMaggiore e latoMinore
     */
    public int getArea() {
        return latoMaggiore * latoMinore;
    }

    /**
     * Calcola il perimetro del rettangolo
     * @return il risultato della somma di latoMaggiore e latoMinore moltipliocato a 2
     */
    public int getPerimetro() {
        return 2 * (latoMaggiore + latoMinore);
    }

    /**
     * Calcola la diagonale del rettangolo
     * @return il risultato della radice quadrata di latoMaggiore^2 + latoMinore^2
     */
    public double getDiagonale() {
        return Math.sqrt((latoMaggiore * latoMaggiore) + (latoMinore * latoMinore));
    }

    @Override
    public String toString() {
        return latoMaggiore + "x" + latoMinore;
    }
}
