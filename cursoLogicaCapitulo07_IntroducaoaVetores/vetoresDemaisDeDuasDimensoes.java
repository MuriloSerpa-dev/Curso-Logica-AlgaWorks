package cursoLogicaCapitulo07_IntroducaoaVetores;

public class vetoresDemaisDeDuasDimensoes {

    public static void main(String[] args) {
        Double faturamentoDia = 1000.0;

        Double[] faturamentoJaneiro = new Double[] { 1500.0, 2000.0, 1700.0, 7000.0 };
        Double[] faturamentoFevereiro = new Double[] { 2500.0, 3000.0, 700.0 };
        Double[] faturamentoMarco = new Double[] { 3500.0, 2500.0, 1200.0, 1000.0 };
        Double[] faturamentoAbril = new Double[] { 3500.0, 2500.0, 1200.0, 1000.0 };
        Double[] faturamentoMaio = new Double[] { 1500.0, 2500.0, 1200.0, 1000.0 };
        Double[] faturamentoJunho = new Double[] { 4500.0, 2500.0, 1200.0, 1000.0 };

        Double[][] faturadoPrimeiroTrismestre = new Double[][] { faturamentoJaneiro, faturamentoFevereiro,
                faturamentoMarco };
        Double[][] faturadoSegundoTrimestre = new Double[][] { faturamentoAbril, faturamentoMaio, faturamentoJunho };
        Double[][][] faturadoTrimestre = new Double[][][] { faturadoPrimeiroTrismestre, faturadoSegundoTrimestre };
        // System.out.println(faturadoTrimestre[0][1][0]);

        Double maiorFaturamento = 0.0;
        Integer mesGanhador = 0;

        for (int i = 0; i < faturadoTrimestre.length; i++) {

            Double[][] trismestre = faturadoTrimestre[i];

            for (int j = 0; j < trismestre.length; j++) {

                Double[] mes = trismestre[j];
                Double faturamentoMes = 0.0;

                for (int y = 0; y < mes.length; y++) {
                    faturamentoMes += mes[y];
                }

                Boolean resultadoMaiorMes = faturamentoMes > maiorFaturamento;
                //
                if (resultadoMaiorMes) {
                    maiorFaturamento = faturamentoMes;
                    mesGanhador = j + 1;
                }
            }

        }
        System.out.println(mesGanhador + "° mes de maior faturamento é " + maiorFaturamento);

    }

}
