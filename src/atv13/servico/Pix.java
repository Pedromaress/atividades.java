package atv13.servico;

public class Pix implements MeioPagamento {
    String chavePix;

    @Override
    public boolean processarPagamento(double valor){
        if(valor > 0){
            System.out.println("Pagamento aprovado!");
            return true;
        }else {
            System.out.println("Pagamento não aprovado!");
            return false;
        }
    }
}
