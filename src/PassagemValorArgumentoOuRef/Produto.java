package PassagemValorArgumentoOuRef;

public class Produto {
	//void definirPreco(double precoCusto) {
		//Adiciona 20% ao pre�o de custo
	//	precoCusto = precoCusto * 1.20;
	//}
	
	//Assinatura do m�todo: � um m�todo sem retorno, com o nome definirPreco que recebe como par�metro
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
