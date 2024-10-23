import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class AcessoAplicativo extends JFrame {
    private JTextField usuarioField;
    private JPasswordField senhaField;

    public AcessoAplicativo() {
        setTitle("Acesso ao Sistema");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(3, 2));

        JLabel usuarioLabel = new JLabel("Usuário:");
        usuarioField = new JTextField();

        JLabel senhaLabel = new JLabel("Senha:");
        senhaField = new JPasswordField();

        JButton confirmarButton = new JButton("Confirmar");
        JButton cancelarButton = new JButton("Cancelar");

        add(usuarioLabel);
        add(usuarioField);
        add(senhaLabel);
        add(senhaField);
        add(confirmarButton);
        add(cancelarButton);

        confirmarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = usuarioField.getText();
                String senha = new String(senhaField.getPassword());

                if (usuario.equals("denys.silva") && senha.equals("Teste@2024")) {
                    JOptionPane.showMessageDialog(null, "Acesso confirmado!");
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário ou senha inválido!");
                }
            }
        });

        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AcessoAplicativo().setVisible(true);
            }
        });
    }
}
