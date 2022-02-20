package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qauntos alunos? ");
		int qtAlunos = entrada.nextInt();
		
		System.out.print("Quantidade notas? ");
		int qtNotas = entrada.nextInt();
		
		double[][] notasDaTurma = new double[qtAlunos][qtNotas];
		
		double total = 0;
		for(int i = 0;i < notasDaTurma.length;i++ ) {
			for(int x = 0;x < notasDaTurma[i].length;x++ ) {
				
				System.out.printf("Informe a nota %d do aluno %d: "
						,x +1 ,i + 1);
				notasDaTurma[i][x] = entrada.nextDouble();
				total += notasDaTurma[i][x];
			}	
		}
		
		double media = total / (qtAlunos * qtNotas);
		System.out.println("Média da turma é " + media);
		
		for(double[] notasDoAluno: notasDaTurma) {
			
			System.out.println(Arrays.toString(notasDoAluno));
		}
		
		entrada.close();
	}
}
