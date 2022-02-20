package Desafios4Notas;

import java.util.Scanner;

public class NotasAlunos {
	
	public static void main(String[] args) {
		
		int num;
		double total = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de notas: ");
		num = entrada.nextInt();
		
		double[] notas = new double[num]; 
		
		for(int i = 0;i < notas.length; i++) {
			System.out.println("Digite a "+ (i +1) +"° nota:" );
			notas[i] = entrada.nextDouble();
		}
		
		for(int i = 0;i < notas.length;i++ ) {
		System.out.println(total += notas[i]);	
		}
		System.out.print("Média: ");
		System.out.println(total / notas.length);
		
		entrada.close();
	}
}
		
	
		
