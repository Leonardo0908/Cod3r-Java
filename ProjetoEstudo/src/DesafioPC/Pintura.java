package DesafioPC;

import java.util.Scanner;

public class Pintura {
	public static void main(String[] args) {
		
		float[] parede = new float[5];
		float largura, altura;
		
		Scanner  leia = new Scanner(System.in);
		
		for(int i = 1; i < 5; i++) {
			System.out.println("Digite a largura da parede "+i);
			largura = leia.nextFloat();
			System.out.println("Digite a altura da parede "+i );
			altura = leia.nextFloat();
			
			parede[i] = largura * altura;
		}
		
		for(int i = 1; i < 5; i++) {
			System.out.println(parede[i]);
		}
	}
}
