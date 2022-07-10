package Desafio1paraN;

public class CompraTeste {
	
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "Leonardo";
		compra1.itens.add(new Item("Caneta", 20, 7.20));
		compra1.itens.add(new Item("Caderno", 3, 10.00));
		compra1.itens.add(new Item("celular", 1, 1500));
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValorTotal());
	}

}
