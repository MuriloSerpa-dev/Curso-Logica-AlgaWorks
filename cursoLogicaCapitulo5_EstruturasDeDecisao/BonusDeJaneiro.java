package cursoLogicaCapitulo5_EstruturasDeDecisao;

import java.util.Scanner;

public class BonusDeJaneiro {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite a meta faturamento da empresa");
            Double metaDeFaturamento = entrada.nextDouble();

            System.out.println("Digite o faturamento da empresa no ultimo ano: ");
            Double faturamentoAnoPassado = entrada.nextDouble();

            System.out.println("Digite a media salarial do funcionario: ");
            Double mediaSalarialFuncionario = entrada.nextDouble();

            Double oitentaPorCentoDaMeta = (metaDeFaturamento * 80) / 100;

            Boolean bateuAmeta = faturamentoAnoPassado >= metaDeFaturamento;

            Boolean faturouAteOitentaPorCento = faturamentoAnoPassado >= oitentaPorCentoDaMeta;

            if (bateuAmeta) {
                System.out.println("Parabens você ganhou 100% de Bonus!");
            } else if (faturouAteOitentaPorCento) {
                Double mediaSalarialOitentaPorCento = (mediaSalarialFuncionario * 80) / 100;

                System.out.println("Você vai receber 80% da sua media salarial = " + mediaSalarialOitentaPorCento);
            } else {
                System.out.println("Sem direito de bonus");
            }
        }

    }
}
