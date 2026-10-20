package atv14.app;

import atv14.excecao.EstoqueInsuficienteException;
import atv14.modelo.Produto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Produto produto = new Produto("Caneta", 10);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Quantidade para dar baixa: ");
            int qtd = sc.nextInt();
            produto.darBaixa(qtd);
            System.out.println("Baixa realizada. Estoque atual: " + produto.getQuantidadeEstoque());
        } catch (InputMismatchException e) {
            System.out.println("Erro: digite apenas números inteiros.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (EstoqueInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println("Operação finalizada.");
        }
    }
}