package atv21;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaSimuladorAvancado extends JFrame {
    private JTextField txtQtdDias;
    private JComboBox<String> cbTipoVeiculo;
    private JButton btnAdicionar;

    // Componentes de exibição e rolagem
    private DefaultListModel<String> modeloLista;
    private JList<String> listVeiculos;


    public TelaSimuladorAvancado() {
        //dando um título para interface
        setTitle("Tela Simulador avançado");
        //tamanho da interface
        setSize(400, 300);
        //Comando abaixo serve para encerrar o programa após fechar a interface constante=EXIT_ON_CLOSE
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //fazendo a interface começar no centro da tela
        setLocationRelativeTo(null);

        // 1. Utilizando BorderLayout como estrutura principal
        setLayout(new BorderLayout(10, 10));

        // PAINEL SUPERIOR (NORTE): Form com FlowLayout
        JPanel painelEntrada = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));


        /*criando o vetor de strings dos tipos e criando e adicionando o JComboBbox com o tipo que temos no vetor*/
        painelEntrada.add(new JLabel("Tipo:"));
        String[] tipos = {"Econômico - R$ 80/dia", "Intermediário - R$ 130/dia", "Executivo - R$ 220/dia"};
        cbTipoVeiculo = new JComboBox<>(tipos);
        painelEntrada.add(cbTipoVeiculo);

        //criando o text fild para o txtQtdDias
        painelEntrada.add(new JLabel("Quantidade de Dias:"));
        txtQtdDias = new JTextField(12);
        painelEntrada.add(txtQtdDias);

        btnAdicionar = new JButton("Calcular aluguel");
        painelEntrada.add(btnAdicionar);


        // Adiciona o painel de entrada no TOPO (NORTH) da janela
        add(painelEntrada, BorderLayout.NORTH);

        // PAINEL CENTRAL (CENTRO): Lista com Barra de Rolagem+
        modeloLista = new DefaultListModel<>();
        listVeiculos = new JList<>(modeloLista);
        JScrollPane scrollLista = new JScrollPane(listVeiculos);

        // Adiciona a lista com rolagem no CENTRO da janela (ocupa todo o espaço restante)
        add(scrollLista, BorderLayout.CENTER);

        btnAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dias = txtQtdDias.getText();
                String tipo = (String) cbTipoVeiculo.getSelectedItem();
                int indice = cbTipoVeiculo.getSelectedIndex();
                int quantidadeDias = Integer.parseInt(dias);

                if (dias.isEmpty()) {
                    JOptionPane.showMessageDialog(TelaSimuladorAvancado.this,
                            "Por favor, informe o modelo do veículo!",
                            "Aviso", JOptionPane.WARNING_MESSAGE);
                } else {
                    //verifico se o dias são maior que 0
                    if (quantidadeDias <= 0) {
                        JOptionPane.showMessageDialog(TelaSimuladorAvancado.this,
                                "Informe uma quantidade de dias maior que zero!");
                        return;
                    }
                    //entro no switch fazendo os calculos de acordo com o oq o usuario digita
                    double total = 0;
                    switch (indice){
                        case 0:
                            /* Econômico - R$ 80 por dia*/
                           total = quantidadeDias * 80;
                           break;

                        case 1:
                            /* Intermediário - R$ 130 por dia*/
                            total = quantidadeDias * 130;
                            break;

                        case 2:
                            /*Executivo - R$ 220 por dia*/
                            total = quantidadeDias * 220;
                            break;
                    }
                    // Monta o texto com o resultado
                    String resultado = tipo + " / " + quantidadeDias +
                            " dias -> Total: R$ " + String.format("%.2f", total);

                    // Adiciona o resultado na JList
                    modeloLista.addElement(resultado);
                }
            }
        });
    }

    public static void main(String[] args) {
        //ultilizo pra iniciar/usar a interface "setVisible(true)" tem q botar true para que a interface fique visível
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaSimuladorAvancado().setVisible(true);
            }
        });
    }
}
