public class Potenza {
    public static void main(String[] args) {
        double n = Double.parseDouble(args[0]);
		double nElevato = Math.pow(n, 2);
        System.out.println("Numero elevato a 2: " + nElevato);
    }
}