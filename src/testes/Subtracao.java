package testes;

public class Subtracao {
	public void tabuada(int n) {
	    int i;

	    System.out.printf("+--Resultado--+\n");
	    for (i=1; i<=10; i++) {
	    System.out.printf("| %2d * %d = %2d|\n", i, n, (i*n));
	    }
	    System.out.printf("+-------------+\n\n");
	  }
}