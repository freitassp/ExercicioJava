package primeiraclasse;

public class PrimeiraClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto produto = new Produto();
		produto.nome = "Smartphone";
		produto.precoUnitario = 900.0;
		produto.quantidade = 15;
		
		exibirQuantidadeEmEstoque(produto);
	}
	static void exibirQuantidadeEmEstoque(Produto produto) {
		System.out.println("Quantidade em estoque: "+ produto.quantidade);
		
	}

}
