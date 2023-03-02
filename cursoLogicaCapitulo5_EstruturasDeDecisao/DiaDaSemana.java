package cursoLogicaCapitulo5_EstruturasDeDecisao;

import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(" Digite o dia da semana de 1 a 7 ");
        Integer diaDaSemana = entrada.nextInt();
        String diaEscolhido = "";

        switch (diaDaSemana) {
            case 1:
                diaEscolhido = " Domingo";
                break;
            case 2:
                diaEscolhido = " segunda";
                break;
            case 3:
                diaEscolhido = " terca";
                break;
            case 4:
                diaEscolhido = " quarta";
                break;
            case 5:
                diaEscolhido = " quinta";
                break;
            case 6:
                diaEscolhido = " sexta";
                break;
            case 7:
                diaEscolhido = " sabado";
                break;

            default:
                // System.err.println("Digite um numero valido! ");
                // System.exit(1);
                diaEscolhido = " Dia invalido.";
        }
        System.out.println("O dia da semana é :" + diaEscolhido );
    }
}
