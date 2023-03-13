package cursoLogicaCapitulo4_Operadores;

import java.util.Scanner;

public class TempoParaAposentadoria {
        static final Integer TEMPO_MINIMO_DE_CONTRIBUICAO = 25;
        static final Integer IDADE_MINIMA_APOSENTADORIA = 55;
    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print(" Digite sua idade: ");
            Integer idade = entrada.nextInt();

            System.out.print(" Digite o seu tempo de trabalho ");
            Integer tempoDeTrabalho = entrada.nextInt();

            Boolean tempoDeServico = tempoDeTrabalho >= TEMPO_MINIMO_DE_CONTRIBUICAO;
            boolean idadeMinima = idade >= IDADE_MINIMA_APOSENTADORIA;

            Boolean aposentadoriaValida = tempoDeServico && idadeMinima;

            if(aposentadoriaValida) {
                System.out.println(" Va à uma unidade do INSS. ");
            } else{
                System.out.println(" idade minima ou tempo de trabalho não estao dentro dos parametros necessarios! ");
            }
        }

    }
}
