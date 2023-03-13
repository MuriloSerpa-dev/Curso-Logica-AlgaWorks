package cursoLogicaCapitulo08_Metodos;

import java.util.Scanner;

public class CalculadoraSubAdic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        imprimir("Calculadora");

        Integer primeiroValor = ReceberValor(entrada);

        Integer segundoValor = ReceberValor(entrada);

        Integer valorRecebidoOperacao = receberAOperacaoEscolhida(entrada);

        Integer resultado = realizarCalculo(valorRecebidoOperacao, primeiroValor, segundoValor);
        System.out.println("O resultado é: " + resultado);
    }

    static Integer realizarCalculo(Integer operacao, Integer primeiroValor, Integer SegundoValor) {
        Integer resultado = null;

        switch (operacao) {
            case 0:
                resultado = adicao(primeiroValor, SegundoValor);
                break;
            case 1:
                resultado = subtracao(primeiroValor, SegundoValor);
                break;

            default:
                System.err.println("Operação INVALIDA");
                System.exit(1);
        }
        return resultado;
    }

    static Integer subtracao(Integer primeiroValor, Integer SegundoValor) {
        return primeiroValor - SegundoValor;
    }

    static Integer adicao(Integer primeiroValor, Integer SegundoValor) {
        return primeiroValor + SegundoValor;
    }

    static Integer receberAOperacaoEscolhida(Scanner entrada) {
        System.out.println("Escolha operação: ");
        String[] metodoDoCalculo = new String[] { "ADIÇÃO", " SUBTRAÇÃO " };

        for (int i = 0; i < metodoDoCalculo.length; i++) {
            System.out.println(":" + i + " : " + metodoDoCalculo[i]);

        }
        System.out.println("Digite a operação: ");
        return entrada.nextInt();

    }

    static void imprimir(String texto) {
        System.out.println(texto);
    }

    static Integer ReceberValor(Scanner entrada) {
        System.out.println(" Digite o valor escolhido ");
        return entrada.nextInt();
    }
}