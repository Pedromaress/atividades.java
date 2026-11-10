package atv16.Servico;
import atv16.modelo.Carro;
import atv16.modelo.Moto;
import atv16.modelo.Veiculo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GravadorDeFrota {
    private static final String NOME_ARQUIVO = "frota_salva.txt";

    public static void exportarFrota(ArrayList<Veiculo> frota){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(NOME_ARQUIVO, true))){
            String Linha = "";
            for(Veiculo v : frota){

                if (v instanceof Carro) {
                    Carro carro = (Carro) v;
                    Linha = "Carro," + carro.getPlaca() + ","
                            + carro.getModelo() + ","
                            + carro.getValorDiaria() + ","
                            + carro.getNumeroPortas();
                }else{
                    Moto moto = (Moto) v;
                    Linha = "Moto," + moto.getPlaca() + ","
                            + moto.getModelo() + ","
                            + moto.getValorDiaria() + ","
                            + moto.getCilindradas();
                }
                bw.write(Linha);
                bw.newLine();

            }
        }catch(IOException e){
            System.out.println("Erro ao salvar frota!");
        }
    }

}
