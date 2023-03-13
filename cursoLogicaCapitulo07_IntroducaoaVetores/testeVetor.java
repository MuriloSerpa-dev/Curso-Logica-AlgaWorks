package cursoLogicaCapitulo07_IntroducaoaVetores;

import java.util.Arrays;

public class testeVetor {
    public static void main(String[] args) {
        // String[] mes = new String[] { "janeiro", "Fevereiro", " Marco", " Abril", "Maio", "Junho", "Julho", "Agosto",
                // "Setembro", "Outubro", "Novembro", "Dezembro" };
        // Integer[] dias = new Integer[] { 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30 };
// 
        // for (int i = 0; i < mes.length; i++) {
        // System.out.println(" O mes de: " + mes[i] + " tem o total de dia de " +
        // dias[i]);
        //
        //
        // }
        Integer[] numeros = new Integer[] {5,12,14,3,9,25};
        for (Integer valor : numeros) {
            System.out.println(valor);
        }
        System.out.println(" ");
        Integer posicao = Arrays.binarySearch(numeros,1);
        System.out.println("encontrei o valor na posicao " + posicao);

    }
}
