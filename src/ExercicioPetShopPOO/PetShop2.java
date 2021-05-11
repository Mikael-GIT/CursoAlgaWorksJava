package ExercicioPetShopPOO;

public class PetShop2 {
	public static void main(String[] args) {
		//Testando variáveis referenciam objetos:
		
		Cachorro cachorro1 = new Cachorro();
		Cachorro cachorro2 = new Cachorro();
		DonoPet dono1 = new DonoPet();
		
		cachorro1.nome = "Pit";
		cachorro1.idade = 3;
		cachorro1.raca = "Pitbull";
		cachorro1.dono = dono1;
		
		
		cachorro2.nome = "Smoke";
		cachorro2.idade = 4;
		cachorro2.raca = "Xiuaua";
		cachorro2.dono = dono1;
		
		cachorro1.dono.nome = "Mikael Tavares";
		cachorro1.dono.idade = 19;
		cachorro1.dono.endereco = "Rua Geni Saraiva 2329";
		
		System.out.println("Dono cachorro 1: " + cachorro1.dono.nome);
		System.out.println("Dono cachorro 2: " + cachorro2.dono.nome);
		System.out.println("Dono: " + dono1.nome);
	}
}
