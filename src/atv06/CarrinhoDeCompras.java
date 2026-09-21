package atv06;

import java.util.ArrayList;

public class CarrinhoDeCompras {
    private String cliente;
    private ArrayList<Produto> produtos;

    public CarrinhoDeCompras(String cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }
    public double calcularTotal(){
        double total = 0;
        for(Produto produto : produtos){
            total += produto.getPreco();
        }
        return total;
    }
}