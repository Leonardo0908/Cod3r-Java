package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d = new Data(30,10,1998);
		Data d1 = new Data();
				
		var d2 = new Data(9,8,1998);
		
		//System.out.printf("%d/%d/%d \n",date.dia,date.mes,date.ano);
		//System.out.printf("%d/%d/%d",date2.dia,date2.mes,date2.ano);
	
	System.out.println(d.FormatoData());
	System.out.println(d2.FormatoData());

	System.out.println();
	
	d.imprimirDataFormatada();
	d2.imprimirDataFormatada();
	d1.imprimirDataFormatada(); 
	}
}
