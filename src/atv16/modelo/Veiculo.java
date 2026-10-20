package atv16.modelo;

public abstract class Veiculo {
    protected String placa;
    protected String modelo;
    protected double valorDiaria;

    public Veiculo(String placa, String modelo,double valorDiaria){
        if (valorDiaria <= 0) {
            throw new IllegalArgumentException("O valor da diária deve ser maior que zero!");
        }
        this.placa = placa;
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
    }
    public abstract double calcularAluguel(int dias);
}
