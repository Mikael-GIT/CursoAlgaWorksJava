package FolhaPagamentoPOOMetodoRetorno;

public class FolhaPagamento {
	
	//Assinatura do método: Ele retorna um double, o nome do método é calcular salário e ele recebe
	//(int, int, double, double)
	double calcularSalario(int horasNormais, int horasExtras, 
			double valorHoraNormal, double valorHoraExtra) {
		
		double valorHorasNormais = horasNormais * valorHoraNormal; 
		double valorHorasExtras = horasExtras * valorHoraExtra;
		return valorHorasNormais + valorHorasExtras;
	}
}
