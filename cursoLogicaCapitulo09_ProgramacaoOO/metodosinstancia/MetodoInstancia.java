package cursoLogicaCapitulo09_ProgramacaoOO.metodosinstancia;

public class MetodoInstancia {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.primeiroNome = "Alexandre";
        cliente.ultimoNome = "Afonso";
        cliente.telefone = "08596880667";
        cliente.email = " alexandre.afonso@email.com";

        Cliente cliente2 = new Cliente();
        cliente2.primeiroNome = "Murilo";
        cliente2.ultimoNome = "Serpa";
        cliente2.telefone = "01197290209";
        cliente2.email = "muriloserpa2@gmail.com";

        System.out.println("Nome cliente: " + cliente.obterNomeCompletoDoCLiente() + ", DDD-" + cliente.obterDDD());
        System.out.println("Nome cliente: " + cliente2.obterNomeCompletoDoCLiente() + ", DD-" + cliente2.obterDDD());

    }

    // static String receberNomeCompletoDoCLiente(Cliente cliente) {
    // String nomeCompleto = cliente.primeiroNome + " " + cliente.ultimoNome;
    // return nomeCompleto;
    // }
}
