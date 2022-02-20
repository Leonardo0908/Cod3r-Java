package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data(int diaIn,int mesIn, int anoIn){
		 dia = diaIn;
		 mes = mesIn;
		 ano = anoIn;
	}
	
	Data(){
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
	
	String FormatoData() {
		return String.format("%d/%d/%d", dia,mes,ano);
	}
	void imprimirDataFormatada() {
		System.out.println(FormatoData());
	}
	void AdicionaData() {
		
	}
}
