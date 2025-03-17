public class Main {
    public static void main(String[] args) {
        double raggio = Double.parseDouble(args[0]);
        System.out.println(calcolaVolume(raggio));
    }
    public static double calcolaVolume(double raggio){
        double volume = 4/3 * Math.PI * raggio;
        return volume;
    }
}