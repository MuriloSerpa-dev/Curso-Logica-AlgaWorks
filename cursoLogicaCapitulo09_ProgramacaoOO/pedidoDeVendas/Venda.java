package cursoLogicaCapitulo09_ProgramacaoOO.pedidoDeVendas;

public class Venda {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.setCodigo("25252525");
        pedido.setDesconto(15);
        pedido.setSubtotal(50);

        System.out.println("Codigo do produto " + pedido.getCodigo() + " vai com um desconto de %" + pedido.getDesconto() + " com um subtotal de $" +
        pedido.getSubtotal() + " um total de $" + pedido.getTotal());
    }
}
