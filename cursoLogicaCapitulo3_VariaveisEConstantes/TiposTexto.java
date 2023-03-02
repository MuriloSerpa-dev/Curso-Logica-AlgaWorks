package cursoLogicaCapitulo3_VariaveisEConstantes;

import java.util.Scanner;

public class TiposTexto {
    public static void main (String[] args){
            Scanner entrada = new Scanner(System.in);

            System.out.println(" Digite o primeiro nome");
            String nome = entrada.nextLine();

            System.out.println(" Digite o seu sobre-nome : ");
            String sobreNome = entrada.nextLine();

            String nomeCompleto = nome + " " + sobreNome;

            System.out.println(" Seu nome completo é " + nomeCompleto);
            

    }
}