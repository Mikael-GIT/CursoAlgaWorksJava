package ExercicioPOO;

public class PetShop {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.nome = "Mikael Tavares";

		
		/* Esse trecho de c�digo comentado, 
		 poderia ser utilizado para substituir 
		 o c�digo "p1.cachorro = new Cachorro();"
		 Cachorro cachorro = new Cachorro()
		 p1.cachorro = cachorro;
		*/
		pessoa.cachorro = new Cachorro();
		pessoa.cachorro.nome = "Kiko";
		pessoa.cachorro.idade = 2;
		
		Caminhada c = new Caminhada();
		c.andar(pessoa);
	}
}
