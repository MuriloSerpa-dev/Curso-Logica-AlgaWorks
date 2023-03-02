package cursoLogicaCapitulo5_EstruturasDeDecisao;

import java.util.Scanner;

public class ConcursoPublico {
    static final Integer NOTA_MINIMA_DE_CORTE = 150;
    static final Integer NOTA_MINIMA_MATERIA_INDIVIDUAL = 60;
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor de sua nota de Portugues: ");
        Double notaPortugues = entrada.nextDouble();

        System.out.println("Digite sua nota de matematica: ");
        Double notaMatematica = entrada.nextDouble();
        
       // Boolean notaParaAprovacao = notaMatematica + notaPortugues >= NOTA_MINIMA_DE_CORTE
        //&& notaMatematica >= NOTA_MINIMA_MATERIA_INDIVIDUAL && notaPortugues >= NOTA_MINIMA_MATERIA_INDIVIDUAL;

        Boolean notaAprovadoPortugues = notaPortugues >= NOTA_MINIMA_MATERIA_INDIVIDUAL; 
        Boolean notaAprovadoMatematica = notaMatematica >= NOTA_MINIMA_MATERIA_INDIVIDUAL;

        boolean notaAprovadoGeral = notaPortugues + notaMatematica >= NOTA_MINIMA_DE_CORTE;
        
        Boolean validacaoNotas = notaAprovadoPortugues && notaAprovadoMatematica && notaAprovadoGeral;
        if(validacaoNotas) {
            System.out.println("Aluno aprovado: ");
        } else {
            System.out.println(" Aluno reprovado ");
        }
    }
}
