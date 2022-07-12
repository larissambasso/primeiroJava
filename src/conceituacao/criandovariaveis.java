package conceituacao;

public class criandovariaveis {

	public static void main(String[] args) {
		int i;
		int I;
	
		i = 5;
		I = 10;
		
		final int j = 15; //final é uma variavel constante, nao é possivel mudar o seu valor
		
		int quantidadeProduto = 25;
		final int NUMERO_TENTATIVAS = 30; // em variaveis constantes(final), nao é necessario a regra de case-sensitive, e "_" 
		
		System.out.println(i);
		System.out.println(I);
		System.out.println(j);
		System.out.println(quantidadeProduto);
		System.out.println(NUMERO_TENTATIVAS);
		
	}

}
