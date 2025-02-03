public class NotaModulo {
  public static void main(String[] args) {
	  double n1 = Double.parseDouble(args[0]);
	  double n2 = Double.parseDouble(args[1]);
	  double n3 = Double.parseDouble(args[2]);
	  double n4 = Double.parseDouble(args[3]);
	  
	  double nfinale = (n1*0.1+n2*0.3+n3*0.3+n4*0.3);
	  System.out.print("Media modulo:" + nfinale);
  }
}
