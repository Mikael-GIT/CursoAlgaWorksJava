package Boxing;

public class Boxing2 {
	public static void main(String[] args) {
		Integer i1 = 127;
		Integer i2 = 127;
		
		Integer i3 = 128;
		Integer i4 = 128;
		
		System.out.println(i3 == i2); //O uso do == quando se trata de objetos � comparado a refer�ncia
		//do objeto. Onde ele est� alocado e se executarmos vai dar false porque s�o objetos com
		//lugares diferentes alocados na mem�ria.
		
		System.out.println(i3 == i4);
		
		System.out.println(i3.equals(i4)); //O uso do .equals compara o valor que est� armazenado no 
		//objeto, n�o a sua refer�ncia. Perceba que neste caso d� true.
	}
}
