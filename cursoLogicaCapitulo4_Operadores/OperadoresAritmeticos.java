package cursoLogicaCapitulo4_Operadores;

import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println(" Digite um numero ");
            Integer numeroRecebido = entrada.nextInt();

            System.out.println(" Digite um numero ");
            Integer segundoNumeroRecebido = entrada.nextInt();
   
            Integer adicao = numeroRecebido + segundoNumeroRecebido;
            Integer subtracao = numeroRecebido - segundoNumeroRecebido;
            Integer multiplicacao = numeroRecebido * segundoNumeroRecebido;
            Integer divisao = numeroRecebido / segundoNumeroRecebido;
            
            System.out.println(adicao + " / " + subtracao + " / " + multiplicacao + " / " + divisao);
        }

        Integer precedencia =( 1 + 1 )* 5 * 5;

        System.out.println(precedencia);
        
        Integer precedencia02 = 1 + 1 * 5;
        System.out.println(precedencia02);
        
        Integer precedencia03 = 1 + 1 * 5 * 5;
        System.out.println(precedencia03);

        Integer precedencia04 = 5 * (1 + 1) + 2;
        System.out.println(precedencia04);

        Integer precedencia05 = 5 * ((1 + 1) +2);
        System.out.println(precedencia05);

        Integer cinco = 5;
        Integer um = 1;
        
        Integer precedenciaComVariaveis = cinco * (um + um);
        System.out.println(precedenciaComVariaveis);
    }
}
