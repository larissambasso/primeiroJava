package conceituacao;

public class operadoresaritmeticos {

	public static void main(String[] args) {
	   System.out.println("PrePos");
	   prePos();
	   System.out.println("Aritmético");
	   aritmetico();
	   System.out.println("Atribuição");
	   System.out.println("Precedência");
	   atribuicao();
	   precedencia();
	}
	private static void prePos() {
		int k = 10;

		int i = ++k;
		int j = k--;
		int x = k;
		System.out.println("i:" + i);
		System.out.println("i:" + j);
		System.out.println("i:" + x);
	}

	private static void aritmetico() {
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		int e = 50;
		
		int r1 = a + b; // 30
		int r2 = c - a; // 20
		int r3 = d * b; // 800
		int r4 = e / a; // 5
		int r5 = c % b; // 10
		
		System.out.println("a+b" + r1);
		System.out.println("c-a" + r2);
		System.out.println("d*b" + r3);
		System.out.println("e/a" + r4);
		System.out.println("c%b" + r5);
	}

	private static void atribuicao() {
		int i = 1500;
		short j = 15;
		int k = 35;
		long l = 500L;
		float m = 3.5f;
		double n = m;

		System.out.println("d:" + n);

		i += 5; // i = i+5 = 1505
		j -= 3; // j = j-3 = 
		n /= 2.7d; // d = d/2.7d
		l *= 3; // l = l.3 = 1500
		k %= 2; // k = k%2 = 1

		System.out.println("i:" + i);
		System.out.println("j:" + j);
		System.out.println("d:" + n);
		System.out.println("l:" + l);
		System.out.println("k:" + k);

		i = k = j;

		System.out.println("k:" + k);
		System.out.println("i:" + i);
	}

	private static void precedencia() {
		int i = 10;
		int j = 20;
		int k = 30;

		int a = i++ + --j * k; // 10 + 19 + 30 -> 10 + 570 -> 580

		System.out.println("i++ + --j * k: " + a);
		System.out.println("i: " + i); // 11
		
		int b = k / --i % 3 + 1; // 30/10 % 3 + 1 -> 1
		
		System.out.println("k / --1 % 3 + 1: " + b);
		System.out.println("i: " + i); // 10

		int c = 2;

		c *= i += 5; // c = 2*1; i=i+5 -> c = 2 * 1; i = 10+5; -> c = 2*15; c = 30
		
		System.out.println("c = " + c);
	}

}
