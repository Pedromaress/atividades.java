package atv07;

public class Veiculo {
    protected String marca;
    protected String modelo;
    protected double precoBase;

    public Veiculo(String marca, String modelo, double precoBase){
        this.marca = marca;
        this.modelo = modelo;
        this.precoBase = precoBase;
    }
    public double calcularPrecoVenda(){
        return precoBase;
    }
}
