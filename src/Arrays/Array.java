package Arrays;

import java.util.Iterator;

public class Array {
	public static void main(String[] args) {
		int [] notas = new int[4];
		notas[0] = 10;
		notas[1] = 5;
		
		System.out.println("Tamanho do array de notas: " + notas.length);
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Nota: " + notas[i] + " do: " + i + "° aluno.");
		}
		System.out.println("Nota do primeiro aluno: " + notas[0]);
	}
}
