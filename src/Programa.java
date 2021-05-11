
public class Programa {

	public static void main(String[] args) {
		
		Carro meuCarro; //Declaramos a variável
		meuCarro = new Carro(); //Instanciamos a variável com um objeto do tipo Carro
		meuCarro.modelo = "Palio";
		meuCarro.anoFabricacao = 2011;
		meuCarro.fabricante = "Fiat";
		meuCarro.cor = "Prata";
		
		Carro seuCarro = new Carro(); // Declarando e instanciando o objeto na mesma linha
		seuCarro.fabricante = "Honda";
		seuCarro.modelo = "Civic";
		seuCarro.anoFabricacao = 2009;
		seuCarro.cor = "Preto";
		
		System.out.println("Meu carro: ");
		System.out.println("Modelo: " + meuCarro.modelo);
		System.out.println("Ano: " + meuCarro.anoFabricacao);
		System.out.println("Fabricante: " + meuCarro.fabricante);
		System.out.println("Cor: " + meuCarro.cor);
		
		System.out.println("------------------------------");
		System.out.println("Seu carro: ");
		System.out.println("Modelo: " + seuCarro.modelo);
		System.out.println("Ano: " + seuCarro.anoFabricacao);
		System.out.println("Fabricante: " + seuCarro.fabricante);
		System.out.println("Cor: " + seuCarro.cor);
	}

}
