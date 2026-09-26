package atv12.app;

import atv12.modelo.Veiculo;
import atv12.servico.GerenciadorVeiculos;
import java.util.Scanner;

    public class Main{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            GerenciadorVeiculos gerenciador = new GerenciadorVeiculos();
            int opcao;

            do {
                System.out.println("\n===== MENU =====");
                System.out.println("1 - Cadastrar veiculo");
                System.out.println("2 - Listar todos");
                System.out.println("3 - Buscar por placa");
                System.out.println("4 - Atualizar diaria");
                System.out.println("5 - Remover por id");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opcao: ");
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        Veiculo v = new Veiculo();
                        System.out.print("Id: ");
                        v.setId(sc.nextInt());
                        sc.nextLine();
                        System.out.print("Placa: ");
                        v.setPlaca(sc.nextLine());
                        System.out.print("Modelo: ");
                        v.setModelo(sc.nextLine());
                        System.out.print("Valor diaria: ");
                        v.setValorDiaria(sc.nextDouble());
                        sc.nextLine();
                        gerenciador.cadastrar(v);
                        System.out.println("Veiculo cadastrado!");
                        break;

                    case 2:
                        gerenciador.listarTodos();
                        break;

                    case 3:
                        System.out.print("Placa: ");
                        String placa = sc.nextLine();
                        gerenciador.buscarPorPlaca(placa);
                        break;

                    case 4:
                        System.out.print("Id: ");
                        int id = sc.nextInt();
                        System.out.print("Nova diaria: ");
                        double novaDiaria = sc.nextDouble();
                        sc.nextLine();
                        gerenciador.atualizarDiaria(id, novaDiaria);
                        break;

                    case 5:
                        System.out.print("Id: ");
                        int idRemover = sc.nextInt();
                        sc.nextLine();
                        gerenciador.removerPorId(idRemover);
                        System.out.println("Removido (se existia).");
                        break;

                    case 0:
                        System.out.println("Saindo...");
                        break;

                    default:
                        System.out.println("Opcao invalida");
                }
            } while (opcao != 0);

            sc.close();
        }
    }
