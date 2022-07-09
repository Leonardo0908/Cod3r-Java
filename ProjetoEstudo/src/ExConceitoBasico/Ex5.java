package ExConceitoBasico;

import java.util.Scanner;

public class Ex5 {
	/*  Criar um programa que leia o valor da base
	 *  e da altura de um triângulo e calcule a área.
	 */
	  public static void main(String[] args) {
		//base * altura / 2
		  
		  float base;
		  float altura;
		  float area;
		  
		  Scanner entrada = new Scanner(System.in);
		  
		  System.out.println("Calculo de area de um triangulo...");
		  System.out.println("Digite o valor da Base: ");
		  base = entrada.nextFloat();
		  
		  System.out.println("Digite o valor da altura: ");
		  altura = entrada.nextFloat();
		  
		  area = (base * altura) / 2;
		  
		  System.out.printf("Area do triangulo é: %.2f",area);
		  
		  entrada.close();
	}
	
}
