package atv20;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaSimulador extends JFrame {
    private JLabel lblPlaca;
    private JTextField txtPlaca;
    private JButton btnCalcular;
    private JLabel lblTitulo;
    private JTextArea txtArea;

    public TelaSimulador() {
        //dando um título para interface
        setTitle("Sistema frota - Cadastro Visual");
        //tamanho da interface
        setSize(400, 300);
        //Comando abaixo serve para encerrar o programa após fechar a interface constante=EXIT_ON_CLOSE
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //fazendo a interface começar no centro da tela
        setLocationRelativeTo(null);
        /*obriga a ter que coloar a localização dos compontes que criar;
         esse comando é necessario para não acontecer algum bug no tamanho/layout dos componentes com a interface*/
        setLayout(null);

        /* cria componete->posiciona o componente->add componente */

        //Criando os componentes
        lblPlaca = new JLabel("Digite a placa:");
        txtPlaca = new JTextField();
        btnCalcular = new JButton("Cadastrar veículo");
        lblTitulo = new JLabel("CADASTRO RÁPIDO DE VEÍCULOS");


        // Posicionando os componentes usando o  " setBounds"
        lblPlaca.setBounds(30, 40, 100, 30);
        txtPlaca.setBounds(110, 40, 200, 30);
        btnCalcular.setBounds(130, 100, 120, 30);
        lblTitulo.setBounds(80, 10, 250, 25);


        // Adicionando na janela
        add(lblPlaca);
        add(txtPlaca);
        add(btnCalcular);
        add(lblTitulo);

        //Adicionando evento de clique ao botão (Ação)

    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaSimulador().setVisible(true);
            }
        });

    }
}