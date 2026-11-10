package atv16.modelo;

import java.io.Serializable;

public abstract class Veiculo implements Serializable{

    private static final long serialVersionUID = 1L;

    protected String placa;
    protected String modelo;
    protected double valorDiaria;

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public Veiculo(String placa, String modelo, double valorDiaria){
        if (valorDiaria <= 0) {
            throw new IllegalArgumentException("O valor da diária deve ser maior que zero!");
        }
        this.placa = placa;
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
    }
    public abstract double calcularAluguel(int dias);
}
