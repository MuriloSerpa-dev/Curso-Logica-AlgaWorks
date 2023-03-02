package cursoLogicaCapitulo07_IntroducaoaVetores;

public class CadastroTarefasDoDia {
    public static void main(String[] args) {
        String[] tarefas = new String[]{" Deixar na escola", "Estudar", "Treinar","Ir a academia", "Estudar Novamente"};

        for(int i =0; i < tarefas.length; i++){
            System.out.println( i +"° " + tarefas[i]);
        }
    }
}
