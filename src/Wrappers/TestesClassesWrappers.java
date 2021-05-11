package Wrappers;

public class TestesClassesWrappers {
	public static void main(String[] args) {
		int x = 5; //tipo primitivo -> N�o possui m�todos
		Integer i = new Integer(5); //Objeto da classe Integer -> Por ser um objeto tem m�todos que podem ser utilizados.
		
		//Convertendo integer para double utilizando um m�todo do objeto i
		Double y = i.doubleValue(); 
		
		
		//Convertendo tipo double para tipo string
		String j = y.toString();
		
		String valor = "15.5";
		
		Float valorTotal = new Float(valor);
		System.out.println(valorTotal + 3);
		
		Integer l = Integer.parseInt("50");
		//xxx.parseXXX
		//tipo.parseTipo();
		System.out.println("Daqui a cinco anos voc� ter�: " + (l + 2) + "anos.");
		
		String salario = "1500";
		double salarioTotal = Double.parseDouble(salario) + 200;
		System.out.println("Salario atual: " + salarioTotal);		 
		
		try {
			double custo = Double.parseDouble("vinte e tr�s reais e cinquenta centavos");
			System.out.println("Custo total: " + custo);	
		} catch (NumberFormatException e) {
			System.err.println("N�mero inv�lido para convers�o.");
		}
	}
}
