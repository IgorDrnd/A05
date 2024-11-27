import java.awt.*;
import javax.swing.*;

public class CadastroUsuario {

    // Construtor principal - Criação do formulário completo com todos os campos
    public CadastroUsuario(JFrame principal) {
        this(principal, true);  // Chama a versão com parâmetros opcionais
    }

    // Método sobrecarregado - Criação do formulário com campos personalizados
    public CadastroUsuario(JFrame principal, boolean camposCompletos) {
        this(principal, camposCompletos, "Cadastro de Usuários");  // Chama outra versão que também aceita o título
    }

    // Método sobrecarregado - Criação do formulário com campos personalizados e título personalizado
    public CadastroUsuario(JFrame principal, boolean camposCompletos, String tituloFormulario) {
        JDialog cadastroUsuarios = new JDialog(principal, tituloFormulario, true);
        cadastroUsuarios.setSize(600, 300);
        cadastroUsuarios.setLayout(new BorderLayout());

        JLabel titulo = new JLabel(tituloFormulario, SwingConstants.CENTER);
        cadastroUsuarios.add(titulo, BorderLayout.NORTH);

        JPanel painelCampos = new JPanel(new GridLayout(4, 2, 5, 5));

        // Campos essenciais
        painelCampos.add(new JLabel("Usuário:"));
        painelCampos.add(new JTextField(25));
        painelCampos.add(new JLabel("Senha:"));
        painelCampos.add(new JPasswordField(15));

        // Se camposCompletos for true, adiciona campos extras
        if (camposCompletos) {
            painelCampos.add(new JLabel("Email:"));
            painelCampos.add(new JTextField(30));
            painelCampos.add(new JLabel("Ativo:"));
            JRadioButton radioAtivo = new JRadioButton();
            painelCampos.add(radioAtivo);
        }

        // Painel de botões
        JPanel painelBotoes = BotoesCrud.criarPainelBotoes(cadastroUsuarios);

        cadastroUsuarios.add(painelCampos, BorderLayout.CENTER);
        cadastroUsuarios.add(painelBotoes, BorderLayout.SOUTH);
        cadastroUsuarios.setLocationRelativeTo(principal);
        cadastroUsuarios.setVisible(true);
    }
}
