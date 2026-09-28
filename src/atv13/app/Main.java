package atv13.app;
import atv13.servico.MeioPagamento;
import atv13.servico.CartaoCredito;
import atv13.servico.Pix;

public class Main {
    public static void realizarCompra(MeioPagamento meio, double valor){
        boolean aprovado = meio.processarPagamento(valor);

        if (aprovado) {
            System.out.println("Compra realizada!");
        } else {
            System.out.println("Compra não realizada!");
        }
    }
    public static void main(String[] args) {

        CartaoCredito cartao = new CartaoCredito();
        Pix pix = new Pix();

        realizarCompra(cartao, 500);
        realizarCompra(pix, 500);
    }
}
