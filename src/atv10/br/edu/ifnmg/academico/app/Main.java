package atv10.br.edu.ifnmg.academico.app;
import atv10.br.edu.ifnmg.academico.modelo.Aluno;
public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("121","Pedro",70);
        Aluno aluno2 = new Aluno("131","Miko",50);

        System.out.println("Nome: " + aluno1.getNome() +
                            "\nMatrícula: " + aluno1.getMatricula());
        if(aluno1.estaAprovado()){

            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
        System.out.println("Nome: " + aluno2.getNome() +
                "\nMatrícula: " + aluno2.getMatricula());
        if(aluno2.estaAprovado()){

            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
    }
}
