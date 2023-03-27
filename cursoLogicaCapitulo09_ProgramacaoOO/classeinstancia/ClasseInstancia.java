package cursoLogicaCapitulo09_ProgramacaoOO.classeinstancia;

public class ClasseInstancia {
    public static void main(String[] args) {
        Produto produto = new Produto();
        //produto.quantidadeMinimaEstoque = 10;

        System.out.println("Quantidade minima estoque: " + Produto.quantidadeMinimaEstoque);

        produto.nome = "Caneca";
        System.out.println("Quantidade minima em estoque = " + Produto.quantidadeMinimaEstoque);

        Produto.quantidadeMinimaEstoque = 11;

        Produto produto2 = new Produto();
        produto2.nome = "Carteira";
        System.out.println("Quantidade minima em estoque = " + Produto.quantidadeMinimaEstoque);

        //System.out.println("Produto 1 " + produto.nome + "\nProduto 2 " + produto2.nome);
        Impressao.informacao("Produto 1: " + produto.nome);
        Impressao.informacao("Produto 2: " + produto2.nome);
    }
}
