package atv12.servico;

import atv12.modelo.Veiculo;
import java.util.ArrayList;

public class GerenciadorVeiculos {
   private ArrayList<Veiculo> veiculos = new ArrayList<>();

    public void cadastrar(Veiculo veiculoNovo){
        veiculos.add(veiculoNovo);
    }
    public void listarTodos(){
        for(Veiculo a: veiculos){
            System.out.println("Id:"+a.getId()+
                                "\nplaca:" +a.getPlaca() +
                                "\nModelo:" +a.getModelo()+
                                "\nDiaria:" +a.getValorDiaria());
        }
    }
    public void buscarPorPlaca(String placa){
        for(Veiculo a: veiculos){
            if(a.getPlaca().equals(placa)){
                System.out.println("Id:"+a.getId()+
                        "\nplaca:" +a.getPlaca() +
                        "\nModelo:" +a.getModelo()+
                        "\nDiaria:" +a.getValorDiaria());
            }
        }
    }
    public void atualizarDiaria(int id,double novaDiaria){
        for(Veiculo a: veiculos){
            if(a.getId() == id){
                a.setValorDiaria(novaDiaria);
            }
        }
    }
    public void removerPorId(int id){
            veiculos.removeIf(a -> a.getId() == id);
    }
}
