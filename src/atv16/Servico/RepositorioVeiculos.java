package atv16.Servico;
import atv16.modelo.Veiculo;
import atv16.excecao.VeiculoNaoEncontradoException;
import java.util.ArrayList;

public interface RepositorioVeiculos {

        void adicionar(Veiculo v);

        ArrayList<Veiculo> listarTodos();

        Veiculo buscarPorPlaca(String placa) throws VeiculoNaoEncontradoException;

        void removerPorPlaca(String placa) throws VeiculoNaoEncontradoException;

    }
