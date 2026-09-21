package atv09;

public class Produto {
    private int id;
    private String nome;
    private double preco;
    private static int geradorId = 1000;
    private static int quantidadeTotalProdutos = 0;

    public Produto(String nome, double preco){
        id = geradorId;
        this.nome = nome;
        this.preco = preco;
        geradorId++;
        quantidadeTotalProdutos++;
    }
    public static int getQuantidadeTotalProdutos(){
        return quantidadeTotalProdutos;
    }
    public void exibirDados(){
        System.out.println("Id:" +id);
        System.out.println("Nome:" +nome);
        System.out.println("Preço:" +preco);
        MoedaUtils.formatarBRL(preco);
    }
}
