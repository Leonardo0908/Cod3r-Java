package Desafios;

import java.util.Scanner;

public class Desafio4Calculadora {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		boolean op1 = true;
		
		do {
			
		System.out.println("\nDigite o 1° número: ");
		float num = entrada.nextFloat();
		
		System.out.println("Informe a operação");
		String op = entrada.next();
		
		System.out.println("Digite o 2° número: ");
		float num1 = entrada.nextFloat();
		
		float resultado = "+".equals(op) ? num + num1 : 0;
		resultado = "-".equals(op) ? num - num1 :resultado;
		resultado = "*".equals(op) ? num * num1 :resultado;
		resultado = "/".equals(op) ? num / num1 :resultado;
		resultado = "%".equals(op) ? num % num1 :resultado;
		
		
		System.out.printf("%.2f %s %.2f = %.2f ", 
				num, op, num1, resultado);
		
		if(num == 0 && num1 ==0) {
			op1 = false;
		}
		}while(op1);
	
		entrada.close();
	}
}
