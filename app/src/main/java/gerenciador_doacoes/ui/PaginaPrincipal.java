
package gerenciador_doacoes.ui;

import java.util.List;
import java.util.Scanner;

import gerenciador_doacoes.domain.ControleDoacoes;
import gerenciador_doacoes.ui.menu.PaginaCadastrarPessoa;
import gerenciador_doacoes.ui.menu.PaginaCadastros;

public class PaginaPrincipal {

    public void MostrarMenuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        int opcaoPrincipal;

        do {
            System.out.println("""
                    ------------------------
                    SELECIONAR PERFIL
                    1. Perfil Doador
                    2. Perfil Necessitado
                    3. Perfil Administrativo
                    4. Sair do Programa
                    ------------------------
                    """);
            System.out.print("Escolha uma opção de perfil: ");

            try {
                opcaoPrincipal = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha

                switch (opcaoPrincipal) {
                    case 1:
                        MostrarMenuDoador(scanner); // Passa o scanner para evitar múltiplos fechamentos
                        break;
                    case 2:
                        System.out.println("Você selecionou o Perfil Necessitado. (Menu em desenvolvimento)");
                        // Chamar o menu do necessitado aqui
                        break;
                    case 3:
                        System.out.println("Você selecionou o Perfil Administrativo. (Menu em desenvolvimento)");
                        // Chamar o menu administrativo aqui
                        break;
                    case 4:
                        System.out.println("Saindo do programa...");
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, tente novamente.");
                        break;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.nextLine(); // Limpar a entrada inválida
                opcaoPrincipal = 0; // Para garantir que o loop continue
            } catch (Exception e) {
                System.out.println("Ocorreu um erro: " + e.getMessage());
                opcaoPrincipal = 0; // Para garantir que o loop continue
            }
            System.out.println(); // Linha em branco para melhor leitura
        } while (opcaoPrincipal != 4);

        scanner.close(); // Fecha o scanner quando o programa realmente termina
    }

    public void MostrarMenuDoador(Scanner scanner) {
        int opcaoDoador;
        do {
            System.out.println("""
                    ---------
                    MENU DOADOR
                    1. Cadastrar doação
                    2. Listar doações
                    3. Voltar ao menu principal
                    ---------
                    """);
            System.out.print("Escolha uma opção: ");
            try {
                opcaoDoador = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha

                switch (opcaoDoador) {
                    case 1:
                        System.out.println("Cadastrar doação");
                        PaginaCadastrarPessoa paginaCadastrarPessoa = new PaginaCadastrarPessoa();
                        paginaCadastrarPessoa.exibir();
                        break;
                    case 2:
                        System.out.println("Listar doações");
                        PaginaCadastros paginaCadastros = new PaginaCadastros();
                        paginaCadastros.Listar();
                        break;
                    case 3:
                        System.out.println("Voltando ao menu principal...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.nextLine(); // Limpar a entrada inválida
                opcaoDoador = 0; // Para garantir que o loop continue
            } catch (Exception e) {
                System.out.println("Erro ao ler a opção: " + e.getMessage());
                opcaoDoador = 0; // Para garantir que o loop continue
            }
        

        }

            public void MostrarMenuNecessitado(Scanner scanner) {
        int opcaoDoador;
        do {
            System.out.println("""
                    ---------
                    MENU DOADOR
                    1. Cadastrar pedido
                    2. Listar pedidos
                    3. Voltar ao menu principal
                    ---------
                    """);
            System.out.print("Escolha uma opção: ");
            try {
                opcaoDoador = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha

                switch (opcaoDoador) {
                    case 1:
                        System.out.println("Cadastrar pedido");
                        /* 
                        PaginaCadastrarPessoa paginaCadastrarPessoa = new PaginaCadastrarPessoa();
                        paginaCadastrarPessoa.exibir();*/

                        // Aqui fazer a mesma coisa, onde vai cadastrar a pessoa + a outra coisa,
                        //que nesse caso é o pedido
                        break;
                    case 2:
                        System.out.println("Listar pedidos");
                        PaginaCadastros paginaCadastros = new PaginaCadastros();
                        paginaCadastros.Listar();
                        break;
                    case 3:
                        System.out.println("Voltando ao menu principal...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.nextLine(); // Limpar a entrada inválida
                opcaoDoador = 0; // Para garantir que o loop continue
            } catch (Exception e) {
                System.out.println("Erro ao ler a opção: " + e.getMessage());
                opcaoDoador = 0; // Para garantir que o loop continue
            }
        } while (opcaoDoador != 3);
    }
}
