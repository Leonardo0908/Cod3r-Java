package Desafios3;

public class Jantar {
	
	public static void main(String[] args) {
		
		Comida c1 = new Comida("Arroz", 0.223);
		Comida c2 = new Comida("Feijao", 0.300);
		
		Pessoa p1 = new Pessoa("Leonardo", 99.8);
		Pessoa p2 = new Pessoa("Franciane", 61.0);
		
		System.out.println(p1.imprimir());
		System.out.println(p2.imprimir());
		
		p1.comer(c1);
		p2.comer(c1);
		
		System.out.println(p1.imprimir());
		System.out.println(p2.imprimir());
		
		p1.comer(c2);
		p2.comer(c2);
		
		System.out.println(p1.imprimir());
		System.out.println(p2.imprimir());
	}
}
