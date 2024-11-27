import java.awt.*;
import javax.swing.*;

public class ListaPessoa {

    // Construtor padrão: usa o título e o conteúdo padrão
    public ListaPessoa(JFrame principal) {
        this(principal, "Lista de Pessoas", "Exemplo de lista de pessoas...");
    }

    // Construtor sobrecarregado: permite personalizar o título
    public ListaPessoa(JFrame principal, String titulo) {
        this(principal, titulo, "Exemplo de lista de pessoas...");
    }

    // Construtor sobrecarregado: permite personalizar o título e o conteúdo
    public ListaPessoa(JFrame principal, String titulo, String conteudo) {
        JDialog listaPessoas = new JDialog(principal, titulo, true);
        listaPessoas.setSize(750, 650);
        listaPessoas.setLayout(new BorderLayout());

        listaPessoas.add(new JLabel(titulo, SwingConstants.CENTER), BorderLayout.NORTH);
        listaPessoas.add(new JTextArea(conteudo), BorderLayout.CENTER);

        JButton btnFechar = new JButton("Fechar");
        btnFechar.addActionListener(e -> listaPessoas.setVisible(false));
        listaPessoas.add(btnFechar, BorderLayout.SOUTH);

        listaPessoas.setLocationRelativeTo(principal);
        listaPessoas.setVisible(true);
    }
}
