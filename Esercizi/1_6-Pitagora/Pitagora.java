public class Pitagora{
	public static void main(String[] args){
		double c1 = Double.parseDouble(args[0]);
		double c2 = Double.parseDouble(args[1]);
		double c1d = Math.pow(c1, 2);
		double c2d = Math.pow(c2, 2);
		double ipotenusa = Math.sqrt(c1d + c2d);
		System.out.println("Ipotenusa: " + ipotenusa);
	}
}