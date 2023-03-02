package cursoLogicaCapitulo08_Metodos;

import java.util.Scanner;

public class RecebendoParametros {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
        imprimirTraco();
        String[] curso = new String[] { "Java EE", "Spring", "Java OO Avançado" };

        System.out.println("Escolha o curso desejado");

        iterarEExibirPosicoesDoVetorString(curso);

        imprimirContinuarMesmaLinha("Digite o curso desejado: ");
        Integer posicaoEScolhidaCurso = entrada.nextInt();

        Boolean posicaoValida = posicaoEScolhidaCurso >= 0 && posicaoEScolhidaCurso <
         curso.length;

        if (!posicaoValida) {
            encerrarProgramaDaPosicaoInvalida();
        }
        imprimirTraco();
        String[] formaDePagamento = new String[] { "Cartão", "Boleto" };

        imprimirContinuarMesmaLinha(" Digite a forma de pagamento desejada: ");
        iterarEExibirPosicoesDoVetorString(formaDePagamento);

        Integer pagamentoEscolhido = entrada.nextInt();

         posicaoValida = pagamentoEscolhido >= 0 && pagamentoEscolhido < formaDePagamento.length;
        if (!posicaoValida) {
            encerrarProgramaDaPosicaoInvalida();
        }
        String cursoEscolhido = curso[posicaoEScolhidaCurso];
        String FormaPagamentoEscolhido = formaDePagamento[pagamentoEscolhido];

        imprimirTraco();

        System.out.println(
                "Curso escolhido foi " + cursoEscolhido + " / forma de pagamento é: " + FormaPagamentoEscolhido);
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
        System.err.println("OPÇÃO INVALIDA");
        System.exit(1);

    }
    static void imprimirContinuarMesmaLinha( String texto){
        System.out.println(texto);
    }

}
