package ExConceitoBasico;

import java.util.Scanner;

public class Ex2 {
	/* Criar um programa que leia a 
	 * temperatura em Celsius e converta para Fahrenheit.
	 */
	public static void main(String[] args) {
		
		// °C +32 / 1.8
		
		double celsius;
		double fahrenheit;
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o graus Celsius °C ");
		celsius = entrada.nextDouble();
		
		fahrenheit = (celsius * 1.8) +32;
		
		System.out.printf("%.2f",fahrenheit);
		
		entrada.close();
	}
}
