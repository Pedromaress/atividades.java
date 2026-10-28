package atv16.app;

import atv16.modelo.Carro;
import atv16.modelo.Moto;
import atv16.modelo.Veiculo;
import atv16.Servico.GerenciadorFrota;
import atv16.excecao.VeiculoNaoEncontradoException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        GerenciadorFrota frota = new GerenciadorFrota();

        int opcao;
        String Splaca;
        String Smodelo;
        double SvalorDiaria;
        int tpVeiculo;

        //roda menu
        do {
            System.out.println("-------MENU------ \n" +
                    "1 - Cadastrar Veiculo \n" +
                    "2 - Listar Frota \n" +
                    "3 - Simualr aluguel por placa \n" +
                    "4 - Remover Veiculo por Placa \n" +
                    "5 - Sair");
            opcao = scan.nextInt();
            //apenas pra quebrar o enter para os proximos scans
            scan.nextLine();


            switch (opcao) {
                case 1:
                    try {
                        System.out.println("Qual Veiculo Deseja Cadastrar? (1- carro  2- moto)");
                        tpVeiculo = scan.nextInt();
                        scan.nextLine();

                        System.out.println("Digite a placa:");
                        Splaca = scan.nextLine();
                        System.out.println("Digite o modelo:");
                        Smodelo = scan.nextLine();
                        System.out.println("Digite o valor da diária:");
                        SvalorDiaria = scan.nextDouble();
                        Veiculo veiculo;

                        // verificaçao das especificações de cada tipo de veiculo
                        if (tpVeiculo == 1) {
                            System.out.println("Digite o numero de portas:");
                            int numeroDePortas = scan.nextInt();
                            if (numeroDePortas <= 0) {
                                throw new IllegalArgumentException("O numero de portas deve ser positivo");
                            }
                            veiculo = new Carro(Splaca, Smodelo, SvalorDiaria, numeroDePortas);
                        } else if (tpVeiculo == 2) {
                            System.out.println("Digite quantas cilindradas:");
                            int numeroiDeCilindradas = scan.nextInt();
                            if (numeroiDeCilindradas <= 0) {
                                throw new IllegalArgumentException("O numero de cilindradas deve ser positivo");
                            }
                            veiculo = new Moto(Splaca, Smodelo, SvalorDiaria, numeroiDeCilindradas);
                        } else {
                            System.out.println("Tipo de veiculo invalido!");
                            break;
                        }
                        frota.adicionar(veiculo);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        if(frota.listarTodos().isEmpty()){
                            System.out.println("A frota está vazia!");
                        }else{
                            for(Veiculo v : frota.listarTodos()){
                                System.out.println("Placa: " + v.getPlaca());
                                System.out.println("Modelo: " + v.getModelo());
                                System.out.println("Valor da diária: R$ " + v.getValorDiaria());
                                System.out.println("------------------------");
                            }
                        }
                    } catch (IllegalStateException e) {
                        System.out.println("Erro " + e.getMessage());
                    }
                    break;

                case 3:
                    try{
                        System.out.println("Qual a placa do veículo?");
                        Splaca = scan.nextLine();
                        System.out.println("Digite a quantidade de dias que ficou com o veículo:");
                        int SdiasUltilizados = scan.nextInt();

                        //verifico se não tem argumento errado após o scan
                        if (SdiasUltilizados <= 0) {
                            throw new IllegalArgumentException(
                                    "A quantidade de dias deve ser maior que zero!");
                        }

                        /*crio um veiculo que "copia" o veiculo que busca por placa pq a função buscar veiculo retorna
                        um veículo completo com todas as info.*/
                        Veiculo veiculos= frota.buscarPorPlaca(Splaca);

                        /*uso a função de calcular aluguel e ela calcula de acordo com o tipo do veículo já que é abstrato*/
                        double valor = veiculos.calcularAluguel(SdiasUltilizados);

                        System.out.printf("Valor total do aluguel: R$ %.2f%n", valor);


                    } catch (VeiculoNaoEncontradoException e) {
                        System.out.println(e.getMessage());

                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                case 4:
                    try{
                        //primeiro pego a placa
                        System.out.println("Digite a placa do veículo que deseja remover:");
                        Splaca = scan.nextLine();

                        //uso a função que remove o veículo se a placa for igual a alugma de algum veículo da lista
                        frota.removerPorPlaca(Splaca);
                    }catch(VeiculoNaoEncontradoException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    break;
                default:
                    if (opcao != 5) {
                        System.out.println("Opção inválida! Tente novamente.");
                    }
                    break;
            }

        }while(opcao != 5);
    }
}
