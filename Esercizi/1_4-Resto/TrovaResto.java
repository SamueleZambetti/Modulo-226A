public class TrovaResto{
	public static void main(String[] args){
		int numero1 = Integer.parseInt(args[0]);
		int numero2 = Integer.parseInt(args[1]);
		int resto = (int)(numero1 % numero2);
		System.out.print(resto);
	}
}