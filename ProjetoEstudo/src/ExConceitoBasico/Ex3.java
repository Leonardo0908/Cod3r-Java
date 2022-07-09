package ExConceitoBasico;

import java.util.Scanner;

public class Ex3 {
	/* Criar um programa que leia o peso e a 
	 * altura do usuário e imprima no console o IMC.
	 * IMC = Peso / (Altura × Altura) 
	 */
	public static void main(String[] args) {
		
		 
		float imc;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("MENOR QUE 18,5	MAGREZA	0");
		System.out.println("ENTRE 18,5 E 24,9	NORMAL	0");
		System.out.println("ENTRE 25,0 E 29,9	SOBREPESO	I");
		System.out.println("ENTRE 30,0 E 39,9	OBESIDADE	II");
		System.out.println("MAIOR QUE 40,0	OBESIDADE GRAVE	III");
		
		System.out.println("Didite seu peso: ");
		Float peso = entrada.nextFloat();
	
		System.out.println("Didite sua altura: ");
		float altura = entrada.nextFloat();
				
		
		imc = peso / (altura * altura);
		
		System.out.printf("Seu IMC é: %.2f " ,imc);
		
		entrada.close();
	}	
}
