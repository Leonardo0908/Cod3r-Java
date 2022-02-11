package Desafios2;

public class DataTeste {

		public static void main(String[] args) {
			
			Data date = new Data();
			
			date.dia = 9;
			date.mes = 8;
			date.ano = 1998;
					
			var date2 = new Data();
			date2.dia = 30;
			date2.mes = 10;
			date2.ano = 1998;   
			
			//System.out.printf("%d/%d/%d \n",date.dia,date.mes,date.ano);
			//System.out.printf("%d/%d/%d",date2.dia,date2.mes,date2.ano);
		
		System.out.println(date.FormatoData());
		System.out.println(date2.FormatoData());

		System.out.println();
		
		date.imprimirDataFormatada();
		date2.imprimirDataFormatada();
		}
}
