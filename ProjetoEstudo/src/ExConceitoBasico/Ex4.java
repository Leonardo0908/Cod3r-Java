package ExConceitoBasico;

import java.util.Scanner;

public class Ex4 {
	/* Criar um programa que leia um valor e apresente 
	 * os resultados ao quadrado e ao cubo do valor.
	 */
	public static void main(String[] args) {
		
		float num,quadrado,cubo;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		num = entrada.nextFloat();
		
		quadrado = (float) Math.pow(num, 2);
		
		cubo = (float) Math.pow(num, 3);

		System.out.printf("Valor ao quadrado... %.2f Valor ao cubo... %.2f",quadrado,cubo);
		
		entrada.close();
	}
	
}
