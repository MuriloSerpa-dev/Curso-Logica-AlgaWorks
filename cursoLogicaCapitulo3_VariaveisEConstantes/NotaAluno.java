package cursoLogicaCapitulo3_VariaveisEConstantes;

import java.util.Scanner;

public class NotaAluno {
        public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Digite a nota do aluno: ");
            Integer notaAluno = entrada.nextInt();

            final Integer notaAprovacaoMinima = 70; 

            boolean NotaAprovacao = notaAluno >= notaAprovacaoMinima ;  
            
            if (NotaAprovacao){
                System.out.println(" Acima da media ");

            } else {
                System.out.println(" Abaixo da media");
            }
        }


    }
}
