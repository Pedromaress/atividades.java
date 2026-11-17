package atv22;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaTabelaGerencia extends JFrame {
    private JTextField txtPlaca;
    private JTextField txtModelo;
    private JTextField txtDiaria;
    private JButton btnAdicionar;
    private JButton btnRemove;

    // Componentes Tabela
    private JTable tabelaFrota;
    private DefaultTableModel modeloTabela;

    public TelaTabelaGerencia() {
        setTitle("Atv22 - Tabela Dinamica");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        //adicionando o JPanel com o "FlowLayout.LEFT"
        JPanel painelControle = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));

        //adicionando o campo de colocar a placa
        painelControle.add(new JLabel("Placa:"));
        txtPlaca = new JTextField(7);
        painelControle.add(txtPlaca);

        //adicionando o campo de colocar o modelo
        painelControle.add(new JLabel("Modelo:"));
        txtModelo = new JTextField(10);
        painelControle.add(txtModelo);

        //adicionando o campo de colocar a diária
        painelControle.add(new JLabel("Diária:"));
        txtDiaria = new JTextField(6);
        painelControle.add(txtDiaria);

        //adicionando o botao para adicionar
        btnAdicionar = new JButton("Adicionar a Tabela");
        painelControle.add(btnAdicionar);

        btnRemove = new JButton("Remover Veiculo Selecionado");
        painelControle.add(btnRemove);

        add(painelControle, BorderLayout.NORTH);

        // 2. CONFIGURAÇÃO DA TABELA (CENTRO)
        // Definindo as colunas da tabela
        String[] colunas = {"Placa", "Modelo", "Valor Diária (R$)"};

        modeloTabela = new DefaultTableModel(colunas, 0);
        tabelaFrota = new JTable(modeloTabela);
        add(tabelaFrota, BorderLayout.CENTER);

        // Envolve a tabela em um JScrollPane para permitir rolagem
        JScrollPane scrollTabela = new JScrollPane(tabelaFrota);
        add(scrollTabela, BorderLayout.CENTER);

        btnAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String placa = txtPlaca.getText().trim();
                String modelo = txtModelo.getText().trim();
                String diaria = txtDiaria.getText().trim();

                if (placa.isEmpty() || modelo.isEmpty() || diaria.isEmpty()) {
                    JOptionPane.showMessageDialog(TelaTabelaGerencia.this,
                            "Preencha todos os campos antes de adicionar!",
                            "Aviso", JOptionPane.WARNING_MESSAGE);

                } else {
                    //Adiciona uma nova linha com os dados digitados ao modelo da tabela
                    Object[] novaLinha = {placa, modelo, "R$ " + diaria};
                    modeloTabela.addRow(novaLinha);

                    // Limpa os campos após a inserção
                    txtPlaca.setText("");
                    txtModelo.setText("");
                    txtDiaria.setText("");
                    txtPlaca.requestFocus();
                }
            }
        });
        btnRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int linha = tabelaFrota.getSelectedRow();

                if (linha != -1) {
                    modeloTabela.removeRow(linha);
                } else {
                    JOptionPane.showMessageDialog(  TelaTabelaGerencia.this,
                            "Selecione um veículo para remover!",
                            "Aviso",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaTabelaGerencia().setVisible(true);
            }
        });
    }
}
