package atv14.modelo;

import atv14.excecao.EstoqueInsuficienteException;

public class Produto {

    private String nome;
    private int quantidadeEstoque;

    public Produto(String nome, int quantidadeEstoque) {
        if (quantidadeEstoque < 0) {
            throw new IllegalArgumentException("Estoque inicial não pode ser negativo");
        }
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void darBaixa(int qtd) throws EstoqueInsuficienteException {
        if (qtd <= 0) {
            throw new IllegalArgumentException("Quantidade de baixa deve ser maior que zero");
        }
        if (qtd > quantidadeEstoque) {
            throw new EstoqueInsuficienteException("Quantidade de estoque insuficiente");
        }
        quantidadeEstoque -= qtd;
    }
}