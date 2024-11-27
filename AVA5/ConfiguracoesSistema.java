import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConfiguracoesSistema {
    public static final String VERSAO_SISTEMA = "12.1.2024";
    public static final String NOME_USUARIO = "denys.silva";
    public static final DateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yy HH:mm");
    public static final String DATA_ACESSO = DATE_FORMAT.format(new Date());

    // Método sobrecarregado: Retorna a versão do sistema
    public static String obterConfiguracao(String configuracao) {
        switch (configuracao) {
            case "versao":
                return VERSAO_SISTEMA;
            case "usuario":
                return NOME_USUARIO;
            case "dataAcesso":
                return DATA_ACESSO;
            default:
                return "Configuração não encontrada!";
        }
    }

    // Método sobrecarregado: Retorna a versão do sistema
    public static String obterConfiguracao(String configuracao, boolean formatarData) {
        if ("dataAcesso".equals(configuracao)) {
            // Se for "dataAcesso", usa o método formatado conforme o booleano
            return formatarData ? DATE_FORMAT.format(new Date()) : DATA_ACESSO;
        } else {
            // Para outras configurações, chama o método simples
            return obterConfiguracao(configuracao);
        }
    }

    // Método para formatar e retornar uma data personalizada
    public static String obterConfiguracao(String configuracao, Date dataPersonalizada) {
        if ("dataAcesso".equals(configuracao) && dataPersonalizada != null) {
            // Retorna a data formatada usando uma data personalizada
            DateFormat customFormat = new SimpleDateFormat("dd/MM/yy HH:mm");
            return customFormat.format(dataPersonalizada);
        } else {
            return obterConfiguracao(configuracao); // Chama o método padrão para outros casos
        }
    }

    // Método para obter todas as configurações como uma string
    public static String obterTodasConfiguracoes() {
        return "Versão: " + VERSAO_SISTEMA + " | Usuário: " + NOME_USUARIO + " | Data de Acesso: " + DATA_ACESSO;
    }
}
