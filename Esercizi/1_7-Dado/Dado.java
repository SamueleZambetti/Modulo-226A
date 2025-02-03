import java.util.Random;
public class Dado{
	public static void main(String[] args){
		Random rnd = new Random();
		int numero = rnd.nextInt(0,7);
		System.out.println("Numero: " + numero);
	}
}