package cursoLogicaCapitulo4_Operadores;

import java.util.Scanner;

public class GastosFamiliar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Double total = 0.0;

        System.out.println("Digite o valor da conta de luz: ");
        total += entrada.nextDouble();
        System.out.println("Digite o valor da conta de agua: ");
        total += entrada.nextDouble();
        System.out.println("Digite o valor da conta de Telefone: ");
        total += entrada.nextDouble();
        System.out.println("Digite o valor da conta de Escola filho: ");
        total += entrada.nextDouble();
        System.out.println("Digite o valor da conta de Cartao: ");
        total += entrada.nextDouble();
        System.out.println("Digite o valor da conta de Supermercado: ");
        total += entrada.nextDouble();
        System.out.println(" Digite o valor de compras ");
        total += entrada.nextDouble();

        
        
        System.out.println(total);
    }
}
