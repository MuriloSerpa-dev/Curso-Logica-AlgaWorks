package cursoLogicaCapitulo08_Metodos;

import java.util.Scanner;

public class PrimeiroMetodo {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            imprimirTraco();
            String[] curso = new String[] { "Java EE", "Spring", "Java OO Avançado" };

            System.out.println("Escolha o curso desejado");
            for (int i = 0; i < curso.length; i++) {
                System.out.println(" [" + i + "] " + curso[i]);
            }
            System.out.println(" O curso desejado é: ");
            Integer posicaoEScolhidaCurso = entrada.nextInt();

            Boolean posicaoValida = posicaoEScolhidaCurso >= 0 && posicaoEScolhidaCurso < curso.length;


            if (!posicaoValida) {
                encerrarOpcaoCasoInvalida();
            }
            imprimirTraco();
            String[] formaDePagamento = new String[] { "Cartão", "Boleto" };

            System.out.println("Digite a forma de pagamento desejada: ");
            for (int i = 0; i < formaDePagamento.length; i++) {
                System.out.println("[" + i + "]" + formaDePagamento[i]);
            }
            Integer pagamentoEscolhido = entrada.nextInt();

            posicaoValida = pagamentoEscolhido >= 0 && pagamentoEscolhido < formaDePagamento.length;
            if (!posicaoValida) {
                encerrarOpcaoCasoInvalida();
            }
            String cursoEscolhido = curso[posicaoEScolhidaCurso];
            String FormaPagamentoEscolhido = formaDePagamento[pagamentoEscolhido];

            imprimirTraco();

            System.out.println(
                    "Curso escolhido foi " + cursoEscolhido + " / forma de pagamento é: " + FormaPagamentoEscolhido);
        }
    }

    static void imprimirTraco() {
        System.out.println("=============/*/===============/*/============/*/===============/*'/");
    }

    static void encerrarOpcaoCasoInvalida() {
        System.err.println("OPÇÃO INVALIDA");
        System.exit(1);

    }
}
