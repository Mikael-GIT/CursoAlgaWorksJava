package Arrays;

public class TesteArrayComObjeto {
	public static void main(String[] args) {
		Carro [] carros = new Carro[2];
		carros[0] = new Carro();
		carros[0].anoFabricacao = 2011;
		carros[0].biCombustivel = true;
		carros[0].cor = "Preto";
		
		carros[1] = new Carro();
		carros[1].anoFabricacao = 2002;
		carros[1].biCombustivel = false;
		carros[1].cor = "Amarelo";
		
		for(Carro carro: carros) {
			System.out.println(carro.cor + " " + carro.anoFabricacao);
		}
		
	}
}
