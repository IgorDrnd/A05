import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;

public class SistemaPessoa {

    public static void main(String[] args) {
        // Inicialização com o construtor padrão
        new SistemaPessoa();
    }

    // Construtor padrão: usa valores padrão para inicializar o sistema
    public SistemaPessoa() {
        this("Sistema Pessoa", "denys.silva", "12.1.2024");
    }

    // Construtor sobrecarregado: permite personalizar o título da janela
    public SistemaPessoa(String tituloJanela) {
        this(tituloJanela, "denys.silva", "12.1.2024");
    }

    // Construtor sobrecarregado: permite personalizar o título, o usuário e a
    // versão do sistema
    public SistemaPessoa(String tituloJanela, String nomeUsuario, String versaoSistema) {
        iniciarSistema(tituloJanela, nomeUsuario, versaoSistema);
    }

    // Método auxiliar para encapsular a lógica de inicialização
    private void iniciarSistema(String tituloJanela, String nomeUsuario, String versaoSistema) {
        // Formata a data de acesso
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy HH:mm");
        String dataAcesso = dateFormat.format(new Date());

        // Criação do frame principal
        JFrame principal = new JFrame(tituloJanela);
        principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        principal.setSize(800, 800);

        // Criação da barra de menu
        JMenuBar menuPrincipal = new JMenuBar();
        JMenu menuCadastro = new JMenu("Cadastro");
        JMenu menuVisualizacao = new JMenu("Visualização");
        JMenu menuSair = new JMenu("Sair");

        // Listener para fechar o sistema
        menuSair.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuSelected(javax.swing.event.MenuEvent e) {
                System.exit(0);
            }

            public void menuDeselected(javax.swing.event.MenuEvent e) {
            }

            public void menuCanceled(javax.swing.event.MenuEvent e) {
            }
        });

        // Adiciona menus à barra de menu
        menuPrincipal.add(menuCadastro);
        menuPrincipal.add(menuVisualizacao);
        menuPrincipal.add(menuSair);

        // Itens de menu para cadastro
        JMenuItem itemMenuCadastroUsuarios = new JMenuItem("Usuários");
        JMenuItem itemMenuCadastroPessoas = new JMenuItem("Pessoas");
        menuCadastro.add(itemMenuCadastroUsuarios);
        menuCadastro.add(itemMenuCadastroPessoas);

        // Itens de menu para visualização
        JMenuItem itemMenuVisualizacaoListaUsuarios = new JMenuItem("Lista de usuários");
        JMenuItem itemMenuVisualizacaoListaPessoas = new JMenuItem("Lista de pessoas");
        menuVisualizacao.add(itemMenuVisualizacaoListaUsuarios);
        menuVisualizacao.add(itemMenuVisualizacaoListaPessoas);

        // Área de trabalho no centro
        JTextArea areaTrabalho = new JTextArea();

        // Painel e rodapé
        JPanel painelRodape = new JPanel();
        JLabel labelRodape = new JLabel(
                "Versão: " + versaoSistema + "    Usuário: " + nomeUsuario + "    Data de acesso: " + dataAcesso);
        painelRodape.add(labelRodape);

        // Adiciona componentes ao frame principal
        principal.getContentPane().add(BorderLayout.NORTH, menuPrincipal);
        principal.getContentPane().add(BorderLayout.CENTER, areaTrabalho);
        principal.getContentPane().add(BorderLayout.SOUTH, painelRodape);

        // Listeners para abrir as janelas correspondentes
        itemMenuCadastroUsuarios.addActionListener(e -> new CadastroUsuario(principal));
        itemMenuCadastroPessoas.addActionListener(e -> new CadastroPessoa(principal));
        itemMenuVisualizacaoListaUsuarios.addActionListener(e -> new ListaUsuario(principal));
        itemMenuVisualizacaoListaPessoas.addActionListener(e -> new ListaPessoa(principal));

        // Centraliza a janela e a torna visível
        principal.setLocationRelativeTo(null);
        principal.setVisible(true);
    }
}
