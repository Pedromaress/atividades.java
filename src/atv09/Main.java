package atv09;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Monitor",1000);
        Produto produto2 = new Produto("Teclado", 250);
        Produto produto3 = new Produto("Mouse", 200);

        produto1.exibirDados();
        produto2.exibirDados();
        produto3.exibirDados();
        System.out.println(Produto.getQuantidadeTotalProdutos());

    }
}