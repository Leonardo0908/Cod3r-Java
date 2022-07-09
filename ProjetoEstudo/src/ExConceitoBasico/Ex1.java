package ExConceitoBasico;

import java.util.Scanner;

public class Ex1 {
	/* Criar um programa que leia a temperatura 
	 * em Fahrenheit e converta para Celsius.
	 */
	public static void main(String[] args) {
		
	// (°F - 32) * 5/9 = °C
	
			float num1 = 5 ,num2 = 9;
			float ajuste = 32;
			float fahrenheit = 0;
			float fator = 0;
			fator = num1 /num2;
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("\n Digite Fahrenheit °F:");
			fahrenheit = entrada.nextFloat();
			
			double celsius = (fahrenheit - ajuste ) * fator;
			
			System.out.printf("\n O resultado é: %.2f ",celsius,"°C");
		
			entrada.close();
	}
}
	
	

