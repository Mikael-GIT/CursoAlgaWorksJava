package Boxing;

public class Boxing2 {
	public static void main(String[] args) {
		Integer i1 = 127;
		Integer i2 = 127;
		
		Integer i3 = 128;
		Integer i4 = 128;
		
		System.out.println(i3 == i2); //O uso do == quando se trata de objetos é comparado a referência
		//do objeto. Onde ele está alocado e se executarmos vai dar false porque são objetos com
		//lugares diferentes alocados na memória.
		
		System.out.println(i3 == i4);
		
		System.out.println(i3.equals(i4)); //O uso do .equals compara o valor que está armazenado no 
		//objeto, não a sua referência. Perceba que neste caso dá true.
	}
}
