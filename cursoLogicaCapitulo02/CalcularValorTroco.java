package cursoLogicaCapitulo02;
import java.util.Scanner;


public class CalcularValorTroco {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

				System.out.println("Digite o valor do produto:");
			Double valorProduto = scanner.nextDouble();
			
				System.out.println("Digite o valor recebido");
			Double valorRecebiddo = scanner.nextDouble();

				
			Double resultado = valorRecebiddo - valorProduto;

			System.out.println( "Valor troco = " + resultado);

			scanner.close();
		}
	}

