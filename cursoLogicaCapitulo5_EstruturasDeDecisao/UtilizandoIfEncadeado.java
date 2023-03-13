package cursoLogicaCapitulo5_EstruturasDeDecisao;

import java.util.Scanner;

public class UtilizandoIfEncadeado {
    static final Double PESO_LEVE = 60.0;

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite o peso do lutador: ");
            Double peso = entrada.nextDouble();

            // Boolean pesoLeve = peso <= PESO_LEVE;
            // Boolean pesoMedio = (peso > 60) && (peso <= 90);
            // Boolean pesoPesado = peso > 90;

            /*
             * if (pesoLeve) {
             * System.out.println(" Sua categoria é Leves");
             * } else {
             * Boolean pesoMedio = (peso > 60) && (peso <= 90);
             * 
             * if (pesoMedio) {
             * System.out.println(" O lutador é dos Medios");
             * } else {
             * Boolean pesoPesado = peso > 90;
             * if (pesoPesado) {
             * System.out.println(" Sua categoria é de Pesados");
             * }
             * }
             * }
             */
            /*
             * if (pesoLeve) {
             * System.out.println(" Sua categoria é Leves");
             * } else if (pesoMedio) {
             * System.out.println("Sua categoria é Medios");
             * } else {
             * System.out.println(" Sua categoria é de Pesados");
             * }
             */

            Boolean pesoLeve = peso <= PESO_LEVE && peso > 0;
            Boolean pesoMedio = (peso > 60) && (peso <= 90);
            Boolean pesoPesado = peso > 90;
            if (pesoLeve) {
                System.out.println(" Sua categoria é Leves");
            } else if (pesoMedio) {
                System.out.println("Sua categoria é Medios");
            } else if (pesoPesado){
                System.out.println(" Sua categoria é de Pesados");
            } else {
                System.out.println(" O lutador não se encaixa em categoria alguma");
            }
        }

    }
}
