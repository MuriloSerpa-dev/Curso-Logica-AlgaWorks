package cursoLogicaCapitulo06_Iteracao;

public class numerosDivisiveisPorTres {
    static final Integer DIVISOR = 3;

    public static void main(String[] args) {
        Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        for (int i = 0; i < numeros.length; i++) {

            Integer numeroPosicao = numeros[i];
            Integer moduloPorTresInteger = numeroPosicao % DIVISOR;

            if (moduloPorTresInteger.equals(0)) {
                System.out.println(" O numero " + numeroPosicao + " é Divisivel por tres");

            }
        }
    }
}