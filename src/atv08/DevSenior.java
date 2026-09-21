package atv08;

    public class DevSenior extends Funcionario{
    private double salarioBase;
    private int horasExtras;

    public DevSenior(String nome, String cpf, double salarioBase, int horasExtras){
            super(nome, cpf);
            this.salarioBase = salarioBase;
            this.horasExtras = horasExtras;
    }
    @Override
    public double calcularSalarioFinal(){
        return salarioBase = salarioBase + (80 * horasExtras);
    }
    public void realizarCodeReview(){
        System.out.println("O dev Senior " + nome + "esta revisando o código");
    }
}
