package testes;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		Subtracao s = new Subtracao();
		Scanner input = new Scanner(System.in);
		System.out.print("digite um numero: ");
		int numero = input.nextInt();
		s.tabuada(numero);
	}


}