package Desafios2;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto pro = new Produto("Celular", 10000.00);
		
		var pro2 = new Produto();
		pro2.nome = "Camisa";
		pro2.preco = 5000.00;
		
		//ALTERA Valor do desconto 
		//mesmo ele sendo statico em Produto
		//Produto.desconto = 0.50;
		
		System.out.println(pro.nome +" " + pro.precoDesconto());
		System.out.println(pro2.nome + " " +pro2.precoDesconto());
		
		double precoFinal = pro.precoDesconto();
		double precoFinal2 = pro2.precooDesconto(0.1);
		double mediaCarrinho = (precoFinal + precoFinal2) / 2;
		
		System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
		
	}
}
