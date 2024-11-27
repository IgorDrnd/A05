import java.awt.*;
import javax.swing.*;

public class CadastroPessoa {

    // Construtor principal - Criação do formulário completo com todos os campos
    public CadastroPessoa(JFrame principal) {
        this(principal, true);  // Chama a versão com parâmetros opcionais
    }

    // Método sobrecarregado - Criação do formulário com campos personalizados
    public CadastroPessoa(JFrame principal, boolean camposCompletos) {
        JDialog cadastroPessoas = new JDialog(principal, "Cadastro de Pessoa", true);
        cadastroPessoas.setSize(600, 300);
        cadastroPessoas.setLayout(new BorderLayout());

        JLabel titulo = new JLabel("Cadastro de Pessoa", SwingConstants.CENTER);
        cadastroPessoas.add(titulo, BorderLayout.NORTH);

        JPanel painelCampos = new JPanel(new GridLayout(7, 2, 5, 5));

        // Campos essenciais
        painelCampos.add(new JLabel("Nome:"));
        painelCampos.add(new JTextField(40));
        painelCampos.add(new JLabel("Email:"));
        painelCampos.add(new JTextField(30));

        // Se camposCompletos for true, adiciona campos extras
        if (camposCompletos) {
            painelCampos.add(new JLabel("Endereço:"));
            painelCampos.add(new JTextField(60));
            painelCampos.add(new JLabel("Cidade:"));
            painelCampos.add(new JTextField(40));
            painelCampos.add(new JLabel("UF:"));
            painelCampos.add(new JTextField(2));
            painelCampos.add(new JLabel("Telefone:"));
            painelCampos.add(new JTextField(20));
            painelCampos.add(new JLabel("Sexo:"));
            JComboBox<String> comboSexo = new JComboBox<>(new String[]{"Masculino", "Feminino"});
            painelCampos.add(comboSexo);
        }

        // Painel de botões
        JPanel painelBotoes = BotoesCrud.criarPainelBotoes(cadastroPessoas);

        cadastroPessoas.add(painelCampos, BorderLayout.CENTER);
        cadastroPessoas.add(painelBotoes, BorderLayout.SOUTH);
        cadastroPessoas.setLocationRelativeTo(principal);
        cadastroPessoas.setVisible(true);
    }

    // Método sobrecarregado - Criação do formulário com apenas campos essenciais
    public CadastroPessoa(JFrame principal, boolean camposCompletos, String tituloFormulario) {
        JDialog cadastroPessoas = new JDialog(principal, tituloFormulario, true);
        cadastroPessoas.setSize(600, 300);
        cadastroPessoas.setLayout(new BorderLayout());

        JLabel titulo = new JLabel(tituloFormulario, SwingConstants.CENTER);
        cadastroPessoas.add(titulo, BorderLayout.NORTH);

        JPanel painelCampos = new JPanel(new GridLayout(7, 2, 5, 5));

        // Campos essenciais
        painelCampos.add(new JLabel("Nome:"));
        painelCampos.add(new JTextField(40));
        painelCampos.add(new JLabel("Email:"));
        painelCampos.add(new JText
