package Arrays;

public class Carro {
	String fabricante = "Sem fabricante";
	String modelo;
	int anoFabricacao = 2011;
	String cor;
	boolean biCombustivel = true; //false
	
	
	//Criando um m�todo sem retorno
	void ligar() {
		if(modelo != null) {
			System.out.println("Ligando o carro: " + this.modelo);
		}
	}
}
