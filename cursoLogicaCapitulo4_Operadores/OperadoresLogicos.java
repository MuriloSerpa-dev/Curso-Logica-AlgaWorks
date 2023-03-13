package cursoLogicaCapitulo4_Operadores;

import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite o valor do produto: ");
            Double valorProduto = entrada.nextDouble();

            Boolean carrinhoMaiorQue100 = valorProduto >= 100;
            Boolean periodoDePromocao = true;
            Boolean jaFezCompraNaLoja = true;
            Boolean pagamentoAVista = true;
            //Boolean aplicarDesconto = carrinhoMaiorQue100 && periodoDePromocao && jaFezCompraNaLoja;
      // Boolean aplicarDesconto = carrinhoMaiorQue100 || periodoDePromocao;
      Boolean aplicarDesconto = periodoDePromocao && (carrinhoMaiorQue100 || jaFezCompraNaLoja) && pagamentoAVista;

            if (aplicarDesconto) {
                System.out.println(" Sim! aplique desconto. ");
            } else {
                System.out.println("Desconto não aplicado");

            }
            System.out.println(valorProduto);
        }

    }
}
