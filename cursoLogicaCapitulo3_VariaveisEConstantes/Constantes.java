package cursoLogicaCapitulo3_VariaveisEConstantes;

import java.util.Scanner;

public class Constantes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final Integer idadeMinimaParaTirarCarteira = 18;

        System.out.println(" Idade: ");
        Integer idade = entrada.nextInt();

        Boolean podeTirarCarteira = idade >= idadeMinimaParaTirarCarteira;

        if (podeTirarCarteira) {
            System.out.println(" Sim pode tirar carteira");
        } else {
            System.out.println(" Não pode tirar carteira");
        }
    }
}
