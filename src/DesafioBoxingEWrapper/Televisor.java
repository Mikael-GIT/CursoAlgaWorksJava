package DesafioBoxingEWrapper;

public class Televisor {
	
	Integer canal = 130;
	Integer volume = 20;

	void mudarCanal(Integer novoCanal) {
		if (canal.equals(novoCanal)) {
			System.out.println("Novo canal � tamb�m o canal atual.");
		} else {
			canal = novoCanal;
			System.out.println("Canal alterado para " + canal);
		}
	}
	
	void mudarVolume(Integer novoVolume) {
		if (volume.equals(novoVolume)) {
			System.out.println("Novo volume � tamb�m o volume atual.");
		} else {
			volume = new Integer(novoVolume.byteValue());
			System.out.println("Volume alterado para " + volume);
		}
	}
}
