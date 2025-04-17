
package gerenciador_doacoes.ui;

import java.util.List;
import java.util.Scanner;

import gerenciador_doacoes.ui.menu.PaginaCadastrarPessoa;
import gerenciador_doacoes.ui.menu.PaginaCadastros;

public class PaginaPrincipal {

    
    public void MostrarMenu() {
        System.out.println("""
                ---------
                MENU
                1. Cadastrar doação
                2. Listar doações
                3. Sair
                ---------
                """);
        Scanner abacaxi = new Scanner(System.in);
        System.out.print("Escolha uma opção: ");
    try { 
        int opcao = abacaxi.nextInt();
        abacaxi.nextLine();


        switch (opcao) {
            case 1:
                System.out.println("Cadastrar doação");
                PaginaCadastrarPessoa paginaCadastrarPessoa = new PaginaCadastrarPessoa();
                paginaCadastrarPessoa.exibir();
                break;
            case 2:
                System.out.println("Listar doações");
                // Aqui você pode chamar o método de listar doações
                PaginaCadastros paginaCadastros = new PaginaCadastros();
                paginaCadastros.Listar();
                break;
            case 3:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
         }
      } catch (Exception e) {
        System.out.println("Erro ao ler a opção!");
    } abacaxi.close();
    } 

}