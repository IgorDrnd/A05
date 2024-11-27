import java.awt.*;
import javax.swing.*;

public class BotoesCrud {

    // Método principal: cria os botões com comportamento padrão
    public static JPanel criarPainelBotoes(JDialog dialog) {
        JPanel painelBotoes = new JPanel(new FlowLayout());
        String[] labels = {"Incluir", "Alterar", "Excluir", "Consultar", "Cancelar", "Sair"};
        
        for (String label : labels) {
            JButton button = new JButton(label);
            
            if (label.equals("Sair")) {
                button.addActionListener(e -> acaoBotaoSair(dialog));  // Usando método específico para "Sair"
            } else if (label.equals("Cancelar")) {
                button.addActionListener(e -> acaoBotaoCancelar(dialog));  // Usando método específico para "Cancelar"
            } else {
                button.addActionListener(e -> acaoBotao(dialog, label));  // Usando sobrecarga para ações genéricas
            }
            
            painelBotoes.add(button);
        }
        return painelBotoes;
    }

// Método de ação para botões "Incluir", "Alterar", "Excluir", "Consultar"
public static void acaoBotao(JDialog dialog, String acao) {
        JOptionPane.showMessage
