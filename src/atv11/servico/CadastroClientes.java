package atv11.servico;

import atv11.modelo.Cliente;

import java.util.ArrayList;

public class CadastroClientes {
    ArrayList<Cliente> listaClientes = new ArrayList<>();

    public void cadastrar(Cliente c){
        listaClientes.add(c);
    }
    public Cliente buscarPorCpf(String cpf){
        for(Cliente c : listaClientes){
            if(c.getCpf().equals(cpf)){
                return c;
            }
        }
        return null;
    }
    public void inativarCliente(String cpf){
        for(Cliente c : listaClientes){
            if (c.getCpf().equals(cpf)){
                c.setAtivo(false);
            }
        }
    }
    public void removerInativos(){
            listaClientes.removeIf(c -> !c.getAtivo());
    }
    public void listarClientes() {
        for (Cliente c : listaClientes) {
            System.out.println(
                    "CPF: " + c.getCpf() +
                            "  Nome: " + c.getNome() +
                            "  Ativo: " + c.getAtivo()
            );
        }
    }
}
