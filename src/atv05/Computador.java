package atv05;

public class Computador {
    private String patrimonio;
    private int memoriaRAM;
    private boolean ligado;

    public Computador(String patrimonio, int memoriaRAM){
        this.patrimonio = patrimonio;
        this.memoriaRAM = memoriaRAM;
        this.ligado = false;
    }
    public String getPatrimonio(){
        return patrimonio;
    }
    public int getMemoriaRAM(){
        return memoriaRAM;
    }
    public boolean getligado(){
        return ligado;
    }
    public void setPatrimonio(String patrimonio){
        this.patrimonio = patrimonio;
    }
    public void setMemoriaRAM(int memoriaRAM){
        if(memoriaRAM > 0) {
            this.memoriaRAM = memoriaRAM;
        }
    }
    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }
}
