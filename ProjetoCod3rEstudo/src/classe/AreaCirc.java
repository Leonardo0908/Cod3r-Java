package classe;

public class AreaCirc {

	double raio;
	final static double pi = 3.1415;
	
	 AreaCirc(double raioInicial) {
		//pi = 3.14;
		raio = raioInicial;
	}
	 
	 double area() {
		 return pi * Math.pow(raio, 2);
	 }
}
