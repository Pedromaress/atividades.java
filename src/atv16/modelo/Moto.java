package atv16.modelo;

public class Moto extends Veiculo{
    private int cilindradas;
    public Moto(String placa, String modelo, double valorDiaria, int cilindradas){
        super(placa,modelo,valorDiaria);
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularAluguel(int dias){
        //valorDiaria*dias
        if(dias > 5){
            return valorDiaria = (valorDiaria - (valorDiaria*0.10) * dias);
        }

        return (valorDiaria * dias);
    }
}
