package cursoLogicaCapitulo06_Iteracao;

public class iteracaoFor {
    public static void main(String[] args) {

        // for (int i = 1; i <= 5; i++) {
        // System.out.println(" Teste de for " + i);

        // }
        // Double[] carrinhoDeCompras = new Double[] { 50.0, 50.0, 50.0 };
        // Double totalCarrinho = 0.0;
        // for (int i = 0; i < carrinhoDeCompras.length; i++) {
        //
        // totalCarrinho = totalCarrinho + carrinhoDeCompras[i];
        //
        // System.out.println(" Posicao do For " + i + " Valor carrinhoDeCompras: " +
        // totalCarrinho + " + ");
        //
        // }
        // System.out.println("Total comprado = " + totalCarrinho);

        // for (int i = 0; i < 10; i++) {
        // if( i == 5){
        // System.out.println(" vai parar na posição: " + i);
        // break;
        // }
        //
        // System.out.println(" Iteração :" + i);
        // }

        // for (int i = 0; i < 10; i++) {
        // if( i == 5){
        // System.out.println(" vai continuar e pular a posicao " + i);
        // continue;
        // }
        //
        // System.out.println(" Iteração :" + i);
        // }
        Integer[] produtos = new Integer[] { 100, 225, 300, 421, 535 };

        for (int i = 0; i < produtos.length; i++) {
            Integer codigoProdutos = produtos[i];

            System.out.println("Codigo produto " + codigoProdutos );
            if (codigoProdutos.equals(225)) {
                System.out.println(" Produto encontrado");
                break;
            }

        }
        System.out.println();
    }
}
