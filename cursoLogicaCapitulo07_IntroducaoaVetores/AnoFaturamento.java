package cursoLogicaCapitulo07_IntroducaoaVetores;

public class AnoFaturamento {
    public static void main(String[] args) {
        Double[] mesUm = new Double[] { 1000.0, 1500.0, 1250.0, 2100.0 };
        Double[] mesDois = new Double[] { 1050.0, 2500.0, 4250.0, 1100.0 };
        Double[] mesTres = new Double[] { 1700.0, 1300.0, 1450.0, 2000.0 };
        Double[] mesQuatro = new Double[] { 2000.0, 1300.0, 1450.0, 2000.0 };
        Double[] mesCinco = new Double[] { 2100.0, 1600.0, 1850.0, 2100.0 };
        Double[] mesSeis = new Double[] { 2100.0, 1600.0, 1850.0, 2100.0 };
        Double[] mesSete = new Double[] { 900.0, 1600.0, 1850.0, 1100.0 };
        Double[] mesOito = new Double[] { 1300.0, 1600.0, 850.0, 2150.0 };
        Double[] mesNove = new Double[] { 100.0, 1600.0, 1850.0, 200.0 };
        Double[] mesDez = new Double[] { 2100.0, 1600.0, 1850.0, 2100.0 };
        Double[] mesOnze = new Double[] { 3100.0, 1600.0, 50.0, 2200.0 };
        Double[] mesDoze = new Double[] { 1100.0, 1600.0, 1250.0, 2300.0 };

        Double[][] meses = new Double[][] { mesUm, mesDois, mesTres, mesQuatro, mesCinco, mesSeis, mesSete, mesOito,
                mesNove, mesDez, mesOnze, mesDoze };

        Double mesComMaiorFaturamento = 0.0;
        Integer mesGanhador = 0;

        for (int i = 0; i < meses.length; i++) {

            Double[] semanas = meses[i];
            Double faturamentoMes = 0.0;

            for (int j = 0; j < semanas.length; j++) {
                faturamentoMes += semanas[j];

                boolean resultadoMelhorMes = faturamentoMes > mesComMaiorFaturamento;

                if (resultadoMelhorMes) {
                    mesComMaiorFaturamento = faturamentoMes;
                    mesGanhador = i + 1;
                }

            }
        }
        System.err.println(" Mes ganhador é o " + mesGanhador + "° " + mesComMaiorFaturamento);

    }
}
