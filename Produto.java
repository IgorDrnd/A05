public class Produto {
    private String codigo;
    private String descricao;
    private boolean ativo;
    private double preco;

    public Produto(String codigo, String descricao, boolean ativo, double preco) {
        this.codigo = codigo;
        this.descricao = descricao.toUpperCase();
        this.ativo = ativo;
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return String.format("%-6s %-50s %10.2f", codigo, descricao, preco);
    }
}
