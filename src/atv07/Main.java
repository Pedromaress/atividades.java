package atv07;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Honda","Civic",1000.0,4);
        Moto moto1 = new Moto("Honda","XRE",250.0, 300);

        System.out.println("Preco Final do carro:" +carro1.calcularPrecoVenda());
        System.out.println("Preco Final da moto:" + moto1.calcularPrecoVenda());
    }
}
