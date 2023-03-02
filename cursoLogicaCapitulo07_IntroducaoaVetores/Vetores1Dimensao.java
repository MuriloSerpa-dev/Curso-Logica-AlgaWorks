package cursoLogicaCapitulo07_IntroducaoaVetores;

import java.util.Scanner;

public class Vetores1Dimensao {
    public static void main(String[] args) {

        // String[] cardapio = new String[]{"Carne", "Calabresa", "Atum", "Misto"};
        // System.out.println(" Escolha o sabor : ");
        //
        // for(int i = 0; i < cardapio.length ; i++ ){
        // System.out.println("> (" + i +") " + cardapio[i] + " <");
        // }
        //
        // System.out.print(" Digite o numero do sabor escolhido: ");
        // Scanner entrada = new Scanner(System.in);
        // Integer saborEscolhido = entrada.nextInt();
        //
        // System.out.println(" Sabor escolhido por voce é : " +
        // cardapio[saborEscolhido]);
        //

        String[] cardapio = new String[4];
        cardapio[0] = " Atum";
        cardapio[1] = " Calabresa";
        cardapio[2] = " Queijo";
        cardapio[3] = " Misto";

        for (int i = 0; i < cardapio.length; i++) {
            System.out.println(cardapio[i]);
        }

    }
}
