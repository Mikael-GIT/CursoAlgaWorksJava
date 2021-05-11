package PassagemValorArgumentoOuRef;

public class Produto {
	//void definirPreco(double precoCusto) {
		//Adiciona 20% ao preço de custo
	//	precoCusto = precoCusto * 1.20;
	//}
	
	//Assinatura do método: É um método sem retorno, com o nome definirPreco que recebe como parâmetro
	//um objeto da classe Preco, e dois double. (Preco, double, double)
	
	void definirPreco(Preco preco, double percentualImpostos,
			double margemLucro) {
		preco.valorImpostos = preco.valorCustos 
				* (percentualImpostos / 100);
		preco.valorLucro = preco.valorCustos * (margemLucro / 100);
		preco.precoVenda = preco.valorCustos 
				+ preco.valorImpostos + preco.valorLucro;
	}
}
