package DesafioBoxingEWrapper;

public class Programa {
	public static void main(String[] args) {
		Televisor tv = new Televisor();

		// N�o deveria mudar o volume e canal
		tv.mudarVolume(20);
		tv.mudarCanal(130);
		
		// Deveria mudar o volume e canal
		tv.mudarVolume(300);
		tv.mudarCanal(10);
	}
}
