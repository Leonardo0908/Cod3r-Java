package Desafios;

import java.util.Scanner;

public class Desafio5DiaSemana {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome do dia: ");
		String dia = entrada.next();
		
		// transforma tufo digitado em minusculo...
		//if("domingo".equals(dia.toLowerCase())) {
		//		System.out.println("Domigo dia 0");
		//}
		
		
		if(dia.equalsIgnoreCase("domingo")) {
			System.out.println("Domingo Dia 1");
		}
		else if("segunda".equalsIgnoreCase(dia)) {
			System.out.println("Segunda Dia 2");
		}
		else if("terça".equalsIgnoreCase(dia) || 
					("terca".equalsIgnoreCase(dia))) { 
			System.out.println("Terça Dia 3"); 
		}
		else if("quarta".equalsIgnoreCase(dia)) {
			System.out.println("Quarta Dia 4");	
		}
		else if("quinta".equalsIgnoreCase(dia)) {
			System.out.println("Quinta Dia 5");
		}
		else if("sexta".equalsIgnoreCase(dia)) {
			System.out.println("SextaDia 6");
		}
		else if("sabado".equalsIgnoreCase(dia) ||
					("sábado".equalsIgnoreCase(dia))) {
			System.out.println("Sábado Dia 7");
		}
		
		
		entrada.close();
		
		
	}
}
