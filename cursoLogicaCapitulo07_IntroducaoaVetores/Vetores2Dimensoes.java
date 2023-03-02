package cursoLogicaCapitulo07_IntroducaoaVetores;

public class Vetores2Dimensoes {
    public static void main(String[] args) {
        Double faturamentoDia = 1000.0;

        Double[] faturamentoJaneiro = new Double[]{1500.0, 2000.0, 1700.0, 7000.0};
        Double[] faturamentoFevereiro = new Double[]{2500.0, 3000.0, 700.0};
        Double [] faturamentoMarco = new Double[]{3500.0, 2500.0, 1200.0, 1000.0};
         Double[][] faturamentoAnual = new Double[][] {faturamentoJaneiro, faturamentoFevereiro, faturamentoMarco}; 
        // System.out.println("Faturamento segundo dia de fevereiro: " + faturamentoAnual[1][1]);    
    
        for (int i = 0; i < faturamentoAnual.length; i++) {
            System.out.println(" mês : " + (i + 1));
            Double[] mes = faturamentoAnual[i];
            
            for (int j = 0; j < mes.length; j++) {
                Double dia = mes[j]; //Double dia = faturamentoAnual[i][j]; 

               System.out.println(" Dia " + (j + 1) + " dia " + dia);
            }
        }
    }
} 

