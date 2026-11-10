
package atv16.Servico;

import atv16.modelo.Veiculo;
import java.io.*;
import java.util.ArrayList;

public class GerenciadorSerializacao {

    private static final String NOME_ARQUIVO = "frota_serializada.dat";

    /* Método para salvar a lista inteira de veículos de uma só vez */
    public static void salvarFrota(ArrayList<Veiculo> listaFrota) {

        /* Inicializa o ObjectOutputStream para gravar os objetos no arquivo */
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(NOME_ARQUIVO))) {

            oos.writeObject(listaFrota);

            System.out.println("Frota serializada e salva com sucesso em arquivo binário!");

        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo binário: " + e.getMessage());
        }
    }

    /* Método para carregar a lista de veículos do arquivo binário */
    @SuppressWarnings("unchecked")
    public static ArrayList<Veiculo> carregarFrota() {

        File arquivo = new File(NOME_ARQUIVO);

        if (!arquivo.exists()) {
            System.out.println("Nenhum arquivo de salvamento prévio encontrado. Iniciando frota vazia.");
            return new ArrayList<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(NOME_ARQUIVO))) {

            ArrayList<Veiculo> listaCarregada =
                    (ArrayList<Veiculo>) ois.readObject();

            System.out.println("Frota desserializada com sucesso!");

            return listaCarregada;

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao ler o arquivo binário: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
