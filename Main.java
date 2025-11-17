import java.util.Scanner;

/**
 * Sistema de Controle de Despesas
 * Classe principal com menu de navegação e integração com MVP
 * Versão: 0.0.2
 */
public class Main {
    private static GerenciadorDespesas gerenciador = new GerenciadorDespesas();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = 0;

        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    entrarDespesa();
                    break;
                case 2:
                    anotarPagamento();
                    break;
                case 3:
                    listarDespesasPendentes();
                    break;
                case 4:
                    listarDespesasPagas();
                    break;
                case 5:
                    gerenciarTiposDespesa();
                    break;
                case 6:
                    gerenciarUsuarios();
                    break;
                case 7:
                    System.out.println("\n>>> Encerrando o sistema. Até logo!");
                    break;
                default:
                    System.out.println("\n>>> Opção inválida! Tente novamente.\n");
            }
        } while (opcao != 7);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n========================================");
        System.out.println("   SISTEMA DE CONTROLE DE DESPESAS");
        System.out.println("========================================");
        System.out.println("1. Entrar Despesa");
        System.out.println("2. Anotar Pagamento");
        System.out.println("3. Listar Despesas em Aberto no período");
        System.out.println("4. Listar Despesas Pagas no período");
        System.out.println("5. Gerenciar Tipos de Despesa");
        System.out.println("6. Gerenciar Usuários");
        System.out.println("7. Sair");
        System.out.println("========================================");
    }

    private static void entrarDespesa() {
        System.out.println("\n>>> CADASTRAR NOVA DESPESA");
        
        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();
        
        System.out.print("Valor: R$ ");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Limpar buffer
        
        System.out.print("Categoria: ");
        String categoria = scanner.nextLine();
        
        gerenciador.cadastrarDespesa(descricao, valor, categoria);
    }

    private static void anotarPagamento() {
        System.out.println("\n>>> REGISTRAR PAGAMENTO");
        
        // Primeiro, listar despesas pendentes
        gerenciador.listarDespesasPendentes();
        
        System.out.print("\nInforme o ID da despesa a ser paga: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer
        
        gerenciador.registrarPagamento(id);
    }

    private static void listarDespesasPendentes() {
        System.out.println("\n>>> DESPESAS EM ABERTO");
        gerenciador.listarDespesasPendentes();
        
        System.out.println("\nDeseja realizar alguma ação?");
        System.out.println("1. Excluir despesa");
        System.out.println("2. Voltar ao menu principal");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();
        
        if (opcao == 1) {
            System.out.print("Informe o ID da despesa a excluir: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            gerenciador.excluirDespesa(id);
        }
    }

    private static void listarDespesasPagas() {
        System.out.println("\n>>> DESPESAS PAGAS");
        gerenciador.listarDespesasPagas();
        
        System.out.println("\nDeseja realizar alguma ação?");
        System.out.println("1. Excluir despesa");
        System.out.println("2. Voltar ao menu principal");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();
        
        if (opcao == 1) {
            System.out.print("Informe o ID da despesa a excluir: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            gerenciador.excluirDespesa(id);
        }
    }

    private static void gerenciarTiposDespesa() {
        System.out.println("\n>>> GERENCIAR TIPOS DE DESPESA");
        System.out.println("Esta funcionalidade será implementada na próxima versão.");
        System.out.println("Por enquanto, você pode usar categorias livres ao cadastrar despesas.\n");
        
        // Funcionalidade de relatório por categoria
        System.out.print("Deseja ver um relatório por categoria? (S/N): ");
        String resposta = scanner.nextLine();
        
        if (resposta.equalsIgnoreCase("S")) {
            System.out.print("Informe a categoria: ");
            String categoria = scanner.nextLine();
            gerenciador.relatorioPorCategoria(categoria);
        }
    }

    private static void gerenciarUsuarios() {
        System.out.println("\n>>> GERENCIAR USUÁRIOS");
        System.out.println("Esta funcionalidade será implementada em versões futuras.");
        System.out.println("Incluirá cadastro de usuários, login e criptografia de senhas.\n");
    }
}
