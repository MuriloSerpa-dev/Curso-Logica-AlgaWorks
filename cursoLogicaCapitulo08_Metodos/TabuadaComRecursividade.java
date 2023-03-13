package cursoLogicaCapitulo08_Metodos;

import java.util.Scanner;

public class TabuadaComRecursividade {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("  >>TABUADA<<    ");
            System.out.println("Informe o numero ");
            Integer numero = entrada.nextInt();
                imprimirTabuada(numero, 0);
        }
    }

    static void imprimirTabuada(Integer multiplicando, Integer multiplicador) {
            System.out.println(multiplicando + " x " + multiplicador + " = " +  (multiplicando * multiplicador));

            if(++multiplicador <= 10){
                imprimirTabuada(multiplicando, multiplicador);
            }
    }
}
