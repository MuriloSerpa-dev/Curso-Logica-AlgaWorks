package cursoLogicaCapitulo3_VariaveisEConstantes;

import java.util.Scanner;

public class CompraProduto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println(" Digite o valor do produto: ");
        Double valorProduto = entrada.nextDouble();

        System.out.println(" Digite a quantidade desejada ");
        Integer quantidadeDesejada = entrada.nextInt();

        Double desconto = 0.0; 

        Double subTotal = valorProduto * quantidadeDesejada;

        Boolean quantidadeMaiorQueDez = quantidadeDesejada >= 10;
        if ( quantidadeMaiorQueDez){
            desconto = 10.0;
        }
        
        Double acrescimoAcimaDeDez = subTotal * desconto / 100;
        Double valorTotal = subTotal - acrescimoAcimaDeDez;

        System.out.println(" Valor total com desconto é de : " + valorTotal);

    }
}
