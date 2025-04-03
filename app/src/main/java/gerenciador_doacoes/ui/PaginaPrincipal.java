
package gerenciador_doacoes.ui;

import java.util.Scanner;

public class PaginaPrincipal {
    public void MostrarMenu() {
        System.out.println("""
                ---------
                MENU
                1. Cadastrar doação
                2. Listar doações
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
                break;
            case 2:
                System.out.println("Listar doações");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
         }
      } catch (Exception e) {
        System.out.println("Erro ao ler a opção!");
    }
    }

}