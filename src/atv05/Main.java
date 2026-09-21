package atv05;

import atv06.Produto;

public class Main {
    public static void main(String[] args) {
     Computador comp1 = new Computador("comp1", 2);
     Computador comp2 = new Computador("comp2", 1);

        comp1.setMemoriaRAM(-1);
        System.out.println("Patrimonio:" + comp1.getPatrimonio());
        System.out.println("Memoria RAM:" + comp1.getMemoriaRAM());
        System.out.println("Ligado: " +comp1.getligado());
    }
}
