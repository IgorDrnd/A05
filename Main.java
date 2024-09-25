import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cardapio cardapio = new Cardapio();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Alterar Produto");
            System.out.println("3. Excluir Produto");
            System.out.println("4. Exibir Cardápio");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Código: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Descrição: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Ativo (true/false): ");
                    boolean ativo = scanner.nextBoolean();
                    System.out.print("Preço: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine();
                    cardapio.cadastrarProduto(new Produto(codigo, descricao, ativo, preco));
                    break;
                case 2:
                    System.out.print("Código do produto a alterar: ");
                    String codigoAlterar = scanner.nextLine();
                    System.out.print("Ativo (true/false): ");
                    boolean ativoNovo = scanner.nextBoolean();
                    System.out.print("Novo preço: ");
                    double precoNovo = scanner.nextDouble();
                    scanner.nextLine();
                    cardapio.alterarProduto(codigoAlterar, ativoNovo, precoNovo);
                    break;
                case 3:
                    System.out.print("Código do produto a excluir: ");
                    String codigoExcluir = scanner.nextLine();
                    cardapio.excluirProduto(codigoExcluir);
                    break;
                case 4:
                    cardapio.exibirCardapio();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
