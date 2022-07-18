package metodos;

public class Main {

    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercício calculadora");
        Calculadora.soma(5, 5);
        Calculadora.subtracao(3, 1);
        Calculadora.multiplicacao(8, 8);
        Calculadora.divisao(50, 25);

        // Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(3);
        Mensagem.obterMensagem(4);
        Mensagem.obterMensagem(5);

        // Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}