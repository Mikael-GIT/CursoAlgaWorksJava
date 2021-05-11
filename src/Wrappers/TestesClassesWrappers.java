package Wrappers;

public class TestesClassesWrappers {
	public static void main(String[] args) {
		int x = 5; //tipo primitivo -> Não possui métodos
		Integer i = new Integer(5); //Objeto da classe Integer -> Por ser um objeto tem métodos que podem ser utilizados.
		
		//Convertendo integer para double utilizando um método do objeto i
		Double y = i.doubleValue(); 
		
		
		//Convertendo tipo double para tipo string
		String j = y.toString();
		
		String valor = "15.5";
		
		Float valorTotal = new Float(valor);
		System.out.println(valorTotal + 3);
		
		Integer l = Integer.parseInt("50");
		//xxx.parseXXX
		//tipo.parseTipo();
		System.out.println("Daqui a cinco anos você terá: " + (l + 2) + "anos.");
		
		String salario = "1500";
		double salarioTotal = Double.parseDouble(salario) + 200;
		System.out.println("Salario atual: " + salarioTotal);		 
		
		try {
			double custo = Double.parseDouble("vinte e três reais e cinquenta centavos");
			System.out.println("Custo total: " + custo);	
		} catch (NumberFormatException e) {
			System.err.println("Número inválido para conversão.");
		}
	}
}
