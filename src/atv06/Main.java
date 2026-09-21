package atv06;

public class Main {
    public static void main(String[] args) {
        Produto Teclado = new Produto("teclado", 150);
        Produto Mouse = new Produto("mouse", 100);
        Produto Monitor = new Produto("monitor", 200);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras("Pedro");

        carrinho.adicionarProduto(Teclado);
        carrinho.adicionarProduto(Mouse);
        carrinho.adicionarProduto(Monitor);

        System.out.println("Valor total:" + carrinho.calcularTotal());
    }
}