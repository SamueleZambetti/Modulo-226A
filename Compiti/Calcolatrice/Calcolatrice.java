public class Calcolatrice {
    public static void main(String[] args) {
	  double num1 = Double.parseDouble(args[0]);
	  double num2 = Double.parseDouble(args[1]);
	  String operatore = args[2];	  
	  double risultato = 0;
        if (operatore.equals("+")) {
            risultato = num1 + num2;
        }
		else if (operatore.equals("-")) {
            risultato = num1 - num2;
        } 
		else if (operatore.equals("x")) {
            risultato = num1 * num2;
        } 
		else if (operatore.equals("/")){
			risultato = num1 / num2;
		}
		System.out.println(num1 + " " + operatore + " " + num2 + " = " + risultato);
	}
}
