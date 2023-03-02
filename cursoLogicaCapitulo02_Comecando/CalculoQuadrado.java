package cursoLogicaCapitulo02_Comecando;

import java.util.Scanner;

public class CalculoQuadrado {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("digite um valor");
            int valorUm = entrada.nextInt();

   
            int resultadoQuadrado = valorUm * valorUm;
            System.out.println(resultadoQuadrado);
        }
    }
}