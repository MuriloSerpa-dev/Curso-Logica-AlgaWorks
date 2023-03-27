package cursoLogicaCapitulo10_LeituraEEscritaDeDados;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeAtividades {
    public static void main(String[] args) throws IOException {
            Scanner entrada = new Scanner(System.in);
            ArrayList<String> linhas = new ArrayList<String>();

            String atividades;
            int i = 0;
            while (true) {
                System.out.println(" Digite uma atividade - " + ( i + 1 ) + "- ao fim digite X");
                atividades = entrada.nextLine();

                if ("x".equals(atividades)) {
                    break;
                }
                linhas.add(atividades);
                i++;
            }
            escreverNoArquivo("C:/Users/Usuario/Documents/Projetos/listaDeAtividades.txt", linhas);
            entrada.close();
    }
    static void escreverNoArquivo(String arquivo, ArrayList<String> linhas) throws IOException{
        Path path = Paths.get(arquivo);
        Files.write(path, linhas);
    }

}
