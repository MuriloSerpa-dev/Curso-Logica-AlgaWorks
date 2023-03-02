package cursoLogicaCapitulo5_EstruturasDeDecisao;

import java.util.Scanner;

public class EstruturaIf {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Double emprestimo = 4.000;
        Double movimentacaoMedia = 2.000;

        // Boolean movimentaPeloMenosMetadeDoValor = (movimentacaoMedia * 2) >=
        // emprestimo;
        Boolean aContaTemTempoSuficienteDeAbertura = true;
        Boolean tempoNomeLimpo = true;

        // Boolean liberarEmprestimo = movimentaPeloMenosMetadeDoValor
        // && aContaTemTempoSuficienteDeAbertura && tempoNomeLimpo;

        if (((movimentacaoMedia * 2) >= emprestimo)
                && aContaTemTempoSuficienteDeAbertura && tempoNomeLimpo) {
            System.out.println("Sim pode liberar emprestimo. ");
        } else {
            System.out.println("Não pode liberar o emprestimo. ");
        }
    }
}
