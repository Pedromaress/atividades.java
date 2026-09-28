package atv13.servico;

public class CartaoCredito implements MeioPagamento{

   double limiteDisponivel;

   @Override
    public boolean processarPagamento(double valor){
        if(valor <= limiteDisponivel){
            System.out.println("Pagamento aprovado!");
            return true;
        }
        else{
            System.out.println("Pagamento nao aprovado!");
            return false;
        }
    }
}
