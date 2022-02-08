package Desafios;

import java.util.Scanner;

public class Desafio1VariaveiseConstantes {
	
	public static void main(String[] args) {
		// (°F - 32) * 5/9 = °C
		
		final double fator = 5.0 / 9.0;
		final double ajuste = 32;
		
		Scanner entrada = new Scanner(System.in);
		
		double fahrenheit = 86;
		
		System.out.println("\n Digite Fahrenheit °F:");
		fahrenheit = entrada.nextDouble();
		
		double celsius = (fahrenheit - ajuste ) * fator;
		
		System.out.println("\n O resultado é: "+celsius+"°C");
	
		entrada.close();
	}
}
