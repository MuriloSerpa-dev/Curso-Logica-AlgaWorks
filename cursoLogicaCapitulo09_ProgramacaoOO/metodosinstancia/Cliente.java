package cursoLogicaCapitulo09_ProgramacaoOO.metodosinstancia;

public class Cliente {
    String primeiroNome;

    String ultimoNome;

    String telefone;

    String email;

    String obterNomeCompletoDoCLiente() {
        String nomeCompleto = primeiroNome + " " + ultimoNome;
        return nomeCompleto;
    }
    String obterDDD(){
        String ddd = telefone.substring(0,3);
        return ddd;
    }
    
}
