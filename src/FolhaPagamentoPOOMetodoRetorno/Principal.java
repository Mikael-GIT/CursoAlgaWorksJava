package FolhaPagamentoPOOMetodoRetorno;

public class Principal {
	public static void main(String[] args) {
		FolhaPagamento folha = new FolhaPagamento();
		//System.out.println(folha.calcularSalario(160, 12, 16, 32));
		double salario = folha.calcularSalario(160, 12, 16, 32);
		System.out.println("Salário calculado: " + salario);
	}
}
