package Desafios;

import java.util.Scanner;
	
public class Desafio2Conversão {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("\n Informe o 1° salário:");
		String valor = entrada.next().replace(",", ".");
		
		System.out.println("\n Informe o 2° salário:");
		String valor2 = entrada.next().replace(",", ".");
			
		System.out.println("\n Informe o 3° salário:");
		String valor3 = entrada.next().replace(",", ".");
	
		double salario  = Double.parseDouble(valor);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario + salario2 + salario3) / 3;
		
		System.out.println(" A média dos salários é: "+media);
		
		entrada.close();
	}
}

