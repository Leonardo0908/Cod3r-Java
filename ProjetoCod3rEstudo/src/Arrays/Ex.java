package Arrays;

import java.util.Arrays;

public class Ex {
	
	public static void main(String[] args) {
		
		double[] notasAluno1 = new double[4];
		System.out.println(Arrays.toString(notasAluno1));
		
		notasAluno1[0] = 7.9;
		notasAluno1[1] = 8;
		notasAluno1[2] = 6.7;
		notasAluno1[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAluno1));
		System.out.println(notasAluno1[0]);
		System.out.println(notasAluno1[notasAluno1.length - 1]);
		//System.out.println(notasAluno1[4]);
		
		double total = 0;
		for(int i = 0;i < notasAluno1.length; i++) {
			total +=notasAluno1[i];
		}
		System.out.println(total / notasAluno1.length);
		
		final double notaArmazenada = 5.9;
		double[] notasAluno2 = {6.9,8.9,notaArmazenada,10};
		
		double total2 = 0;
		for(int i = 0;i < notasAluno2.length; i ++) {
			total2 += notasAluno2[i];
		}
		
		System.out.println(total2 / notasAluno2.length );
	}
}
