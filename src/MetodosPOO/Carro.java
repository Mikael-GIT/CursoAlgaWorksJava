package MetodosPOO;

public class Carro {
	String fabricante = "Sem fabricante";
	String modelo;
	int anoFabricacao = 2011;
	String cor;
	boolean biCombustivel = true; //false
	Proprietario dono = new Proprietario();
	
	
	//Criando um método sem retorno
	void ligar() {
		if(modelo != null) {
			System.out.println("Ligando o carro: " + this.modelo);
		}
	}
}
