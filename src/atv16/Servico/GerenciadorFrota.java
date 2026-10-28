package atv16.Servico;
import atv16.modelo.Veiculo;
import atv16.excecao.VeiculoNaoEncontradoException;
import java.util.ArrayList;

    public class GerenciadorFrota implements RepositorioVeiculos {
        private ArrayList<Veiculo> frota = new ArrayList<>();

        @Override
        public void adicionar(Veiculo v) {
            frota.add(v);
            System.out.println("Veículo cadastrado com sucesso: " + v.getModelo());
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
            throw new VeiculoNaoEncontradoException("Nenhum veículo encontrado com a placa: " + placa);
        }

        @Override
        public void removerPorPlaca(String placa) throws VeiculoNaoEncontradoException {
            boolean removeu = frota.removeIf(v -> v.getPlaca().equalsIgnoreCase(placa));
            if (!removeu) {
                throw new VeiculoNaoEncontradoException("Falha ao remover. Placa inexistente: " + placa);
            }
            System.out.println("Veículo removido com sucesso!");
        }
    }
