package atv08;

import atv08.DevJunior;
import atv08.DevSenior;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new DevJunior("Pedro","6767",1000));
        funcionarios.add(new DevJunior("Miko","7676",1000));
        funcionarios.add(new DevSenior("Laercio","2222",1000,2));

        double folhaDePagamento = 0;
        for(Funcionario f : funcionarios){
            System.out.println("Nome:"+ f.nome +  " Salário final: " + f.calcularSalarioFinal());
            folhaDePagamento = f.calcularSalarioFinal();
            if(f instanceof DevSenior){
                ((DevSenior)f).realizarCodeReview();
            }
        }
    }


}

