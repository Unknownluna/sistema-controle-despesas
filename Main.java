import java.util.Scanner;

/**
 * Sistema de Controle de Despesas
 * Classe principal com menu de navegação
 * Versão: 0.0.1
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    System.out.println("\n>>> Funcionalidade: Entrar Despesa");
                    System.out.println("Esta funcionalidade permitirá cadastrar uma nova despesa.\n");
                    break;
                case 2:
                    System.out.println("\n>>> Funcionalidade: Anotar Pagamento");
                    System.out.println("Esta funcionalidade permitirá registrar o pagamento de uma despesa.\n");
                    break;
                case 3:
                    System.out.println("\n>>> Funcionalidade: Listar Despesas em Aberto no período");
                    System.out.println("Esta funcionalidade exibirá todas as despesas pendentes.\n");
                    break;
                case 4:
                    System.out.println("\n>>> Funcionalidade: Listar Despesas Pagas no período");
                    System.out.println("Esta funcionalidade exibirá todas as despesas já pagas.\n");
                    break;
                case 5:
                    System.out.println("\n>>> Funcionalidade: Gerenciar Tipos de Despesa");
                    System.out.println("Esta funcionalidade permitirá criar, editar e excluir tipos de despesa.\n");
                    break;
                case 6:
                    System.out.println("\n>>> Funcionalidade: Gerenciar Usuários");
                    System.out.println("Esta funcionalidade permitirá cadastrar e gerenciar usuários do sistema.\n");
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
        System.out.println("========================================");
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
}
