package cursoLogicaCapitulo06_Iteracao;

public class IteracaoWhile {
     public static void main(String[] args) {
        // for(int i = 0 ; i < 10 ; i++){
            // System.out.println(" Teste " + i);
        // }
            int i = 0;
            while ( i < 10) {

                if( i == 5){
                    System.out.println(" Vai parar " + i);
                    i++;
                    continue;
                }
                System.out.println(" Teste " + i);
                i++;
            }
    }
}
