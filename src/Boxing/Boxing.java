package Boxing;

public class Boxing {
	public static void main(String[] args) {
		Integer i = 10; //O Boxing é este processo dele reconhecer o 10 como tipo primitivo e converter
		//para um objeto do tipo Integer.
		
		Integer x = new Integer(10);
		
		int j = x; //Neste caso ele faz o processo inverso, ele pega a variável x que é um objeto do
		//tipo Integer e converte no tipo primitivo int. Se tentarmos usar j.valueOf, não dará certo.
	
	
	}
}
