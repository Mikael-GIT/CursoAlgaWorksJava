package MetodosPOO;

public class Programa2 {
	public static void main(String[] args) {
		Carro meuCarro = new Carro();
		meuCarro.modelo = "Palio";
		
		
		Carro seuCarro = new Carro();
		seuCarro.modelo = "Civic";
		
		//Chamando o método ligar para cada um dos objetos
		meuCarro.ligar();
		seuCarro.ligar();
	}
}
