package Desafios2;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto() {
		
	}
	
	Produto(String nomeIn, double precoIn) {
		nome = nomeIn;
		preco = precoIn;
		//desconto = descontoIn;
	}
	
	double precoDesconto() {
		return preco * (1 - desconto);
	}
	
	double precooDesconto(double descontoGerente) {
		return preco * (1 - desconto + descontoGerente);
	}
}
