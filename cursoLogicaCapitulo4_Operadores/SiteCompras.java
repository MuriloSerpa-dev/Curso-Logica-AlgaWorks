package cursoLogicaCapitulo4_Operadores;

import java.util.Scanner;

public class SiteCompras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(" Digite o valor do produto : ");
        Double valorProduto = entrada.nextDouble();

        
        Boolean valorProdutoAbaixoDeCem = valorProduto < 100;
        
        Double valorTotal = valorProduto;

        if(valorProdutoAbaixoDeCem){
            valorTotal += 15.0;
        }


        System.out.println(" Sua compra saiu no valor de = " + valorTotal);
    }
}
