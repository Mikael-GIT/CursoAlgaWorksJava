package PassagemValorArgumentoOuRef;

public class Principal {
	public static void main(String[] args) {
		Preco preco = new Preco();
		preco.valorCustos = 140;
		
		Preco preco2 = new Preco();
		preco2.valorCustos = 160;
		
		Produto produto = new Produto();
		Produto produto2 = new Produto();
		
		//Aqui o método recebe uma referência do objeto preco que instanciamos, faz os calculos e nos 
		//retorna este objeto com os seus novos valores.
		produto.definirPreco(preco, 20, 15);
		
		System.out.println("Valor custos: " + preco.valorCustos);
		System.out.println("Valor impostos: " + preco.valorImpostos);
		System.out.println("Valor lucro: " + preco.valorLucro);
		System.out.println("Preço venda: " + preco.precoVenda);
		
		System.out.println("-----------------------");
		
		produto2.definirPreco(preco2, 30, 20);
		System.out.println("Valor custos: " + preco2.valorCustos);
		System.out.println("Valor impostos: " + preco2.valorImpostos);
		System.out.println("Valor lucro: " + preco2.valorLucro);
		System.out.println("Preço venda: " + preco2.precoVenda);
	
	}
}
