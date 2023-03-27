package cursoLogicaCapitulo08_Metodos;

import java.util.Scanner;

public class Recursividade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        imprimirTraco();
        String cursoEscolhido = receberCursoDoUsuario(entrada);
        imprimirTraco();

        String FormaPagamentoEscolhido = receberFormaDePagamentoDoUsuario(entrada);
        imprimirTraco();

        imprimir(
                "Curso escolhido foi " + cursoEscolhido + " / forma de pagamento é: " + FormaPagamentoEscolhido);
                entrada.close();
    }

    // ==================================================================================

    static String receberFormaDePagamentoDoUsuario(Scanner entrada) {
        String[] formaDePagamento = new String[] { "Cartão", "Boleto" };
        iterarEExibirPosicoesDoVetorString(formaDePagamento);

        Integer pagamentoEscolhido = receberIndiceValidoDoUsuario(formaDePagamento, "Forma de pagamento escolhida é:",
                entrada);
        return formaDePagamento[pagamentoEscolhido];
    }

    static String receberCursoDoUsuario(Scanner entrada) {

        String[] curso = new String[] { "Java EE", "Spring", "Java OO Avançado" };

        imprimir("Escolha o curso desejado");

        iterarEExibirPosicoesDoVetorString(curso);

        Integer posicaoCursoEscolhido = receberIndiceValidoDoUsuario(curso, " O curso que você deseja é o: ", entrada);
        return curso[posicaoCursoEscolhido];
    }

    static Integer receberIndiceValidoDoUsuario(String[] vetor, String texto, Scanner entrada) {
        Integer posicaoEscolhida = receberNumeroInteiro(texto, entrada);

        Boolean posicaoValida = verificarPosicaoEscolhida(posicaoEscolhida, vetor);

        if (!posicaoValida) {
            encerrarProgramaDaPosicaoInvalida();
        }
        return posicaoEscolhida;
    }

    static Integer receberNumeroInteiro(String texto, Scanner entrada) {
        imprimirContinuarMesmaLinha(texto);
        Integer numero = entrada.nextInt();
        return numero;
    }

    static void iterarEExibirPosicoesDoVetorString(String[] vetor) {
        iterarEExibirPosicoesDoVetorString(vetor, 0);
    }

    static void iterarEExibirPosicoesDoVetorString(String[] vetor, Integer i) {
        System.out.println(" [ " + i + " ] " + vetor[i]);
        if (++i < vetor.length) {
            iterarEExibirPosicoesDoVetorString(vetor, i);
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
