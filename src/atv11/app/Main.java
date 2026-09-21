package atv11.app;
import atv11.servico.CadastroClientes;
import atv11.modelo.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("111","Pedro", true);
        Cliente c2 = new Cliente("222","miko", true);
        Cliente c3 = new Cliente("333","juiu", true);

        CadastroClientes cadastro = new CadastroClientes();
        cadastro.cadastrar(c1);
        cadastro.cadastrar(c2);
        cadastro.cadastrar(c3);

        cadastro.inativarCliente(c2.getCpf());

        cadastro.removerInativos();
        cadastro.listarClientes();
    }
}
