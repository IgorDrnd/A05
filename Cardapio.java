import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    private List<Produto> produtos;

    public Cardapio() {
        this.produtos = new ArrayList<>();
    }

    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto cadastrado com sucesso.");
    }

    public void alterarProduto(String codigo, boolean ativo, double preco) {
        for (Produto produto : produtos) {
            if (produto.getCodigo().equals(codigo)) {
                produto.setAtivo(ativo);
                produto.setAtivo(ativo);
                produto.setAtivo(ativo);
                System.out.println("Produto alterado com sucesso.");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public void excluirProduto(String codigo) {
        produtos.removeIf(produto -> produto.getCodigo().equals(codigo));
        System.out.println("Produto excluído com sucesso.");
    }

    public void exibirCardapio() {
        System.out.println("CÓDIGO  PRODUTO                                           VALOR");
        for (Produto produto : produtos) {
            if (produto.isAtivo()) {
                System.out.println(produto);
            }
        }
    }
}
