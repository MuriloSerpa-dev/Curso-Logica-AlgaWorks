package cursoLogicaCapitulo09_ProgramacaoOO.encapsulamento;

public class Encapsulamento {
    public static void main(String[] args) {
        // Cliente cliente = new Cliente();
// 
        // cliente.nome = " Murilo Serpa";
        // cliente.telefone = " 32745656";
// 
        // System.out.println("Nome cliente: " + cliente.nome);

        Cliente cliente = new Cliente();
        cliente.setNome("Murilo Serpa");
        cliente.setTelefone("85 32745656");

        System.out.println("Nome cliente: " + cliente.getNome() + " telefone cliente: " + cliente.getTelefone());
        System.out.println("primeiro nome: " + cliente.getPrimeiroNome());
        System.out.println("Ultimo nome: " + cliente.getUltimoNome());
    }
}
