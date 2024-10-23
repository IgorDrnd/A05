import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SistemaPessoa extends JFrame {
 
    public SistemaPessoa() {
        setTitle("Sistema de Pessoa");
        setSize(600, 400); // Adjust window size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window
        initComponents(); // Initialize GUI components
    }

  
    private void initComponents() {
  
        JMenuBar menuBar = new JMenuBar();

     
        JMenu cadastroMenu = new JMenu("Cadastro");
        JMenuItem usuariosItem = new JMenuItem("Usuários");
        JMenuItem pessoasItem = new JMenuItem("Pessoas");
        cadastroMenu.add(usuariosItem);
        cadastroMenu.add(pessoasItem);

        JMenu visualizacaoMenu = new JMenu("Visualização");
        JMenuItem listaUsuariosItem = new JMenuItem("Lista de Usuário");
        JMenuItem listaPessoasItem = new JMenuItem("Lista de Pessoas");
        visualizacaoMenu.add(listaUsuariosItem);
        visualizacaoMenu.add(listaPessoasItem);

    
        JMenu sairMenu = new JMenu("Sair");
        sairMenu.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {
                System.exit(0);
            }

            @Override
            public void menuDeselected(MenuEvent e) {}

            @Override
            public void menuCanceled(MenuEvent e) {}
        });

      
        menuBar.add(cadastroMenu);
        menuBar.add(visualizacaoMenu);
        menuBar.add(sairMenu);

      
        setJMenuBar(menuBar);

     
        JPanel footer = new JPanel(new BorderLayout());
        JLabel footerLabel = new JLabel("Versão: 12.1.2024    Usuário: denys.silva    Data de acesso: 20/09/2024 10:58", JLabel.CENTER);
        footer.add(footerLabel, BorderLayout.SOUTH);


        add(footer, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
     
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SistemaPessoa().setVisible(true);
            }
        });
    }
}

