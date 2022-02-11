package Desafios2;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	String FormatoData() {
		return String.format("%d/%d/%d", dia,mes,ano);
	}
	void imprimirDataFormatada() {
		System.out.println(FormatoData());
	}
	
}
