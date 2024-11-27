import java.awt.*;
import javax.swing.*;

public class MenuPrincipal {

    // Construtor padrão: utiliza valores padrão
    public MenuPrincipal() {
        this("Sistema Pessoa", "Versão: " + ConfiguracoesSistema.VERSAO_SISTEMA +
                " | Usuário: " + ConfiguracoesSistema.NOME_USUARIO +
                " | Data de acesso: " + ConfiguracoesSistema.DATA_ACESSO);
    }

    // Construtor sobrecarregado: permite definir o título da janela
    public MenuPrincipal(String tituloJanela) {
        this(tituloJanela, "Versão: " + ConfiguracoesSistema.VERSAO_SISTEMA +
                " | Usuário: " + ConfiguracoesSistema.NOME_USUARIO +
                " | Data de acesso: " + ConfiguracoesSistema.DATA_ACESSO);
    }

    // Construtor sobrecarregado: permite definir o título e o rodapé
    public MenuPrincipal(String tituloJanela, String textoRodape) {
        criarInterface(tituloJanela, textoRodape);
    }

    // Método auxiliar para criar a interface
    private void criarInterface(String tituloJanela, String textoRodape) {
        // Criação do frame principal
        JFrame principal = new JFrame(tituloJanela);
        principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        principal.setSize(800, 800);

        // Criação da barra de menu
        JMenuBar menuPrincipal = new JMenuBar();

        // Criação e adição das opções de menu
        JMenu menuCadastro = new JMenu("Cadastro");
        JMenu menuVisualizacao = new JMenu("Visualização");

        JMenu menuSair = new JMenu("Sair");
        menuSair.addMenuListener(new javax.swing.event.MenuListener() {
            @Override
            public void menuSelected(javax.swing.event.MenuEvent e) {
                System.exit(0); // Sai do sistema
            }

            @Override
            public void menuDeselected(javax.swing.event.MenuEvent e) {
            }

            @Override
            public void menuCanceled(javax.swing.event.MenuEvent e) {
            }
        });

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

        // Painel e label do rodapé
        JPanel painelRodape = new JPanel();
        JLabel labelRodape = new JLabel(textoRodape);
        painelRodape.add(labelRodape);

        // Adiciona componentes ao frame principal
        principal.getContentPane().add(BorderLayout.NORTH, menuPrincipal);
        principal.getContentPane().add(BorderLayout.CENTER, areaTrabalho);
        principal.getContentPane().add(BorderLayout.SOUTH, painelRodape);

        principal.setLocationRelativeTo(null); // Centraliza a janela
        principal.setVisible(true); // Torna a janela visível
    }
}
