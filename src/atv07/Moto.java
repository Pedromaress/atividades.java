package atv07;

public class Moto extends Veiculo{
    private int cilindradas;
    double precoDeVenda;
    public Moto(String marca, String modelo, double precoBase,int cilindradas){
        super(marca,modelo,precoBase);
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularPrecoVenda() {
        if (cilindradas > 250){
          precoDeVenda = precoBase * 1.15;//recebe acréscimo de 15%
        }
        return precoDeVenda;
    }
}
