package atv16.Servico;

import atv16.excecao.VeiculoNaoEncontradoException;
import atv16.modelo.Veiculo;

import java.util.ArrayList;

public class GerenciadorFrota implements RepositorioVeiculos {

    private ArrayList<Veiculo> frota = new ArrayList<>();

    @Override
    public void adicionar(Veiculo v) {
        frota.add(v);
    }

    @Override
    public ArrayList<Veiculo> listarTodos() {
        return frota;
    }

    @Override
    public Veiculo buscarPorPlaca(String placa) throws VeiculoNaoEncontradoException {
        for (Veiculo v : frota) {
            if (v.getPlaca().equalsIgnoreCase(placa)) {
                return v;
            }
        }
        throw new VeiculoNaoEncontradoException("Veículo com a placa " + placa + " não encontrado!");
    }

    @Override
    public void removerPorPlaca(String placa) throws VeiculoNaoEncontradoException {
        Veiculo v = buscarPorPlaca(placa);
        frota.remove(v);
    }
}