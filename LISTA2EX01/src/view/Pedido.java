package view;

import java.util.ArrayList;
import java.util.List;

class Pedido {
    private List<ItemPedido> itens = new ArrayList<>();
    private int numeroNota;
    
    public Pedido() {
    	this.numeroNota = 0;
    }

    public void adicionarItem(Produto produto, int quantidade) {
        itens.add(new ItemPedido(produto, quantidade));
    }
    
    public int getNumeroNota() {
		return this.numeroNota;
    }
    public void setNumeroNota(int numeroNota) {
		this.numeroNota = numeroNota;
    }

    public double getValorTotal() {
    	double total = 0.0 ;
        for (ItemPedido item : itens) {
            total += item.getQuantidade() * item.getProduto().getValor();
        }
        return total;
    }
}
