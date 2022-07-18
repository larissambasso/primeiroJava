package conceituacao;

import java.util.Scanner;

public class operacoesbasicas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int valor1, valor2;
		
		System.out.print("Digite o primeiro valor: ");
		valor1 = scan.nextInt();
		System.out.print("Digite o segundo valor: ");
		valor2 = scan.nextInt();
		
		int soma = soma(valor1, valor2);
		int subtracao = subtracao(valor1, valor2);
		int multiplicacao = multiplicacao(valor1, valor2);
		int divisao = divisao(valor1, valor2);
		
		System.out.println("A soma destes dois valores é igual a: " + soma);
		System.out.println("A subtracao destes dois valores é igual a: " + subtracao);
		System.out.println("A multiplicacão destes dois valores é igual a: " + multiplicacao);
		System.out.println("A divisão destes dois valores é igual a:  " + divisao);
		
	}
	
	public static int soma(int valor1, int valor2) {
		return valor1 + valor2;
	}
	
	public static int subtracao(int valor1, int valor2) {
		return valor1 - valor2;
	}
	
	public static int divisao(int valor1, int valor2) {
		return valor1 / valor2;
	}
	
	public static int multiplicacao(int valor1, int valor2) {
		return valor1 * valor2;
	}

}
