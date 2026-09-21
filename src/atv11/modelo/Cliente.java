package atv11.modelo;

public class Cliente {
    private String cpf;
    private String nome;
    private boolean ativo;

    public Cliente(String cpf,String nome, boolean ativo){
        this.cpf = cpf;
        this.nome = nome;
        this.ativo = ativo;
    }
    public String getCpf(){ return cpf;}
    public String getNome(){ return nome;}
    public boolean getAtivo(){ return ativo;}

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
