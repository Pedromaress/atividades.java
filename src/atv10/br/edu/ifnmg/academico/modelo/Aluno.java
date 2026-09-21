package atv10.br.edu.ifnmg.academico.modelo;

public class Aluno {
    private String matricula;
    public String nome;
    private double mediaGeral;

    public Aluno(String matricula, String nome, double mediaGeral){
        this.matricula = matricula;
        this.nome = nome;
        this.mediaGeral = mediaGeral;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMediaGeral() {
        return mediaGeral;
    }

    public void setMediaGeral(double mediaGeral) {
        this.mediaGeral = mediaGeral;
    }
    public boolean estaAprovado(){
        if(mediaGeral>=60){
            return true;
        }else{
            return false;
        }
    }
}
