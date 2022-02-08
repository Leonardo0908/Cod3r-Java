package Desafios;

public class Desafio3Logicos {
	
	public static void main(String[] args) {
		
		boolean trabalho  = false;
		boolean trabalho2 = false;
	
		boolean comprouTV50 = trabalho && trabalho2;
		boolean comprouTV32 = trabalho ^ trabalho2;
		boolean comprouSorvete = trabalho || trabalho2;
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou TV 50\"?" +comprouTV50);
		System.out.println("Comprou TV 32\"?" +comprouTV32);
		System.out.println("Comprou Sorvete?"+comprouSorvete);
		
		// Operador Unário !
		System.out.println("mais saudável? "+ maisSaudavel);
		
	}
}
