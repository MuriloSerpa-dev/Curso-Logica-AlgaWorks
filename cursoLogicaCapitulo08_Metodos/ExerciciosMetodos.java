package cursoLogicaCapitulo08_Metodos;

import java.util.Scanner;

public class ExerciciosMetodos {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            Integer tamanho = 0;

            do {
                System.out.println(" Entre com a quantidade de alunos: ");
                tamanho = entrada.nextInt();
                if (tamanho < 1 && tamanho > 15) {
                    System.out.println(" Tamanho invalido! XXX");
                }
            } while (tamanho < 1 && tamanho > 15);

            Integer[] notaUm = new Integer[tamanho];
            Integer[] notaDois = new Integer[tamanho];
            Integer[] soma = new Integer[tamanho];

            System.out.println("Entre com a nota da primeira avaliação dos alunos: ");
            for (int i = 0; i < notaUm.length; i++) {
                do {
                    System.out.println(" Aluno " + (i + 1) + " : ");
                    notaUm[i] = entrada.nextInt();
                    System.err.println(" Digite um valor entre 0 e 4: ");
                } while (notaUm[i] < 0 || notaUm[i] > 4);
            }

            // nota um vai de 0 até quatro
            System.out.println("Entre com a nota da segunda avaliação dos alunos: ");
            for (int i = 0; i < notaDois.length; i++) {
                do {
                    System.out.println(" Aluno " + (i + 1) + " : ");
                    notaDois[i] = entrada.nextInt();
                    if (notaDois[i] < 1 || notaDois[i] > 6) {
                        System.err.println(" Digite um valor entre 0 e 6: ");
                    }
                } while (notaDois[i] < 1 || notaDois[i] > 6);
            }
            System.out.println("Soma das duas notas de cada aluno ");

            for (int i = 0; i < soma.length; i++) {
                soma[i] = notaUm[i] + notaDois[i];

                System.out.println("Aluno " + (i + 1) + " " + soma[i]);
            }
        }
    }
}
