
public class Programa2 {
	public static void main(String[] args) {
		Proprietario dono = new Proprietario();
		
		dono.nome = "Mikael Tavares";
		dono.cpf = "170.789.827-89";
		dono.idade = 19;
		dono.logradouro = "Rua Geni Saraiva 2329, 20";
		dono.bairro = "Centro";
		dono.cidade = "Nova Iguaçu";
		
		Carro meuCarro = new Carro();
		meuCarro.anoFabricacao = 2001;
		meuCarro.cor = "Preto";
		meuCarro.fabricante = "Fiat";
		meuCarro.modelo = "Palio";
		meuCarro.dono = dono;
		
		//Outra forma de fazer:
		meuCarro.dono = new Proprietario();
		meuCarro.dono.nome = "Josevaldo";
		meuCarro.dono.cpf = "180.932.420-49";
		meuCarro.dono.idade = 21;
	}
}
