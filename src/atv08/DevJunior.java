package atv08;

    public class DevJunior extends Funcionario{
    private double salarioBase;

    public DevJunior(String nome, String cpf,double salarioBase){
        super(nome, cpf);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalarioFinal(){
    return salarioBase;
    };
}
