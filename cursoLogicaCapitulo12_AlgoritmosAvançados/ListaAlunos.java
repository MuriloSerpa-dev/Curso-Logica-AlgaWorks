package cursoLogicaCapitulo12_AlgoritmosAvançados;

public class ListaAlunos {
    static final int QUANTIDADE_LISTA = 2;
    int tamanhoLista = 0;
    Aluno[] lista = new Aluno[QUANTIDADE_LISTA];
    
        Aluno obter(int indice) {
            return lista[indice];
        }
        int tamanho(){
            return tamanhoLista;
        }

     void adicionar(Aluno aluno) {
        if (lista.length == tamanhoLista) {
            
        }
       lista[tamanhoLista] = aluno;
        tamanhoLista ++;
    }
}
