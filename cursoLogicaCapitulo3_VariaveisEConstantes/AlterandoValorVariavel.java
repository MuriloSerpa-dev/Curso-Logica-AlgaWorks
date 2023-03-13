package cursoLogicaCapitulo3_VariaveisEConstantes;

import java.util.Scanner;

public class AlterandoValorVariavel {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            final Double pagamentoPrazoJuros = 10.0;
            final Double pagamentoDebitoJuros = 5.0;

            System.out.print(" Digite o valor do produto: ");
            Double valorProduto = entrada.nextDouble();

            System.out.print(" Digite o tipo de pagamento [1 = á vista / 2 = a prazo / 3 = debito]: ");
            Integer tipoPagamento = entrada.nextInt();

            Boolean pagamentoAvista = tipoPagamento.equals(1);

            Double juros = 0.0;
            
            if (pagamentoAvista) {

            } else if (tipoPagamento == 2) {
                juros = pagamentoPrazoJuros;
            } else {
               juros = pagamentoDebitoJuros;
            }
            Double acrescimo = valorProduto * juros / 100;
            Double valorTotal = valorProduto + acrescimo;

            System.out.println(" Valor total produto: " + valorTotal);
        }

    }
}
