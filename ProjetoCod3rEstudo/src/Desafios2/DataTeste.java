package Desafios2;

public class DataTeste {

		public static void main(String[] args) {
			
			  
			
			Data date = new Data(30,10,1998);
			Data date1 = new Data();
					
			var date2 = new Data(9,8,1998);
			
			//System.out.printf("%d/%d/%d \n",date.dia,date.mes,date.ano);
			//System.out.printf("%d/%d/%d",date2.dia,date2.mes,date2.ano);
		
		System.out.println(date.FormatoData());
		System.out.println(date2.FormatoData());

		System.out.println();
		
		date.imprimirDataFormatada();
		date2.imprimirDataFormatada();
		date1.imprimirDataFormatada(); 
		}
}
