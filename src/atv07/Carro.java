package atv07;

public class Carro extends Veiculo{
    private int quantidadePortas;

    public Carro(String marca, String modelo, double precoBase,int quantidadePortas){
        super( marca,modelo,precoBase);
        this.quantidadePortas = quantidadePortas;
    }
}
