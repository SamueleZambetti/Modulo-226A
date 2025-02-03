public class Codice{
	public static void main(String[] args) {
		String parola = args[0];
		int l = parola.length();		
		String p1 = parola.substring(0, 1);
		String p2 = parola.substring(2, 3);
		String p3 = parola.substring(l-1,l);
		String p4 = parola.substring(l-2, l-1);
		System.out.print(p1+p2+p3+p4);
    }
}