package cursoLogicaCapitulo08_Metodos;

import java.util.Scanner;

public class RetornandoValores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        imprimirTraco();
        String[] curso = new String[] { "Java EE", "Spring", "Java OO Avançado" };

        imprimir("Escolha o curso desejado");

        iterarEExibirPosicoesDoVetorString(curso);

        Integer posicaoEScolhidaCurso = receberNumeroInteiro(" O curso desejado é: ", entrada);

        Boolean posicaoValida = verificarPosicaoEscolhida(posicaoEScolhidaCurso, curso);

        if (!posicaoValida) {
            encerrarProgramaDaPosicaoInvalida();
        }
        imprimirTraco();
        String[] formaDePagamento = new String[] { "Cartão", "Boleto" };

       // imprimirContinuarMesmaLinha(" Digite a forma de pagamento desejada: ");
        //iterarEExibirPosicoesDoVetorString(formaDePagamento);

        Integer pagamentoEscolhido = receberNumeroInteiro(" Digite a forma de pagamento escolhida", entrada);
        posicaoValida = verificarPosicaoEscolhida(pagamentoEscolhido, formaDePagamento);
        if (!posicaoValida) {
            encerrarProgramaDaPosicaoInvalida();
        }
        String cursoEscolhido = curso[posicaoEScolhidaCurso];
        String FormaPagamentoEscolhido = formaDePagamento[pagamentoEscolhido];

        imprimirTraco();

        imprimir(
                "Curso escolhido foi " + cursoEscolhido + " / forma de pagamento é: " + FormaPagamentoEscolhido);
    }

    static Integer receberNumeroInteiro(String texto, Scanner entrada) {
        imprimirContinuarMesmaLinha(texto);
        Integer numero = entrada.nextInt();
        return numero;
    }

    static void iterarEExibirPosicoesDoVetorString(String[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(" - " + i + " - " + vetor[i]);
        }
    }

    static void imprimirTraco() {
        System.out.println("=============/*/===============/*/============/*/===============/*'/");
    }

    static void encerrarProgramaDaPosicaoInvalida() {
        imprimir("OPÇÃO INVALIDA");
        System.exit(1);

    }

    static void imprimirContinuarMesmaLinha(String texto) {
        System.out.println(texto);
    }

    static void imprimir(String texto) {
        System.out.println(texto);
    }

    static Boolean verificarPosicaoEscolhida(Integer valorUm, String[] vetor) {
        Boolean resultado = (valorUm >= 0 && valorUm < vetor.length);
        return resultado;
    }

}

// public static void main(String[] args) {
// Double[] premissaInicial = new Double[] { 500.0, 100.0 };
// Double proporcao = 20.0;
//
// Double resultadoFinal = regraDeTres(premissaInicial, proporcao);
// System.out.println("Resultado " + resultadoFinal);
// }
//
// static Double regraDeTres(Double[] premisssa, Double proporcao) {
//
// Double resultado = (premisssa[0] * proporcao) / premisssa[1];
// return resultado;
// }}
