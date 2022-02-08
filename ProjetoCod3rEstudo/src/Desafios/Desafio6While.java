package Desafios;

import java.util.Scanner;

public class Desafio6While {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.print("Informe a Nota (ou -1 p/ sair): ");
			nota = entrada.nextDouble();
			
			if(nota >= 0 && nota <=10) {
			total += nota;
			quantidadeDeNotas++;
			}else if(nota != -1) {
				System.out.println("Nota Inválida");
			}
		}
		
		
		double media = total / quantidadeDeNotas;
			System.out.println("Média = " + media);
			
		entrada.close();
	}
}
