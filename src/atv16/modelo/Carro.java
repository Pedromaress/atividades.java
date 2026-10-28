package atv16.modelo;

public class Carro extends Veiculo{
    private int numeroPortas;
    public Carro(String placa ,String modelo,double valorDiaria,int numeroPortas){
        super(placa, modelo, valorDiaria);
        this.numeroPortas = numeroPortas;
    }
    @Override
    public double calcularAluguel(int dias){
        // 50 é uma taxa obrigatoria de limpeza
        return (valorDiaria * dias) + 50.0;
    }
}
