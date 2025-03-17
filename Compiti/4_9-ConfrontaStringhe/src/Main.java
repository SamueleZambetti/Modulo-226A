import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.print("Stampa di args = ");
        for (String arg : args) {
            System.out.print(arg + " ");
        }
        System.out.println();
        Arrays.sort(args);
        System.out.println("Array:");
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
