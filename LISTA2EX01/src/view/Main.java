package view;


public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto(10, 20.10,"calca");
        Produto produto2 = new Produto(20, 50.0, "calca cara");

        Pedido pedido = new Pedido();
        pedido.adicionarItem(produto1, 2);
        pedido.adicionarItem(produto2, 1);

        System.out.println("Valor total do pedido: " + pedido.getValorTotal());
    }
}



