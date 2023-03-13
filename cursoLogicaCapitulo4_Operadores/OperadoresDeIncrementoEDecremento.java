package cursoLogicaCapitulo4_Operadores;

import java.util.Scanner;

public class OperadoresDeIncrementoEDecremento {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
        }

        /*
         * Integer numero = 10;
         * System.out.println("Numero antes " + numero);
         * ++numero;
         * 
         * System.out.println("Numero depois " + numero);
         */

        // Integer numero = 10;
        // Integer numero02 = ++numero;
        // Integer numero02 = numero++;
        // System.out.println("Numero: " + numero + " ," + " numero02 " + numero02 );

        
        Integer numero = 10;
        Integer numero02 = numero--;

        System.out.println("Numero:" + numero + " numero 2: "+ numero02);
    
    }
}
