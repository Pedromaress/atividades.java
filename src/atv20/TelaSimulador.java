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
    private JTextArea txtQtdDias;
    private JLabel lblDias;

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
        txtQtdDias = new JTextArea();
        btnCalcular = new JButton("Calcular Aluguel");
        lblTitulo = new JLabel("CADASTRO RÁPIDO DE VEÍCULOS");
        lblDias = new JLabel("Qtd de Dias:");

        // Posicionando os componentes usando o  " setBounds"
        lblPlaca.setBounds(30, 40, 100, 30);
        txtPlaca.setBounds(110, 40, 200, 30);
        btnCalcular.setBounds(130, 150, 120, 30);
        lblTitulo.setBounds(80, 10, 250, 25);
        txtQtdDias.setBounds(110,90,200,30);
        lblDias.setBounds(30,90,100,30);
        // Adicionando na janela
        add(lblPlaca);
        add(txtPlaca);
        add(btnCalcular);
        add(lblTitulo);
        add(txtQtdDias);
        add(lblDias);
        //Adicionando evento de clique ao botão (Ação)
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    /*to fazendo a minha variável "dias" receber o que vem da caixa "txtQtdDias"
                    "Integer.parseInt" serve pra transformar uma string em um int
                    "txtQtdDias.getText()" serve pra pegar o texto da caixa "txtQrdDias"*/
                    int dias = Integer.parseInt(txtQtdDias.getText());

                    //verifico se o valor de dias é  válido
                    if(dias <=0){
                        JOptionPane.showMessageDialog(null,
                                "Informe uma quantidade de dias válida!");
                        return;
                    }

                    double valorTotal = 100 * dias;

                    //esse comando "JOptionPane.showMessageDialog" é para aprecer uma outra telinha com oq desejar, tipo aviso ou outra coisa...
                    JOptionPane.showMessageDialog(null,
                            "Quantidade de dias: " + dias +
                                    "\nValor da diária: R$ 100,00" +
                                    "\nValor total: R$ " + valorTotal);

                //catch caso oq o usuário tenha escrito não for número
                }catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(null,"Digite um número  válido!");
                }
            }
        });
    }

    public static void main(String[] args) {

        //ultilizo pra iniciar/usar a interface "setVisible(true)" tem q botar true para que a interface fique visível
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaSimulador().setVisible(true);
            }
        });

    }
}