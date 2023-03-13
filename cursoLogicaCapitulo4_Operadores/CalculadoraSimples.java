package cursoLogicaCapitulo4_Operadores;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Digite o primeiro numero > ");
            Integer primeiroValor = entrada.nextInt();

            System.out.print(" Digite a operacao 1 Adicao /  2 subtracao / 3 multiplicacao / 4 divisao ");
            Integer valorOperacao = entrada.nextInt();

            System.out.print(" Digite o segundo valor > ");
            Integer segundoValor = entrada.nextInt();

            boolean tipoOperacaoEscolhida = valorOperacao.equals(1);

            Integer calculoOperacao = 0;

            if (tipoOperacaoEscolhida) {
                calculoOperacao = primeiroValor + segundoValor;
            } else if (valorOperacao == 2) {
                calculoOperacao = primeiroValor - segundoValor;
            } else if (valorOperacao == 3) {
                calculoOperacao = primeiroValor * segundoValor;
            } else{
                calculoOperacao = primeiroValor / segundoValor;
            }

            System.out.println(" Resultado = " + calculoOperacao);
        }

    }
}
