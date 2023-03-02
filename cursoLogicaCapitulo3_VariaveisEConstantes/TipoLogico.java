package cursoLogicaCapitulo3_VariaveisEConstantes;

import java.util.Scanner;

public class TipoLogico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Boolean variavelVerdadeira = true;
        System.out.println(" Variavel verdadeira : " + variavelVerdadeira);

        boolean variavelFalsa = false;
        System.out.println(" Variavel falsa : " + variavelFalsa);

        System.out.println(" --------------------------------");

        System.out.println(" Digite sua idade : ");
        int idade = entrada.nextInt();
        

        if (idade >= 18) {
            System.out.println(" Você é maior de idade pode tirar CNH");
        } else {
            System.out.println(" Você é menor de idade NÂO podetirar CNH ");
        }

        System.out.println(" ---------------------------------------- ");
        
        Boolean podeTirarCarteira = idade >= 18;

        System.out.println(" Pode tirar carteira ? " + podeTirarCarteira);

    }
}
