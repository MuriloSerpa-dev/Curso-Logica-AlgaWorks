package cursoLogicaCapitulo09_ProgramacaoOO.pedidoDeVendas;

public class Pedido {
    String codigo;
    Integer subtotal;
    Integer desconto;
    

    String getCodigo(){
        return codigo;
    }
    void setCodigo(String codigo){
        this.codigo = codigo;
    }
    Integer getSubtotal(){
        return subtotal;
    }
    void setSubtotal(Integer subtotal){
        this.subtotal = subtotal;
    }
    Integer getDesconto(){
        return desconto;
    }
    void setDesconto(Integer desconto){
        this.desconto = desconto;
    }
    Integer getTotal(){
        return subtotal - desconto;
    }
    void setTotal(Integer total){
        
    }
}
